package com.example.clientapp.client;

import com.example.clientapp.dto.RegistrationDataDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ProblemDetail;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClient;

import java.util.List;


// регестрация
// Service
@Slf4j
public class AuthorizationDataClient {

    private final RestClient restClient;

    @Autowired
    public AuthorizationDataClient(RestClient restClient) {
        this.restClient = restClient;
    }


    public Long sendDataRegistration(RegistrationDataDTO registrationDataDTO) {

        try {
            return restClient.post().uri("/main/registration").contentType(MediaType.APPLICATION_JSON).body(registrationDataDTO).retrieve().body(Long.class);
        }
        catch (HttpClientErrorException.BadRequest badRequestException) {
          throw  badRequestException;
        }

    }
}
