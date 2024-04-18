package br.com.alura.screenmatch.desafioListas.desafio1;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {
        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("Thiago");
        listaString.add("João");
        listaString.add("Leticia");

        for (String lista : listaString){
            System.out.println(lista);
        }
    }
}
