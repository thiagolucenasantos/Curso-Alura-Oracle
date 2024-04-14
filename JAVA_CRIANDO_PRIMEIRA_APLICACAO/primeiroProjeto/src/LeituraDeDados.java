import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite seu filme");
        String filme = leitura.nextLine();

        System.out.println("Ano de lançamento");
        int anoLancamento = leitura.nextInt();

        System.out.println(filme);
        System.out.println(anoLancamento);


    }
}
