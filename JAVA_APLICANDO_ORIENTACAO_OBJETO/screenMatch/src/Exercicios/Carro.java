package Exercicios;

public class Carro {
    String modelo;
    int anoCarro;
    String cor;


    void fichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + anoCarro);
        System.out.println("Cor: " + cor);
    }
    int idadeCarro(int anoAtual){
        return anoAtual - anoCarro;
    }
}

