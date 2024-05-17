package com.example.business.logic.service;


import com.example.business.logic.model.User;
import com.example.business.logic.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByLoginAndPassword(String login, String password) {
        return userRepository.findByLoginAndPassword(login, password);
    }

    public Long CreateByLoginAndPassword(String login, String password) {

        User user = new User();
        user.setLogin(login);
        user.setPassword(password);
        return userRepository.save(user).getId();

    }

}
