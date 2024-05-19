package com.example.clientapp.client;

import com.example.clientapp.dto.RegistrationDataDTO;
import com.example.clientapp.dto.ResponseDTO;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;


@Service
@RequiredArgsConstructor
@Slf4j
public class AuthorizationClientService {

    private final RestClient restClient;
    public ResponseDTO sendDataRegistration(RegistrationDataDTO dto){
        log.info("{}",dto);
       return restClient.post().uri("/main/registration").contentType(MediaType.APPLICATION_JSON).body(dto).retrieve().body(ResponseDTO.class);
    }
}

