package set.convidados;

public class Teste {
    public static void main(String[] args) {

        ListaConvidados listaConvidados = new ListaConvidados();

        System.out.println("A lista possui " + listaConvidados.obterNumeroConvidados() + " convidado(s).");

        listaConvidados.adicionarConvidado("Rafaela", 194346);
        listaConvidados.adicionarConvidado("Maju", 194308);
        listaConvidados.adicionarConvidado("Sol", 194351);

        System.out.println("A lista possui " + listaConvidados.obterNumeroConvidados() + " convidado(s).");

        listaConvidados.removerConvidadoCodigoConvite(194346);

        System.out.println("A lista possui " + listaConvidados.obterNumeroConvidados() + " convidado(s).");

        listaConvidados.obterLista();
    }
}