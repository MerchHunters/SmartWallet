package com.example.clientapp.config;

import com.example.clientapp.client.AuthorizationClientService;
import com.example.clientapp.client.WalletRestCLienService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {



    @Bean
    public WalletRestCLienService clientRestRegistrationData(@Value("${api.path.server}") String uri){
        return new WalletRestCLienService(RestClient.builder().baseUrl(uri).build());
    }

    @Bean
    public AuthorizationClientService authorizationClientService(@Value("${api.path.server}") String uri) {
        return new AuthorizationClientService(RestClient.builder().baseUrl(uri).build());
    }
}
