package br.com.giftproject.model;

import org.springframework.context.annotation.Bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.beans.JavaBean;


public enum TipoGift  {


//    private String valorDoGift;
//
//    TipoGift(String valorDoGift) {
//        this.valorDoGift = valorDoGift;
//    }



    AMAZON,
    GOOGLE_PLAY,
    NETFLIX,
    XBOX,
    PLAYSTATION,
    GIFT_PRESENT;

    //
//    GOOGLE_PLAY(30, 50, 100),
//    NETFLIX(30, 50, 100),
//    XBOX(30, 50, 100),
//    PLAYSTATION(30, 50, 100),
//    GIFT_PRESENT(30, 50, 100);

}

