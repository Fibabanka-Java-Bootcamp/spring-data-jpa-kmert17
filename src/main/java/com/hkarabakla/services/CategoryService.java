package com.hkarabakla.services;

import com.hkarabakla.entities.Book;
import com.hkarabakla.entities.Category;
import com.hkarabakla.repositories.CategoryRepo;
import com.hkarabakla.repositories.BookRepo;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CategoryService {

    private final CategoryRepo categoryRepo;
    private final BookRepo bookRepo;

    public CategoryService(CategoryRepo categoryRepo, BookRepo bookRepo) {
        this.categoryRepo = categoryRepo;
        this.bookRepo = bookRepo;
    }

    public void categoryOperations() {

        Book b1 = new Book();
        b1.setIsbn(UUID.randomUUID().toString());
        b1.setName("Lectures on Physics");

        Book b2 = new Book();
        b2.setIsbn(UUID.randomUUID().toString());
        b2.setName("Lectures on Maths");

        Set<Book> bookie = new HashSet<Book>();
        bookie.add(b1);
        bookie.add(b2);
        Category c1 = new Category();
        c1.setName("Physics");
        c1.setBooks(bookie);

        categoryRepo.save(c1);
        bookRepo.save(b1);

        System.out.println(c1);
        System.out.println(b1);
    }
}
