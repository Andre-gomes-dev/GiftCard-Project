package br.com.giftproject.controller;

import br.com.giftproject.model.CarrinhoCompras;
import br.com.giftproject.model.TipoGift;
import br.com.giftproject.repository.CarrinhoComprasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.*;


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
    public ResponseEntity<CarrinhoCompras> criandoCarrinho(@RequestParam(required = false ) boolean finalizarTransacao, 
                                                           @RequestBody CarrinhoCompras carrinhoCompras , UriComponentsBuilder uriComponentsBuilder){
            
            List<CarrinhoCompras> colecao = new ArrayList<>();
            colecao.forEach(x -> {
                carrinhoCompras.multiplicarTotal();
            });
            carrinhoRepository.save(carrinhoCompras);
           URI uri = uriComponentsBuilder.path("/carrinhocompra/criacarrinho/{id}").buildAndExpand(carrinhoCompras.getId()).toUri();
        return  ResponseEntity.created(uri).body(carrinhoCompras);
    }

//(ResponseEntity<CarrinhoCompras>) ResponseEntity.created()

}
