package hibernate_inheritance.entity;

import javax.persistence.Entity;

@Entity(name = "Book")
public class Book extends Publication {
    private int pages;
}
