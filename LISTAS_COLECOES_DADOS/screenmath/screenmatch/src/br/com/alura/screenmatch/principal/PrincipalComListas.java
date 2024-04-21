package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

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
        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Clark");
        buscaPorArtistas.add("Mulher Maravilha");
        buscaPorArtistas.add("Homem de Ferro");
        System.out.println("Antes de ordenar a lista: " + buscaPorArtistas);

        //utilizando Collections para ordenar a lista
        Collections.sort( buscaPorArtistas);
        System.out.println("Depois de ordenar utilizando o Collections: ");
        System.out.println(buscaPorArtistas);

        System.out.println("-----Listas de títulos ordenadas após a implementação do comparable na classe título----");
        Collections.sort(listas);
        System.out.println(listas);

        //Exemplo de comparação da listas pelo ano de lançamento
        listas.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: " + listas);
    }
}
