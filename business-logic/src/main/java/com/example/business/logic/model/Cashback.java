package com.example.business.logic.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cashback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cashback_id")
    private Long id;

    private String category;

    private Float percent;

    @ManyToMany(mappedBy = "cashbackes")
    private Set<Wallet> walletSet;

}
