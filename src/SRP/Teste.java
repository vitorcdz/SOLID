package SRP;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    static void main() {
        Produtos p1 = new Produtos(1, "Hambúrguer", 25.00);
        Produtos p2 = new Produtos(2, "Refrigerante", 8.00);
        Produtos p3 = new Produtos(3, "Batata frita", 12.00);

        List<Produtos> produtos = new ArrayList<>();

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        // Criar pedido
        PedidosService service = new PedidosService();
        Pedido pedido = service.criarPedido(1, produtos);

        // Salvar pedido
        PedidosRepository repository = new PedidosRepository();
        repository.salvarPedido(pedido);

        // Exibir pedido
        PedidosExibicao exibicao = new PedidosExibicao();
        exibicao.exibirPedido(pedido);
    }
}
