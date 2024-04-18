package br.com.alura.screenmatch.desafioListas.desafio3;

import java.util.ArrayList;

public class PrincipalContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria(001, 1500);
        ContaBancaria contaBancaria2 = new ContaBancaria(002, 5400);


        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(contaBancaria1);
        listaContas.add(contaBancaria2);

        //inicializando a variável contaMaiorSalso com o primeiro elemento da lista
        ContaBancaria contaMaiorSaldo = listaContas.get(0);

        //loop foreach para percorrer o array listaContas
        for (ContaBancaria conta: listaContas){
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()){
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("Conta maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());

    }
}
