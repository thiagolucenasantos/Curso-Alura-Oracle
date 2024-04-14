package br.com.thiago.screenmatch.modelos.exemploDaAula.desafio;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro carro = new ModeloCarro();
        carro.nomeModelo("Sedan");
        carro.definirPreco(15000, 2000,3000);
        carro.eibirInfo();
    }
}
