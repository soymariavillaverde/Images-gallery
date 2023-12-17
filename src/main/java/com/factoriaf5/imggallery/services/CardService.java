package com.factoriaf5.imggallery.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.factoriaf5.imggallery.models.CardModel;
import com.factoriaf5.imggallery.repositories.ICardRepository;
// import com.google.common.base.Optional;

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

    // metodo get de una sola img
    public java.util.Optional<CardModel> getCardById(Long id){
        // optional permite que este método pueda devolver algo, o bien ser null
        return cardRepository.findById(id);
    }


    // método put
    public CardModel updateCardById(CardModel request){
        CardModel card = cardRepository.findById(request.getId()).get();

        card.setName(request.getName());
        card.setImg(request.getImg());
        return card;
    }

    // método delete
    public Boolean deleteImg (Long id){
        try{
            cardRepository.deleteById(id);
            return true;

        }catch (Exception e){
            return false;
        }
    }
}
