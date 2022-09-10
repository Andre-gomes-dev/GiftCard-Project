package br.com.giftproject.model;

import br.com.giftproject.model.security.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class CarrinhoGift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Autowired
    @OneToOne
    private Usuario usuario;

    
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
}
