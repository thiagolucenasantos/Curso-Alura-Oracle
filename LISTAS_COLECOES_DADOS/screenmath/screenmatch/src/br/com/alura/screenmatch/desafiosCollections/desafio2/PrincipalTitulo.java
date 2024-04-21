package br.com.alura.screenmatch.desafiosCollections.desafio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrincipalTitulo {
    public static void main(String[] args) {
        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("D"));
        listaTitulos.add(new Titulo("A"));

        Collections.sort(listaTitulos);

        for(Titulo titulo: listaTitulos){
            System.out.println(titulo.nome);
        }
    }

}
