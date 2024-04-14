import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "Thiago";
        String tipoConta = "Corrente";
        double saldo = 2000.00;
        int opcao = 0;

        System.out.println("***************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo em conta: " + saldo);
        System.out.println("\n***************");


        String menu = """
                ** Digite sua opção **
                1 - Consultar saldo
                2 - Transferis valor
                3 - Receber valor
                4 - Sair
                """;
        Scanner scanner = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Seu saldo atual é: " + saldo);
            } else if (opcao == 2) {
                double valorTransferencia = 0;
                System.out.println("Digite o valor a transferir: ");
                valorTransferencia = scanner.nextDouble();
                if (valorTransferencia > saldo){
                    System.out.println("Você não possue saldo suficiente para esta operação.");
                }else {
                    saldo -= valorTransferencia;
                    System.out.println("Valor atual após transferência: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Digite o valor a receber: ");
                double valorRecebido = scanner.nextDouble();
                saldo += valorRecebido;
                System.out.println("Valor atual após recebimento: " + saldo);

            } else if (opcao != 4) {
                System.out.println("Opção inválida, por favor digite novamente.");

            }

        }
    }
}
