package hibernate_inheritance.entity;

import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Setter
public class BlogPost extends Publication {
    private String url;
}
