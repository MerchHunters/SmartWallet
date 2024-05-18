package com.example.clientapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {


    private Long id;

//    @Column(name = "wallet_id")
//    private Wallet walletId;

    private String category;

    private Integer amount;

    private LocalDateTime dateTime;

    private String description;


    private Boolean isWithCashback;



    private Wallet wallet;

}
