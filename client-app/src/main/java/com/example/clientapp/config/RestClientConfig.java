package com.example.clientapp.config;

import com.example.clientapp.client.AuthorizationDataClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

    @Bean
    public AuthorizationDataClient clientRestRegistrationData(@Value("${api.path.server}") String uri){
        return new AuthorizationDataClient(RestClient.builder().baseUrl(uri).build());
    }

}
