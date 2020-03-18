package hibernate_inheritance.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@NoArgsConstructor
public class Book extends Publication {
    private int pages;
}
