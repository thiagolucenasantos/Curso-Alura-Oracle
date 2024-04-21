package br.com.alura.screenmatch.desafiosCollections.desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaNumerosInteiros {
    public static void main(String[] args) {
        List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(22);
        listaInteiros.add(30);
        listaInteiros.add(9);

        Collections.sort(listaInteiros);

        System.out.println("Lista ordenada, utilizando Collections.sort: " + listaInteiros);

    }
}
