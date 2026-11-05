package SRP;

import java.util.List;

public class PedidosService {

    public Pedido criarPedido(int id, List<Produtos> produtos) {
        double valorTotal = 0;

        for (Produtos produto : produtos) {
            valorTotal += produto.valor;
        }

        Pedido pedido = new Pedido(id, produtos, valorTotal, "Em preparação");

        return pedido;
    }
}