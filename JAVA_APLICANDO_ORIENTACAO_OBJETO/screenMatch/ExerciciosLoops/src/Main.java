import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*
       - Solicitar o usuário para digitar um número
       - Se o número for positivo, exiba "Número positivo
       - caso contrário exiba "Número negativo"
        */



        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número positivo ou negativo");
        numero = entrada.nextInt();
        if (numero > 0) {
            System.out.println("Numero positivo");
        } else {
            System.out.println("Número negativo");
        }


    }
}