package com.example.business.logic.service;

import com.example.business.logic.model.Wallet;
import com.example.business.logic.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Set;

@Service
public class WalletService {

    private final WalletRepository walletRepository;

    @Autowired
    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }


    public Collection<Wallet> findByClientId(Long id) {

        return walletRepository.findByClientId(id);

    }
}
