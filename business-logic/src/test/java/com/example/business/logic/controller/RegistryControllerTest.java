package com.example.business.logic.controller;

import com.example.business.logic.dto.RegistrationDataDTO;
import com.example.business.logic.dto.ResponseDTO;
import com.example.business.logic.model.Client;
import com.example.business.logic.repository.ClientRepository;
import com.example.business.logic.repository.WalletRepository;
import com.example.business.logic.service.ClientService;
import com.example.business.logic.service.WalletService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@WebMvcTest
public class RegistryControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @InjectMocks
    RegistryController registryController;

    @SpyBean
    ClientService clientService;

    @MockBean
    ClientRepository clientRepository;

    @MockBean
    WalletService walletService;

    RegistrationDataDTO registrationDataDTO;



    @BeforeEach
    void init() {
        clientService = new ClientService(clientRepository, walletService);
        registryController = new RegistryController(clientService);
        registrationDataDTO = new RegistrationDataDTO(
                "login", "password"
        );
    }

    @Test
    void postUserByDTO() {
        ResponseDTO dataDTO = new ResponseDTO(200, 1234L);
        ResponseEntity<ResponseDTO> ok = ResponseEntity.ok(dataDTO);

        Client client = new Client();
        client.setId(1234L);
        when(clientRepository.save(any())).thenReturn(client);
        ResponseEntity<?> result = registryController.postUserByDTO(registrationDataDTO);

        Assertions.assertEquals(ok, result);
    }


}
