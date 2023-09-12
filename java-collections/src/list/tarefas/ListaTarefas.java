package list.tarefas;

import java.util.List;
import java.util.ArrayList;

public class ListaTarefas {

    private List<Tarefa> listaTarefas;

    public ListaTarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasARemover = new ArrayList<>(); //Lista de list.tarefas a excluir

        if(!listaTarefas.isEmpty()) {
            for(Tarefa t : listaTarefas) { //Percorre a lista procurando a tarefa
                if(t.getDescricao().equalsIgnoreCase(descricao)) { //Comparando as list.tarefas
                    tarefasARemover.add(t); //Adicionando a tarefa encontrada a lista de remoção
                }
            }
        }

        listaTarefas.removeAll(tarefasARemover);

    }

    public void obterTarefas () {
        System.out.println(listaTarefas);
    }

    public int obterNumeroTarefas () {
        return listaTarefas.size();
    }
}