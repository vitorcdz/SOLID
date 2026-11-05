package ISP;

public class PedidoService implements GerenciamentoPedido {
    @Override
    public void criarPedido() {
        System.out.println("Pedido criado!");
    }

    @Override
    public void cancelarPedido() {
        System.out.println("Pedido cancelado!");
    }
}