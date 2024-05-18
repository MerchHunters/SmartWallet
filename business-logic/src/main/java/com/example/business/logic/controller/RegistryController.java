package com.example.business.logic.controller;


import com.example.business.logic.dto.RegistrationDataDTO;
import com.example.business.logic.dto.ResponseDTO;
import com.example.business.logic.exception.PasswordNotCorrectException;
import com.example.business.logic.model.Wallet;
import com.example.business.logic.service.ClientService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Collection;

@RestController
@RequestMapping("main/registration")
@Slf4j
public class RegistryController {

    private final ClientService clientService;

    @Autowired
    public RegistryController(ClientService clientService) {
        this.clientService = clientService;
    }


    @PostMapping("main/registration")
    public ResponseEntity<?> postUserByDTO(@Valid @RequestBody RegistrationDataDTO dto,
                                           UriComponentsBuilder uriComponentsBuilder) {

        try {
            return ResponseEntity.ok(clientService.CreateByLoginAndPassword(
                    dto.getLogin(), dto.getPassword(), dto.getRepeatPassword()
            ));
        } catch (PasswordNotCorrectException e) {
            log.info("return not correct password!");
            ResponseDTO dataDTO = new ResponseDTO(400, 1);
            return ResponseEntity.badRequest().body(dataDTO);
        }

    }


//    @GetMapping("/main/getAllWallets")
//    public ResponseEntity<?> getAllWallets(@RequestParam Long clientId) {
//
//        Collection<Wallet> allWallets = clientService.getAllWallets(clientId);
//        return ResponseEntity.ok(allWallets);
//
//    }


    @GetMapping(/*"/main/getAllWallets"*/)
    public Collection<Wallet> getAllWallets(@RequestParam("clientId") Long clientId) {

        Collection<Wallet> allWallets = clientService.getAllWallets(clientId);
        return allWallets;

    }


//    @GetMapping
//    public Long lds() {
//        return 1L;
//    }
}
