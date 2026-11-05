package LSP;

public class Bebida extends Produto {
    public Bebida(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public void exibirProduto() {
        System.out.println("Tipo: Bebida");
        super.exibirProduto();
    }
}