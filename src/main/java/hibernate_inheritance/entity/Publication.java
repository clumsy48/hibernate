package hibernate_inheritance.entity;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public abstract class Publication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    protected Long id;

    @Column
    protected String title;

    @Version
    @Column(name = "version")
    private int version;

    @Column
    @Temporal(TemporalType.DATE)
    private Date publishingDate;
}
