package exercicios.exercicio1;

import java.util.ArrayList;

public class PessoaPrincipal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Thiago";
        pessoa1.idade = 49;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Catarina";
        pessoa2.idade = 28;

        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "João";
        pessoa3.idade = 33;

        ArrayList<Pessoa>listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa da lista: " + listaDePessoas.get(0));
        System.out.println("Lista completa: " + listaDePessoas);
    }
}
