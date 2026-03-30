package service;

public class ProdutoService {

    Produto[] estoque = new Produto[10];
    int posicaoProduto = 0;


    public void adicionarProdutos(String nomeProduto, double valor, int quantidade) {

        if (posicaoProduto == estoque.length) {
            System.out.println("Estoque cheio!");
            return;
        }

        if (valor <= 0 || quantidade <= 0){
            System.out.println("Valor e quantidade devem ser maiores que 0!");
            return;
        }

        Produto produto = new Produto();

        produto.nome = nomeProduto;
        produto.valor = valor;
        produto.quantidade = quantidade;

        estoque[posicaoProduto] = produto;
        posicaoProduto++;

    }

    public void listarProdutos() {

        if (posicaoProduto == 0) {
            System.out.println("Não há produtos no estoque!");
            return;
        }


        for (int i = 0; i < posicaoProduto; i++) {
            System.out.println("-------------------");
            System.out.println("Produto "+(i + 1));
            System.out.println("Nome: " + estoque[i].nome);
            System.out.println("Valor: R$" + estoque[i].valor );
            System.out.println("Quantidade: " + estoque[i].quantidade);
        }
    }

    public void valorTotalEstoque() {

        if (posicaoProduto == 0) {
            System.out.println("Não há produtos no estoque!");
            return;
        }

        double total = 0;

        for (int i = 0; i < posicaoProduto; i++) {
            double valorProduto = estoque[i].valor * estoque[i].quantidade;
            total += valorProduto;
        }

        System.out.println("Valor total do estoque: " + total);
    }


    public void valorProdutosSeparadamente() {

        if (posicaoProduto == 0) {
            System.out.println("Não há produtos no estoque!");
            return;
        }

        for (int i = 0; i < posicaoProduto; i++) {
            double valorProduto = estoque[i].valor * estoque[i].quantidade;

            System.out.println("____________________________________");
            System.out.println("Nome do produto: " + estoque[i].nome);
            System.out.println("Quantidade: " + estoque[i].quantidade);
            System.out.println("Preço: " + estoque[i].valor);
            System.out.println("Valor total desse produto: R$" + valorProduto);


        }
    }
}
