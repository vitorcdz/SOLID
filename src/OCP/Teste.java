package OCP;

public class Teste {
    static void main() {
        ProcessadorPagamento processador = new ProcessadorPagamento();

        Pagamento cartao = new PagamentoCartao();
        Pagamento pix = new PagamentoPix();
        Pagamento dinheiro = new PagamentoDinheiro();

        processador.processar(cartao, 50.00);
        processador.processar(pix, 30.00);
        processador.processar(dinheiro, 20.00);

    }
}