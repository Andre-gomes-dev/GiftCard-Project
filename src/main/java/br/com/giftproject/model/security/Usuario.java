package br.com.giftproject.model.security;

import br.com.giftproject.model.CarrinhoCompras;

import javax.persistence.*;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Embedded
    private DadosLogin dadosLogin;

    @OneToOne
    private CarrinhoCompras carrinhoGift;


    public Usuario() {
    }

    public Usuario(Long id, String nome, DadosLogin dadosLogin) {
        this.id = id;
        this.nome = nome;
        this.dadosLogin = dadosLogin;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
