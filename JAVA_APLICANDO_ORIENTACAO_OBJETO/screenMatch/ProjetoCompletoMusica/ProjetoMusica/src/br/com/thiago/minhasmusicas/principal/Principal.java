package br.com.thiago.minhasmusicas.principal;

import br.com.thiago.minhasmusicas.modelos.MinhasPreferidas;
import br.com.thiago.minhasmusicas.modelos.Musica;
import br.com.thiago.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhamusica = new Musica();
        minhamusica.setTitulo("Forever");
        minhamusica.setCantor("Kiss");

        for (int i = 0; i < 1000; i++) {
            minhamusica.reproduz();
        }
        for (int i = 0; i < 999; i++) {
            minhamusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcos Mendes");

        for (int i = 0; i < 1000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 350; i++) {
            meuPodcast.curte();
        }
        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(minhamusica);
        minhasPreferidas.inclui(meuPodcast);
    }

}
