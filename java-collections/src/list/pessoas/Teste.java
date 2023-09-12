package list.pessoas;

public class Teste {
    public static void main(String[] args) {

        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("Justin", 9,0.5);
        ordenacaoPessoas.adicionarPessoa("Sol", 6,0.7);
        ordenacaoPessoas.adicionarPessoa("Rafaela", 22,1.53);
        ordenacaoPessoas.adicionarPessoa("Maju", 8,0.7);
        ordenacaoPessoas.adicionarPessoa("Shiloh", 9,0.3);

        ordenacaoPessoas.obterLista();

        System.out.println(ordenacaoPessoas.ordenarIdade());
        System.out.println(ordenacaoPessoas.ordenarAltura());
    }
}
