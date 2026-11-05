package LSP;

public class Produto {
    String nome;
    double valor;

    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Valor: R$ " + valor);
    }
}