package com.example.business.logic.repository;

import com.example.business.logic.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByLoginAndPassword(String login, String password);

}
