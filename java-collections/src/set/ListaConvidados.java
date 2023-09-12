package set;

import java.util.HashSet;
import java.util.Set;

public class ListaConvidados {

    private Set<Convidado> listaConvidados;

    public ListaConvidados() {
        this.listaConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        listaConvidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        if(!listaConvidados.isEmpty()) {
            for(Convidado c : listaConvidados) {
                if(c.getCodigoConvite() == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                }
            }
        } else {
            System.out.println("Lista vazia!");
        }

        listaConvidados.remove(convidadoParaRemover);
    }

    public void obterLista() {
        System.out.println(listaConvidados);
    }

    public int obterNumeroConvidados() {
        return listaConvidados.size();
    }
}