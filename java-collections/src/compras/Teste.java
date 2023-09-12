package compras;

public class Teste {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Chocolate", 2.99F, 2);
        carrinhoDeCompras.adicionarItem("Leite", 4.99F, 2);
        carrinhoDeCompras.adicionarItem("Chocolate", 2.99F, 2);

        carrinhoDeCompras.exibirCarrinho();
        carrinhoDeCompras.exibirResumo();

        carrinhoDeCompras.removerItem("Chocolate");

        carrinhoDeCompras.exibirCarrinho();
        carrinhoDeCompras.exibirResumo();
    }
}