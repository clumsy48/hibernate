package hibernate_inheritance;

import hibernate_inheritance.entity.BlogPost;
import hibernate_inheritance.entity.Book;
import hibernate_inheritance.entity.Publication;
import hibernate_inheritance.repository.PublicationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@SpringBootApplication
public class Application implements CommandLineRunner {

    private final PublicationRepository repository;

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        Book p1 = new Book();
        p1.setPages(12);
        p1.setPublishingDate(Date.from(Instant.now()));
        p1.setTitle("Welcome to hibernate inheritance");
        p1.setVersion(1);
        BlogPost p2 = new BlogPost();
        p2.setUrl("https://github.com/clumsy48");
        p2.setPublishingDate(Date.from(Instant.now()));
        p2.setTitle("Welcome to hibernate inheritance");
        p2.setVersion(1);
        repository.save(p1);
        repository.save(p2);
        List<Publication> list = repository.findAll();
        System.out.println(list.toArray());
        repository.save(p1);
        repository.save(p2);
    }
}
