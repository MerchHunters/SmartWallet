package com.example.business.logic.repository;

import com.example.business.logic.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;


public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByLoginAndPassword(String login, String password);

    Client findFirstById(Long clientId);

    Collection<Object> findByLogin(String login);
}
