package br.com.giftproject.controller;

import br.com.giftproject.model.Produto;
import br.com.giftproject.model.TipoGift;
import br.com.giftproject.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService service;
//
//    @GetMapping
//    public ResponseEntity<Produto> devolveGifts(){
//        service.devolveTiposGift();
//        return  ResponseEntity.ok().build();

    @GetMapping
    public List<TipoGift> devolveTiposGift() {
        return new ArrayList<>(Arrays.asList(TipoGift.values()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> estoquePeloTipoGift(@PathVariable Long id){
        return service.buscarId(id);
    }

    @PostMapping("/adcionar")
    public ResponseEntity<Produto> adcionarEstoque(@RequestBody Produto produto){
        service.criar(produto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
}
//    @PutMapping("/atualizar")
//    public ResponseEntity<Produto> atualizarEstoque(@RequestBody Produto produto){
//
//    }
//
    @DeleteMapping("/{id}")
    public void deletarEstoque(@PathVariable Long id){

    }

}

