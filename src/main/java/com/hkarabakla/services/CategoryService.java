package com.hkarabakla.services;

import com.hkarabakla.entities.Author;
import com.hkarabakla.entities.Book;
import com.hkarabakla.entities.Category;
import com.hkarabakla.repositories.AuthorRepo;
import com.hkarabakla.repositories.CategoryRepo;
import com.hkarabakla.repositories.BookRepo;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class CategoryService {

    private final CategoryRepo categoryRepo;
    private final BookRepo bookRepo;
    private final AuthorRepo authorRepo;

    public CategoryService(CategoryRepo categoryRepo, BookRepo bookRepo, AuthorRepo authorRepo) {
        this.categoryRepo = categoryRepo;
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
    }

    public void categoryOperations() {

        Author a1 = new Author();
        a1.setName("Aldous Huxley");
        Book o1 = new Book();
        o1.setIsbn(UUID.randomUUID().toString());
        o1.setName("blablabla");
        Book o2 = new Book();
        o2.setIsbn(UUID.randomUUID().toString());
        o2.setName("bliblibli");
        Set<Book> annie = new HashSet<Book>();
        annie.add(o1);
        annie.add(o2);
        a1.setBooks(annie);

        authorRepo.save(a1);

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
        bookRepo.save(o1);
        bookRepo.save(o2);

        System.out.println(c1);
        System.out.println(b1);
    }
}
