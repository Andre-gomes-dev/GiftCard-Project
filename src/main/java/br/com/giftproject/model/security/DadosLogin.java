package br.com.giftproject.model.security;

import javax.persistence.Embeddable;
import javax.persistence.Entity;


@Embeddable
public class DadosLogin {


    private String email;
    private String senha;

    public DadosLogin() {

    }

    public DadosLogin(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }




}
