package com.factoriaf5.imggallery.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.factoriaf5.imggallery.models.CardModel;
import com.factoriaf5.imggallery.services.CardService;




@RestController
@RequestMapping("/images")

public class CardController {
    // aquí voy a definir las peticiones HTTP y las rutas

    @Autowired
    private CardService cardService;

    // este tiene que devolver la vista home
    @GetMapping
    public ArrayList<CardModel> getCards(){
        ArrayList<CardModel> text= new ArrayList<CardModel>();
        return text; // this.cardService.getImages();
    }

    @PostMapping(path = "/add")
    public CardModel saveCard(@RequestBody CardModel card){
        return this.cardService.saveCard(card);
    }
    
    @GetMapping(path = "/{id}")
    public  Optional<CardModel>getImageById(@PathVariable("id") Long id) {
        return this.cardService.getCardById(id);
    }

    @PutMapping(path = "/modify")
    public CardModel updateCardById(@RequestBody CardModel request){
        return this.cardService.updateCardById(request);
    }
    
        @DeleteMapping(path = "/{id}")
    public String deleteCardById(@PathVariable("id") Long id){
        boolean ok = this.cardService.deleteImg(id);

        if(ok){
            return "Image with id " + id + " was succesfully deleted";
        } else {
            return "Oooops, something went wrong and your image with id " + id + " was not deleted";
        }
    }
}
