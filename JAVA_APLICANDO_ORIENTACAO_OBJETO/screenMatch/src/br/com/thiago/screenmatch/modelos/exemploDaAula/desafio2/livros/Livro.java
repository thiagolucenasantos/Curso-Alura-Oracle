package br.com.thiago.screenmatch.modelos.exemploDaAula.desafio2.livros;

import java.util.SortedMap;

public class Livro implements Calculavel{
    @Override
    public void calcularPrecoFinal(double valorLivro) {
        System.out.println("Valor do livro: " + valorLivro);
        double desconto = valorLivro * 0.10;
        System.out.println("Valor com desconto é de R$ " + desconto);
        double valorFinal = valorLivro - desconto;
        System.out.println("Valor final com desconto: " + valorFinal);
    }
}
