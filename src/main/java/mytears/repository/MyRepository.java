package mytears.repository;

import mytears.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class MyRepository implements JpaRepository<User, Integer> {
}
