package br.com.thiago.screenmatch.modelos.exemploDaAula.desafio2.tabuadaMultiplicacao;

public class TabuadaMultiplicacao implements Tabuada{
    @Override
    public void mostrarTabuada(int numero) {
        System.out.println("A tabuada de multiplicação do número: " + numero);
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
