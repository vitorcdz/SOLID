package LSP;

public class Pizza extends Produto {
    public Pizza(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public void exibirProduto() {
        System.out.println("Tipo: Pizza");
        super.exibirProduto();
    }
}