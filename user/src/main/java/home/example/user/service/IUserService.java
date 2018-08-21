package home.example.user.service;

import java.util.Collection;

import home.example.domain.User;

public interface IUserService {

    Collection<User> findAll();

    User find(String username);

    void create(User user);

}
