package br.com.giftproject.controller;

import br.com.giftproject.model.TipoGift;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/carrinhocompra")
public class CarrinhoComprasController {

        @GetMapping("/devolvetipos")
            public List<TipoGift> devolveTiposGift() {
            return new ArrayList<>(Arrays.asList(TipoGift.values()));
        }
//    @PostMapping()
//    public ResponseEntity<GiftController>criandoCarrinho(){
//
//        return ResponseEntity.created()
//    }

}
