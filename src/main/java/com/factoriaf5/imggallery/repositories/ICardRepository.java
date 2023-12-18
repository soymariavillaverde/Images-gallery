package com.factoriaf5.imggallery.repositories;

import com.factoriaf5.imggallery.models.CardModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ICardRepository extends JpaRepository<CardModel, Long> {
    
}