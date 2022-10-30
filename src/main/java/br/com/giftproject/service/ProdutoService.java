package br.com.giftproject.service;

import br.com.giftproject.model.Produto;
import br.com.giftproject.model.TipoGift;
import br.com.giftproject.repository.ProdutoRepository;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;
    private Produto produto;

    // private Integer quantidadeTotal; //toda vez que uma compra de giftcard for feita, é somado quantos gifts foram, e incrementado aqui.
    // private double totaldaCompra;//multiplicação do valorGift * quantidade. (não faz parte da classe, sendo assim será removido como atributo)

    public void criar(Produto produto){
        produtoRepository.save(produto);
    }

    public ResponseEntity<Produto> deletarId(Long id){
      Optional<Produto> byid = produtoRepository.findById(id);
      if(byid.isPresent()){
          produtoRepository.deleteById(id);
          return ResponseEntity.ok().build();
      }
        return ResponseEntity.notFound().build();
    }

   public ResponseEntity<Produto> buscarId(Long id){
       Optional<Produto> byId = produtoRepository.findById(id);
       return byId.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
   }


//    public void multiplicarTotal() {
//        double valor = bag.getQuantidade() * bag.getValorGift();
//        bag.setTotaldaCompra(valor);
//    }

}
