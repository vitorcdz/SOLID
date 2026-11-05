package ISP;

public class Teste {
    static void main() {
        EnvioNotificacao notificacao = new EnvioNotificacao();
        notificacao.enviarNotificacao("Seu pedido está pronto!");

        GeradorRelatorio relatorio = new GeradorRelatorio();
        relatorio.gerarRelatorio();

        PedidoService pedido = new PedidoService();
        pedido.criarPedido();
        pedido.cancelarPedido();

        EntregaService entrega = new EntregaService();
        entrega.iniciarEntrega();
        entrega.finalizarEntrega();
    }
}
