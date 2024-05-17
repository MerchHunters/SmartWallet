package com.example.clientapp.controller.wallet;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main/wallet")
public class WalletController {


    @GetMapping()
    public String getWalletListPage(){
        return "main/wallet/wallet_list";
    }
}
