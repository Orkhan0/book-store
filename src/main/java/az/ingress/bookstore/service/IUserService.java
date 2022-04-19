package az.ingress.bookstore.service;

import az.ingress.bookstore.model.User;

import javax.transaction.Transactional;
import java.util.Optional;

public interface IUserService {
    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
    void makePublisher(String username);
}
