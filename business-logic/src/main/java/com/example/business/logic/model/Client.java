package com.example.business.logic.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name = "clients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Long id;


    private String login;

    private String password;

    @Column(name = "wallets")
    @OneToMany(mappedBy = "client")
//    @JsonIgnore
    private Set<Wallet> wallets;
}
