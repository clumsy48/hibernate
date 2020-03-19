package hibernate_inheritance.entity;

import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "Book")
@DiscriminatorValue("Book")
@Setter
public class Book extends Publication {
    private int pages;
}
