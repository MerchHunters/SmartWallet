package com.example.clientapp.client;

import com.example.clientapp.dto.RegistrationDataDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClient;


@Slf4j
public class AuthorizationDataClient {

    private final RestClient restClient;
    @Autowired
    public AuthorizationDataClient(RestClient restClient) {
        this.restClient = restClient;
    }


    public Long sendDataRegistration(RegistrationDataDTO registrationDataDTO) {
        log.info("Скорее всего забыл заменить uri");
        return restClient.post().uri("/main/registration").contentType(MediaType.APPLICATION_JSON).body(registrationDataDTO).retrieve().body(Long.class);
    }
}
