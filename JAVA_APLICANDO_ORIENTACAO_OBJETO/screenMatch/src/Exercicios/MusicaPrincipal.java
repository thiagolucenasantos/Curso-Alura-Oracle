package Exercicios;

public class MusicaPrincipal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.artista = "Park";
        musica.titulo = "Era";
        musica.anoLancamento = 2023;

        musica.fichaTecnica();
        musica.avaliacaoMusica(2);
        musica.avaliacaoMusica(10);
        double mediaAvaliacoes = musica.mediaAvaliacoes();
        System.out.println(mediaAvaliacoes);


    }
}
