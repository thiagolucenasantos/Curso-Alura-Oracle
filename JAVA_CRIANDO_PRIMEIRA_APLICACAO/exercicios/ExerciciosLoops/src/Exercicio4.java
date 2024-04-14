import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
        Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10
         */

        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número");
        numero = scanner.nextInt();

        for (int i = 0; i <= 10 ; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

    }
}
