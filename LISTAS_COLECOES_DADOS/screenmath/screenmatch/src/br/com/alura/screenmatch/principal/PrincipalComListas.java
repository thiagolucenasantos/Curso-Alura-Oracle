package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Batman", 2023);
        filme1.avalia(9);
        Filme filme2 = new Filme("Jaspion", 1980);
        Filme filme3 = new Filme("Coringa", 2000);

        Serie serie1 = new Serie("Chicago", 1986);
        serie1.avalia(5);

        ArrayList<Titulo> listas = new ArrayList<>();
        listas.add(filme1);
        listas.add(serie1);

        for (Titulo item: listas){
            System.out.println(item);
            //implementando um if utilizando instanceof para informar que um item é um Filme
            //utilizando em muitos sistemas legados
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }
    }
}
