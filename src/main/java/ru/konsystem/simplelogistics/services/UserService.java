package ru.konsystem.simplelogistics.services;



import ru.konsystem.simplelogistics.model.User;

import java.util.List;

public interface UserService {
    User register(User user);

    List<User> getAll();

    User findByEmail(String email);

    User findByUsername(String username);

    User findUserById(Long id);

    void delete(Long id);
}
