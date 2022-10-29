package br.com.giftproject.service;

import br.com.giftproject.model.Bag;
import br.com.giftproject.model.TipoGift;
import br.com.giftproject.repository.BagRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BagService {

    private BagRepository bagRepository;

    private Bag bag;

    public List<TipoGift> colecao = new ArrayList<>();

//    carrinhoRepository.save(carrinhoCompras);


//    public int somarTotal(){
//       //método precisa somar o total de giftcard comprados
//   }



    //methodo para comp

    public Bag criar(Bag bag){
       return bagRepository.save(bag);
    }



}
