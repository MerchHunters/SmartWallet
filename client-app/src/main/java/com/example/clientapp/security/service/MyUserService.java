package com.example.clientapp.security.service;

import com.example.clientapp.security.model.MyUser;
import com.example.clientapp.security.repository.MyUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MyUserService {

    private final MyUserRepository myUserRepository;

    public MyUser findByUser(String username) throws UsernameNotFoundException {
        return myUserRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(username));
    }

    public void save(MyUser myUser){
        myUserRepository.save(myUser);
    }
}

