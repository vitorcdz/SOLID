package LSP;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    static void main() {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Pizza("Pizza Calabresa", 45.00));
        produtos.add(new Hamburguer("X-Bacon", 28.00));
        produtos.add(new Bebida("Coca-Cola", 8.00));

        for (Produto produto : produtos) {
            produto.exibirProduto();
            System.out.println("----------------");
        }
    }
}
