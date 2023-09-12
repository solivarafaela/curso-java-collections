package tarefas;

public class Teste {

    public static void main(String[] args) {

        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("Você tem " + listaTarefas.obterNumeroTarefas() + " tarefa(s) na lista.");

        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Estudar JavaScript");
        listaTarefas.adicionarTarefa("Estudar Java");

        System.out.println("Você tem " + listaTarefas.obterNumeroTarefas() + " tarefa(s) na lista.");
        listaTarefas.obterTarefas();

        listaTarefas.removerTarefa("Estudar Java");

        System.out.println("Você tem " + listaTarefas.obterNumeroTarefas() + " tarefa(s) na lista.");
        listaTarefas.obterTarefas();
    }
}