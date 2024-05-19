package com.example.clientapp.controller.wallet;


import com.example.clientapp.client.WalletRestCLienService;
import com.example.clientapp.model.Client;
import com.example.clientapp.model.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main/list")
public class WalletList {


    private final WalletRestCLienService walletRestCLienService;


    @Autowired
    public WalletList(WalletRestCLienService walletRestCLienService) {
        this.walletRestCLienService = walletRestCLienService;
    }

    @GetMapping
    public String getWalletList(Model model){
        model.addAttribute("wallets", walletRestCLienService.findAllWallets());
        return "main/wallet/wallet_list_page";
    }


   /* @GetMapping
    public String testGetWallet(Model model){
        Wallet wallet = new Wallet();
        model.addAttribute("wallets", walletRestCLienService.findAllWallets());
        return "main/wallet_list_page";
    }*/

}
