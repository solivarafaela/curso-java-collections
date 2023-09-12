package list.compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, float preco, int quantidade) {
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemsARemover = new ArrayList<>(); //Lista de itens a excluir

        if (!carrinhoDeCompras.isEmpty()) {

            for (Item i : carrinhoDeCompras) { //Percorre o carrinho procurando o item
                if (i.getNome().equalsIgnoreCase(nome)) { //Compara os itens
                    itemsARemover.add(i); //Adiciona o item encontrado a lista de remoção
                }
            }
        }

        carrinhoDeCompras.removeAll(itemsARemover);
    }

    public void exibirCarrinho() {
        System.out.println(carrinhoDeCompras);
    }

    private int somarQuantidadeItens() {
        int quantidadeItens = 0;

        for (Item i : carrinhoDeCompras) {
            quantidadeItens += i.getQuantidade();
        }

        return quantidadeItens;
    }

    private float somarValorCompra() {
        float valorTotal = 0.0F;
        float valorItem = 0.0F;

        for (Item i : carrinhoDeCompras) {
            if(i.getQuantidade() > 1) {
                valorItem = i.getPreco() * i.getQuantidade();
                valorTotal = valorTotal + valorItem;
            } else {
                valorTotal = valorTotal + i.getPreco();
            }
        }

        return valorTotal;
    }

    public void exibirResumo () {
        System.out.println("\nQuantidade de itens: " + somarQuantidadeItens());
        System.out.println("Valor total: " + somarValorCompra());
    }
}