package SRP;

import java.util.List;

public class Pedido {

    int id;
    List<Produtos> produtosList;
    double valor;
    String status;

    public Pedido(int id, List<Produtos> produtosList, double valor, String status) {
        this.id = id;
        this.produtosList = produtosList;
        this.valor = valor;
        this.status = status;
    }
}