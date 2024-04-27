
import java.util.Scanner;

public class ConsoleUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String exchangeRatesJson = HttpManager.getExchangeRates();
        ExchangeRateResponse exchangeRateResponse = ExchangeRateResponse.fromJson(exchangeRatesJson);

        if (exchangeRateResponse != null) {
            System.out.println("Taxas de Câmbio Disponíveis:");
            System.out.println("1. BRL");
            System.out.println("2. USD");
            // Adicione as demais moedas disponíveis

            System.out.print("Selecione a Moeda de Origem: ");
            int origemIndex = scanner.nextInt();
            String origem = ConsoleUI.getCurrency(origemIndex);

            System.out.print("Selecione a Moeda de Destino: ");
            int destinoIndex = scanner.nextInt();
            String destino = ConsoleUI.getCurrency(destinoIndex);

            System.out.print("Digite o Valor em " + origem + ": ");
            double valorOrigem = scanner.nextDouble();

            double taxaOrigem = CurrencyConverter.getRate(origem, exchangeRateResponse);
            double taxaDestino = CurrencyConverter.getRate(destino, exchangeRateResponse);

            double valorDestino = (valorOrigem * taxaDestino) / taxaOrigem;
            System.out.println("Valor em " + destino + ": " + valorDestino);
        }
    }

    private static String getCurrency(int index) {
        switch (index) {
            case 1:
                return "BRL";
            case 2:
                return "USD";
            // Adicione as demais moedas
            default:
                return "BRL"; // Moeda padrão
        }
    }
}
