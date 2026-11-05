package ISP;

public class GeradorRelatorio implements Relatorio {
    @Override
    public void gerarRelatorio() {
        System.out.println("Relatório de pedidos gerado!");
    }
}