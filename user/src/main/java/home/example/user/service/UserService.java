package home.example.user.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import home.example.domain.User;
import home.example.user.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    public Collection<User> findAll() {
        List<User> result = new ArrayList<>();
        userRepository.findAll().forEach(user -> result.add(user));

        return result;
    }

    @Override
    public User find(String username) {
        Optional<User> optionalUser = userRepository.findById(username);
        optionalUser.orElseThrow(() -> new RuntimeException("User not found"));

        return optionalUser.get();
    }

    @Override
    public void create(User user) {
        userRepository.save(user);

        LOG.info("User was created: " + user.getUsername());
    }

}
