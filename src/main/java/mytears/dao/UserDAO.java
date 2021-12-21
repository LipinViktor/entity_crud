package mytears.dao;

import mytears.model.User;
import mytears.repository.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserDAO {

    private final MyRepository myRepository;

    @Autowired
    public UserDAO(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public List<User> findAll() {
        return myRepository.findAll();
    }

    public User findOne(int id) {
        Optional<User> foundPerson = myRepository.findById(id);
        return foundPerson.orElse(null);
    }

    public void save(User user) {
        myRepository.save(user);
    }

    public void update(int id, User updatedUser) {
        updatedUser.setId(id);
        myRepository.save(updatedUser);
    }

    public void delete(int id) {
        myRepository.deleteById(id);
    }
}
