import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        - Calcular área do quadrado
        - Calcular área do circulo
         */

        Scanner entrada = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 3) {
            System.out.println("---Menu---");
            System.out.println("1. Calcular área do quadrado");
            System.out.println("2. Calcular área do círculo");
            System.out.println("3. Sair");
            System.out.println("Escolha uma das opções");
            escolha = entrada.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o lado do quadrado");
                double lado = entrada.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Àrea do quadrado: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.println("Digite o raio do circulo");
                double raio = entrada.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Área do círculo: " + areaCirculo);
            } else if (escolha == 3) {
                System.out.println("Programa encerrado");
            } else {
                System.out.println("Opção inválida, tente novamente");
            }
        }
    }
}
