package com.example.business.logic.service;


import com.example.business.logic.exception.PasswordNotCorrectException;
import com.example.business.logic.model.Client;
import com.example.business.logic.model.Wallet;
import com.example.business.logic.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Set;

@Service
public class ClientService {

    private final ClientRepository userRepository;

    private final WalletService walletService;

    @Autowired
    public ClientService(ClientRepository clientRepository, WalletService walletService) {
        this.userRepository = clientRepository;
        this.walletService = walletService;
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

        Client firstById = userRepository.findFirstById(clientId);

        Collection<Wallet> wallets = walletService.findByClientId(firstById.getId());

//        Set<Wallet> wallets = firstById.getWallets();
        return wallets;

    }
}
