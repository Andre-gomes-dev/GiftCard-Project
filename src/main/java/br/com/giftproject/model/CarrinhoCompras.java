package br.com.giftproject.model;

import br.com.giftproject.model.security.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@Entity
public class CarrinhoCompras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int valorGift;
    @Autowired
    @OneToOne
    private Usuario usuario;

    public CarrinhoCompras() {
    }

    public CarrinhoCompras(int valorGift, TipoGift tipoGift) {
        this.valorGift = valorGift;
        this.tipoGift = tipoGift;
    }

    private TipoGift tipoGift;
    //user
    public Usuario getUsuario() {
        return usuario;
    }
    //atributos da classe
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public CarrinhoCompras inserirValor(TipoGift tipoGift){
        List<CarrinhoCompras> listaDeCompras = new ArrayList<>();
        listaDeCompras.forEach((val) -> listaDeCompras.addAll());
        return new CarrinhoCompras()
    }
}
