package br.com.giftproject.controller;

import br.com.giftproject.model.Usuario;
import br.com.giftproject.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/{id}")
    @Transactional
    public ResponseEntity<Usuario> usuario(@PathVariable Long id){
        Optional<Usuario> byId = usuarioRepository.findById(id);
        if(byId.isPresent()){
            return ResponseEntity.ok(byId.get());
        }
        return ResponseEntity.notFound().build();
    //    return byId.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

    }




//    @PostMapping
//    public ResponseEntity<User> cadastrarUsuario(){
//
//    }
}
