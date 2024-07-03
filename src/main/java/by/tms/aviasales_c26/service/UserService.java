package by.tms.aviasales_c26.service;

import by.tms.aviasales_c26.entity.User;
import by.tms.aviasales_c26.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;



@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         return userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(username));
    }


    public void save(User user) {
        user.setPassword(new BCryptPasswordEncoder(11).encode(user.getPassword()));
        userRepository.save(user);
    }
}
