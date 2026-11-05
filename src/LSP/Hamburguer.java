package LSP;

public class Hamburguer extends Produto {
    public Hamburguer(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public void exibirProduto() {
        System.out.println("Tipo: Hamburguer");
        super.exibirProduto();
    }
}