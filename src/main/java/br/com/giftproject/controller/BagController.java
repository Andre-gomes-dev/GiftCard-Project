package br.com.giftproject.controller;

import br.com.giftproject.model.Bag;
import br.com.giftproject.model.TipoGift;
import br.com.giftproject.service.BagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.*;


@RestController
@RequestMapping("/bag")
public class BagController {

    @Autowired
    private BagService service;


    //vevolver todos os valores em forma de constantes.
    //@GetMapping("/devolvetipos")
//    public List<TipoGift> devolveTiposGift() {
//        return new ArrayList<>(Arrays.asList(TipoGift.values()));
//    }


    //criar uma bag, inserir no banco de dados.
//        @PostMapping()
//    public ResponseEntity<Bag> criandoCarrinho(@RequestParam(required = false ) boolean finalizarTransacao,
//                                                      @RequestBody Bag bag){
//            service.multiplicarTotal();
//            service.criar(bag);
//        return  ResponseEntity.status(HttpStatus.CREATED).build();
    //  }


//    @PostMapping("/criacarrinho")
//    public List<ResponseEntity> criandoCarrinho(@RequestParam(required = false) boolean finalizarTransacao,
//                                                           @RequestBody List<Bag> carrinhoCompras, UriComponentsBuilder uriComponentsBuilder) {
//
//        //carrinhoCompras.multiplicarTotal();
//
//        carrinhoRepository.saveAll(carrinhoCompras);
//        URI uri = uriComponentsBuilder.path("/carrinhocompra/criacarrinho").buildAndExpand(carrinhoCompras.getId()).toUri();
//        return ResponseEntity<List<Bag>
//    }

//(ResponseEntity<Bag>) ResponseEntity.created()
}

