package Exercicios;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;

    void fichaTecnica(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }
    void avaliacaoMusica(double nota){
        avaliacao += nota;
        numAvaliacoes++;
    }
    double mediaAvaliacoes(){
        return avaliacao / numAvaliacoes;
    }

}
