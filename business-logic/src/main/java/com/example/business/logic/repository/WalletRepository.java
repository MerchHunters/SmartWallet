package com.example.business.logic.repository;

import com.example.business.logic.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface WalletRepository extends JpaRepository<Wallet, Long> {


    List<Wallet> findByClientId(Long id);
}
