package com.example.clientapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wallet {

    private Long id;


    private Client client;

    private String name;

    private String description;

    private Boolean isArchive;

    private Set<Cashback> cashbackes;

    private Set<Transaction> transactions;
}
