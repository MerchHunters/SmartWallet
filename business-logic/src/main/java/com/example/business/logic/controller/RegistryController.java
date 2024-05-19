package com.example.business.logic.controller;


import com.example.business.logic.dto.RegistrationDataDTO;
import com.example.business.logic.dto.ResponseDTO;
import com.example.business.logic.exception.AlreadyThereIsLoginException;
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
@RequestMapping("main")
@Slf4j
public class RegistryController {

    private final ClientService clientService;

    @Autowired
    public RegistryController(ClientService clientService) {
        this.clientService = clientService;
    }

    /**
     *
     * @param dto
     * @param uriComponentsBuilder
     * @return все хорошо - dto (200, clientId) <br>
     * пароль уже есть - (401, -1L)<br>
     * уже логин есть - (402, -1L)
     */

    @PostMapping("/registration")
    public ResponseEntity<?> postUserByDTO(@Valid @RequestBody RegistrationDataDTO dto,
                                           UriComponentsBuilder uriComponentsBuilder) {

        try {
            Long body = clientService.CreateByLoginAndPassword(
                    dto.getLogin(), dto.getPassword(), dto.getRepeatPassword()
            );
            ResponseDTO dataDTO = new ResponseDTO(200, body);
            return ResponseEntity.ok(dataDTO);
        } catch (PasswordNotCorrectException e) {
            log.info("return not correct password!");
            ResponseDTO dataDTO = new ResponseDTO(401, -1L);
            return ResponseEntity.ok(dataDTO);
        } catch (AlreadyThereIsLoginException e) {
            log.info("return other login");
            return ResponseEntity.ok(new ResponseDTO(402, -1L));
        }

    }


//    @GetMapping("/main/getAllWallets")
//    public ResponseEntity<?> getAllWallets(@RequestParam Long clientId) {
//
//        Collection<Wallet> allWallets = clientService.getAllWallets(clientId);
//        return ResponseEntity.ok(allWallets);
//
//    }


    @GetMapping("/getAllWallets")
    public Collection<Wallet> getAllWallets(@RequestParam("clientId") Long clientId) {

        Collection<Wallet> allWallets = clientService.getAllWallets(clientId);
        return allWallets;

    }


//    @GetMapping
//    public Long lds() {
//        return 1L;
//    }
}
