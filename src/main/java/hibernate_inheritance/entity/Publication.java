package hibernate_inheritance.entity;

import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "Publication_Type")
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setPublishingDate(Date publishingDate) {
        this.publishingDate = publishingDate;
    }
}
