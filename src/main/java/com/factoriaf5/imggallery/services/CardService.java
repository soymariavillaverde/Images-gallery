package com.factoriaf5.imggallery.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factoriaf5.imggallery.models.CardModel;
import com.factoriaf5.imggallery.repositories.ICardRepository;

@Service
public class CardService {
 
    // esto sirve para inyección de dependencias
    @Autowired
    ICardRepository cardRepository;

    public ArrayList<CardModel> getImages(){
        return (ArrayList<CardModel>) cardRepository.findAll();
    }

    public CardModel saveCard(CardModel card){
            return cardRepository.save(card);
    }

    public java.util.Optional<CardModel> getImageById(Long id){
        // optional permite que este método pueda devolver algo, o bien ser null
        return cardRepository.findById(id);
    }

}
