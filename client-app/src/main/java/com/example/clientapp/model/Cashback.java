package com.example.clientapp.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cashback {

    private Long id;

    private String category;

    private Float percent;

    private Set<Wallet> walletSet;

}
