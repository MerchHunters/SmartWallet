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
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wallet_id")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    private String name;

    private String description;

    @Column(name = "is_archive")
    private Boolean isArchive;

/*    @ManyToMany
    @JoinTable(
            name = "cashbackes",
            joinColumns = @JoinColumn(name = "wallet_id"),
            inverseJoinColumns = @JoinColumn(name = "cashback_id"))
    private Set<Cashback> cashbackes;*/
}
