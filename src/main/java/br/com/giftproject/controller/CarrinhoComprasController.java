package br.com.giftproject.controller;

import br.com.giftproject.model.CarrinhoCompras;
import br.com.giftproject.model.TipoGift;
import br.com.giftproject.model.security.Usuario;
import br.com.giftproject.repository.CarrinhoComprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;



@RestController
@RequestMapping("/carrinhocompra")
public class CarrinhoComprasController {

    @Autowired
    private CarrinhoComprasRepository carrinhoRepository;

        @GetMapping("/devolvetipos")
            public List<TipoGift> devolveTiposGift() {
            return new ArrayList<>(Arrays.asList(TipoGift.values()));
        }

    @PostMapping()
    public ResponseEntity<CarrinhoCompras> criandoCarrinho(@RequestParam(required = false ) boolean finalizarTransacao, CarrinhoCompras carrinhoCompras , UriComponentsBuilder uriComponentsBuilder){

            carrinhoRepository.save()
           URI uri = uriComponentsBuilder.path("/carrinhocompra").buildAndExpand()
        return (ResponseEntity<CarrinhoCompras>) ResponseEntity.created();
    }



}
