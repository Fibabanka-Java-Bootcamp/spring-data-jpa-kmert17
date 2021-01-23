package com.hkarabakla.services;

import com.hkarabakla.entities.Address;
import com.hkarabakla.entities.Book;
import com.hkarabakla.entities.Order;
import com.hkarabakla.entities.User;
import com.hkarabakla.repositories.BookRepo;
import com.hkarabakla.repositories.OrderRepo;
import com.hkarabakla.repositories.UserRepo;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Component
public class UserService {

    private final UserRepo repo;
    private final OrderRepo orderRepo;
    private final BookRepo bookRepo;


    public UserService(UserRepo repo, OrderRepo orderRepo, BookRepo bookRepo) {
        this.repo = repo;
        this.orderRepo = orderRepo;
        this.bookRepo = bookRepo;
    }

    public void userOperations() {
        User u = new User();
        u.setName("user");

        Order ord1 = new Order();
        ord1.setCreated_at(LocalDate.now());

        Set<Book> bandini1 = new HashSet<Book>();
        Book booky1 = new Book();
        booky1.setIsbn(UUID.randomUUID().toString());
        booky1.setName("Short History of Time");
        bandini1.add(booky1);
        ord1.setBooky(bandini1);

        User u2 = new User();
        u2.setName("bandini");
        Set<Order> ordua1 = new HashSet<Order>();
        ordua1.add(ord1);
        u2.setOrders(ordua1);

        repo.save(u2);
        orderRepo.save(ord1);
        bookRepo.save(booky1);

        System.out.println(u2);
        System.out.println(ord1);
        System.out.println(booky1);



        Address address = new Address();
        address.setStreet("Gazo sokak");
        address.setNumber("7");
        address.setCity("Istanbul");

        u.setAddress(address);

        repo.save(u);

        System.out.println(u.getId());

        System.out.println("User: " + repo.findAllByNameContainingIgnoreCase("se"));
    }
}
