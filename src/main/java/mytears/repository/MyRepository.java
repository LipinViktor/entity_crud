package mytears.repository;

import mytears.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class MyRepository implements JpaRepository<User, Integer> {
}
