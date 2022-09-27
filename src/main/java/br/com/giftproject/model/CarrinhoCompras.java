package br.com.giftproject.model;

import javax.persistence.*;

@Entity
public class CarrinhoCompras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//
//    @Autowired
//    @OneToOne
//    private Usuario usuario;

    private Integer quantidade;

    @Enumerated(value = EnumType.STRING)
    private TipoGift tipoGift;

    private Double valorGift;
    private double totaldaCompra;


    public CarrinhoCompras() {
    }

    public CarrinhoCompras(Integer quantidade, Double valor, TipoGift tipoGift) {
        this.quantidade = quantidade;
        this.valorGift = valor;
        this.tipoGift = tipoGift;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public TipoGift getTipoGift() {
        return tipoGift;
    }

    public void setTipoGift(TipoGift tipoGift) {
        this.tipoGift = tipoGift;
    }

    public Double getValorGift() {
        return valorGift;
    }

    public double getTotaldaCompra() {
        return totaldaCompra;
    }

    public void setTotaldaCompra(double totaldaCompra) {
        this.totaldaCompra = totaldaCompra;
    }

    public void multiplicarTotal(){
        totaldaCompra = getQuantidade() * getValorGift();
    }
}
