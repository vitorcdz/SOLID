package SRP;

public class PedidosExibicao {

    public void exibirPedido(Pedido pedido) {

        System.out.println("===== PEDIDO =====");
        System.out.println("ID: " + pedido.id);
        System.out.println("Status: " + pedido.status);

        System.out.println("Produtos:");

        for (Produtos produto : pedido.produtosList) {
            System.out.println(
                    produto.nome + " - R$ " + produto.valor
            );
        }

        System.out.println("Valor total: R$ " + pedido.valor);
    }
}