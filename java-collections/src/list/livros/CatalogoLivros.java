package list.livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> catalogoLivros;

    public CatalogoLivros() {
        this.catalogoLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        catalogoLivros.add(new Livro(titulo, autor, anoPublicacao));
    }

    public Livro pesquisarTitulo(String titulo) {
        Livro livro = null;

        if(!catalogoLivros.isEmpty()) {
            for(Livro l : catalogoLivros) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livro = l;
                    break;
                }
            }
        } else {
            System.out.println("Catálogo vazio!");
        }

        return livro;
    }

    public List<Livro> pesquisarAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if(!catalogoLivros.isEmpty()) {

            for(Livro l : catalogoLivros) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        } else {
            System.out.println("Catálogo vazio!");
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarAnoLancamento(int anoInicial, int anoFinal) {
        List<Livro> livrosIntervaloAnos = new ArrayList<>();

        if(!catalogoLivros.isEmpty()) {

            for (Livro l : catalogoLivros) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosIntervaloAnos.add(l);
                }
            }
        } else {
            System.out.println("Catálogo Vazio!");
        }

        return livrosIntervaloAnos;
    }
}