package br.com.giftproject.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Bag {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Integer quantidade;//quantidade de gifts comprados de determinado tipo.


    @Enumerated(value = EnumType.STRING)
    private TipoGift tipoGift;//Enum -> constantes da marca gift a ser adquirida.
    private Double valorGift;//100,50,30


    public Bag() {
    }

    public Bag(Integer quantidade, Double valor, TipoGift tipoGift) {
        this.quantidade = quantidade;
        this.valorGift = valor;
        this.tipoGift = tipoGift;

    }




}
