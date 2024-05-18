package com.example.clientapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    private Long id;


    private String login;

    private String password;

//    @JsonIgnore
    private Set<Wallet> wallets;
}
