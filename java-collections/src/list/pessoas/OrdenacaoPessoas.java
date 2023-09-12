package list.pessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> ordenacaoPessoas;

    public OrdenacaoPessoas() {
        this.ordenacaoPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        ordenacaoPessoas.add(new Pessoa(nome, idade, altura));
    }

    public void obterLista() {
        System.out.println(ordenacaoPessoas);
    }

    public List<Pessoa> ordenarIdade() {

        if(!ordenacaoPessoas.isEmpty()) {
            List<Pessoa> pessoasPorIdade = new ArrayList<>(ordenacaoPessoas);
            Collections.sort(pessoasPorIdade);
            return pessoasPorIdade;
        } else {
            System.out.println("Lista vazia!");
            return null;
        }
    }

    public List<Pessoa> ordenarAltura() {

        if(!ordenacaoPessoas.isEmpty()) {
            List<Pessoa> pessoasPorAltura = new ArrayList<>(ordenacaoPessoas);
            Collections.sort(pessoasPorAltura, new ComparatorAltura());
            return pessoasPorAltura;
        } else {
            System.out.println("Lista vazia!");
            return null;
        }
    }
}