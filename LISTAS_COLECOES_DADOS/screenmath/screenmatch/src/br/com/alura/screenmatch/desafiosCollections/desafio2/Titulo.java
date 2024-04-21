package br.com.alura.screenmatch.desafiosCollections.desafio2;

public class Titulo implements Comparable<Titulo>{
    String nome;

    public Titulo(String letra) {
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.nome.compareTo(outroTitulo.nome);
    }
}
