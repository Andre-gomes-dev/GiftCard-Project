package br.com.giftproject.model;

import br.com.giftproject.model.security.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.*;

@Entity
public class CarrinhoCompras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Autowired
    @OneToOne
    private Usuario usuario;


    private Integer quantidade;

    private Double valorGift;

    private TipoGift tipoGift;

    public CarrinhoCompras() {
    }

    public CarrinhoCompras(Integer quantidade, Double valor, TipoGift tipoGift) {
        this.quantidade = quantidade;
        this.valorGift = valor;
        this.tipoGift = tipoGift;
    }

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


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getValorGift() {
        return valorGift;
    }

    public void setValorGift(Double valor) {
        this.valorGift = valor;
    }

//    public CarrinhoCompras inserirValor(){
//        Set<CarrinhoCompras> listaDeCompras = new HashSet<>();
//        for (CarrinhoCompras val : listaDeCompras) {
//            val += getValorGift();
//        }
//
//        return new CarrinhoCompras()
//   }

    public Double multiplicarTotal(){
        return getQuantidade() * getValorGift();
    }
}
