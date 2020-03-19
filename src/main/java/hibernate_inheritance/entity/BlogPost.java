package hibernate_inheritance.entity;

import javax.persistence.Entity;

@Entity(name = "BlogPost")
public class BlogPost extends Publication{
    private String url;
}
