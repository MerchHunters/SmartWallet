package com.example.clientapp.client;


import com.example.clientapp.model.Wallet;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestClient;

import java.util.Collection;
import java.util.List;
import java.util.Set;


@Slf4j
public class WalletRestCLienService {


    private static final ParameterizedTypeReference<List<Wallet>> WALLET_TYPE_REFERENCE = new ParameterizedTypeReference<List<Wallet>>() {
    };
    private final RestClient restClient;
    @Autowired
    public WalletRestCLienService(RestClient restClient) {
        this.restClient = restClient;
    }


    public List<Wallet> findAllWallets(Long id) {
        List<Wallet> body = restClient.get().uri("/main/registration/clientId=%d".formatted(id)).retrieve().body(WALLET_TYPE_REFERENCE);
        return body;
    }
}
