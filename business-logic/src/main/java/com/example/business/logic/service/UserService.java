package com.example.business.logic.service;


import com.example.business.logic.exception.PasswordNotCorrectException;
import com.example.business.logic.model.User;
import com.example.business.logic.repository.UserRepository;
import jakarta.validation.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findByLoginAndPassword(String login, String password) {
        return userRepository.findByLoginAndPassword(login, password);
    }

    public Long CreateByLoginAndPassword(String login, String password, String repeatPassword) {
        if (password.equals(repeatPassword)) {
            User user = new User();
            user.setLogin(login);
            user.setPassword(password);
            return userRepository.save(user).getId();
        }
        throw new PasswordNotCorrectException("Passwords not equals");
    }

}
