package br.com.alura.screenmatch.desafiosCollections.desafio4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(2);
        listaNumeros.add(3);
        System.out.println("Lista numeros: " + listaNumeros);

        List<String> listaNomes = new LinkedList<>();
        listaNomes.add("Thiago");
        listaNomes.add("Catarina");
        System.out.println("Lista de nomes: " + listaNomes);

        //declaração de uma variável com a interface Lista, utilizando de polimorfismo
        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Thiago");
        listaPolimorfica.add("João");
        System.out.println("Lista com ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Carol");
        listaPolimorfica.add("Jéssica");
        System.out.println("Lista com Linkedilist: " + listaPolimorfica);
    }
}
