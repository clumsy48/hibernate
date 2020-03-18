package hibernate_inheritance.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@NoArgsConstructor
public class BlogPost extends Publication {
    private String url;
}
