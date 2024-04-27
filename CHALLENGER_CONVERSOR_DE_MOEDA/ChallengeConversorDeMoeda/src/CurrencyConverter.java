
public class CurrencyConverter {
    private static final String[] CURRENCIES = {"BRL", "USD"}; // Adicione as demais moedas

    public static double getRate(String currency, ExchangeRateResponse response) {
        switch (currency) {
            case "BRL":
                return response.getRates().getBRL();
            case "USD":
                return response.getRates().getUSD();
            // Adicione os demais casos para as outras moedas
            default:
                return 1.0; // Taxa de conversão padrão
        }
    }
}
