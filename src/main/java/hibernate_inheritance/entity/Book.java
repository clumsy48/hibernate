package hibernate_inheritance.entity;

import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
public class Book extends Publication {
    private int pages;
}
