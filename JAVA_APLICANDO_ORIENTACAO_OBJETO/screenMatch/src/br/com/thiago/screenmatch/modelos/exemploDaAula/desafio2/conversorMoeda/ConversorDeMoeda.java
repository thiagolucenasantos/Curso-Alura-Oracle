package br.com.thiago.screenmatch.modelos.exemploDaAula.desafio2.conversorMoeda;

public class ConversorDeMoeda implements ConversorFinanceira{
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.80;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}
