package br.com.giftproject.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(value = EnumType.STRING)
    private TipoGift tipoGift;
   private  int estoque;

    public Produto(){

    }

    public Produto(TipoGift tipoGift, int estoque) {
        this.tipoGift = tipoGift;
        this.estoque = estoque;
    }
}
