package ISP;

public class EntregaService implements GerenciamentoEntrega {
    @Override
    public void iniciarEntrega() {
        System.out.println("Entrega iniciada!");
    }

    @Override
    public void finalizarEntrega() {
        System.out.println("Entrega finalizada!");
    }
}