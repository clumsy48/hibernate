package hibernate_inheritance.entity;

import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name = "BlogPost")
@DiscriminatorValue("BlogPost")
@Setter
public class BlogPost extends Publication{
    private String url;
}