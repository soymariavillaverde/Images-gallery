package com.factoriaf5.imggallery.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factoriaf5.imggallery.models.CardModel;
import com.factoriaf5.imggallery.repositories.ICardRepository;

@Service
public class CardService {
 
    @Autowired
    ICardRepository cardRepository;

    public ArrayList<CardModel> getImages(){
        return (ArrayList<CardModel>) cardRepository.findAll();
    }

    public CardModel saveCard(CardModel card){
            return cardRepository.save(card);
    }

    public java.util.Optional<CardModel> getCardById(Long id){
        return cardRepository.findById(id);
    }

    public CardModel updateCardById(CardModel request){
        CardModel card = cardRepository.findById(request.getId()).get();

        card.setName(request.getName());
        card.setImg(request.getImg());
        return card;
    }

    public Boolean deleteImg (Long id){
        try{
            cardRepository.deleteById(id);
            return true;

        }catch (Exception e){
            return false;
        }
    }
}
