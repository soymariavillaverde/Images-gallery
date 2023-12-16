package com.factoriaf5.imggallery.controllers;

import com.factoriaf5.imggallery.services.CardService;
import com.factoriaf5.imggallery.models.CardModel;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.ArrayList;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/image")

public class CardController {
    // aquí voy a definir las peticiones HTTP y las rutas

    // @GetMapping("/getImages")
    @Autowired
    private CardService cardService;

    @GetMapping
    public ArrayList<CardModel> getCards(){
        return this.cardService.getImages();
    }

    @PostMapping("path")
    public CardModel saveCard(@RequestBody CardModel card){
        return this.cardService.saveCard(card);
    }
    
}
