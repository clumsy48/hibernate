package hibernate_inheritance.repository;

import hibernate_inheritance.entity.BlogPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost,Long> {
}
