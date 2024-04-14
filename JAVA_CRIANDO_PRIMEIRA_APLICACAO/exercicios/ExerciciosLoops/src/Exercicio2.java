import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
        - Peça ao usuário para inserir dois números inteiros.
        - Compare os números e imprima se são iguais, diferentes, o primeiro é maior ou o segundo é maior
         */

        Scanner entrada = new Scanner(System.in);
        int numero1;
        int numero2;


        System.out.println("Digite o primeiro número inteiro");
        numero1 = entrada.nextInt();
        System.out.println("Digite o segundo número inteiro");
        numero2 = entrada.nextInt();
        if (numero1 == numero2) {
            System.out.println("Números iguais");
        }else if (numero1 > numero2){
            System.out.println("Primeiro número é maior");
        }else {
            System.out.println("O segundo número é maior");
        }

    }
}
