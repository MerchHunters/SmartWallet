package com.example.business.logic.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long id;

//    @Column(name = "wallet_id")
//    private Wallet walletId;

    private String category;

    private Integer amount;

    @Column(name = "date_time")
    private LocalDateTime dateTime;

    private String description;

    @Column(name = "is_with_cashback")
    private Boolean isWithCashback;
}
