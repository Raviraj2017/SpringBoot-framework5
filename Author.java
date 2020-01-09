package com.springfeamework5.SpringFramwork5.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long id;
    private String firstNam;
    private String lastName;

    @ManyToMany
    private Set<Book> books = new HashSet<>();

    public Author() {
    }

    public Author(String firstNam, String lastName, Set<Book> books) {
        this.firstNam = firstNam;
        this.lastName = lastName;
        this.books = books;
    }

    public Author(Long id, String firstNam, String lastName, Set<Book> books) {
        this.id = id;
        this.firstNam = firstNam;
        this.lastName = lastName;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstNam() {
        return firstNam;
    }

    public void setFirstNam(String firstNam) {
        this.firstNam = firstNam;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}

