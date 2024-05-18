package com.example.business.logic.service;


import com.example.business.logic.exception.PasswordNotCorrectException;
import com.example.business.logic.model.Client;
import com.example.business.logic.model.Wallet;
import com.example.business.logic.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class ClientService {

    private final ClientRepository userRepository;

    @Autowired
    public ClientService(ClientRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Client findByLoginAndPassword(String login, String password) {
        return userRepository.findByLoginAndPassword(login, password);
    }

    public Long CreateByLoginAndPassword(String login, String password, String repeatPassword) {
        if (password.equals(repeatPassword)) {
            Client user = new Client();
            user.setLogin(login);
            user.setPassword(password);
            return userRepository.save(user).getId();
        }
        throw new PasswordNotCorrectException("Passwords not equals");
    }

    public Collection<Wallet> getAllWallets(Long clientId) {

        return userRepository.findFirstById(clientId).getWallets();

    }
}
