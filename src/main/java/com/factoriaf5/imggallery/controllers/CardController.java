package com.factoriaf5.imggallery.controllers;

import com.factoriaf5.imggallery.services.CardService;
import com.factoriaf5.imggallery.models.CardModel;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    
    @GetMapping(path = "/{id}")
    public  Optional<CardModel>getImageById(@PathVariable("id") Long id) {
        return this.cardService.getCardById(id);
    }

    @PutMapping(path = "/{id}")
    public CardModel updateCardById(@RequestBody CardModel request, @PathVariable("id") Long id){
        return this.cardService.updateCardById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String CardModel deleteCardById(@PathVariable("id") Long id){
        boolean ok = this.cardService.deleteImg(id);

        if(ok){
            return "Image with id " + id + " was succesfully deleted";
        } else {
            return "Oooops, something went wrong and your image with id " + id + " was not deleted";
        }
    }
}
`