package by.tms.aviasales_c26.service;

import by.tms.aviasales_c26.entity.User;
import by.tms.aviasales_c26.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }

    public User findById(int id) {
        return userRepository.findById(id).orElseThrow();
    }

    public User finByUsername(String username) {
        Optional<User> user = userRepository.findByUserName(username);
        return user.orElseThrow();
    }
}
