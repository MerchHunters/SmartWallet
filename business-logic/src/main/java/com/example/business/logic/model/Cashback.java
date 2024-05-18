package com.example.business.logic.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private String percent;

    @ManyToMany(mappedBy = "cashbackes")
    private Wallet wallet;

}
