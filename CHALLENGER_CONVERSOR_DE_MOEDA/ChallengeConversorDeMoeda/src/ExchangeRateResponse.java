
import com.google.gson.Gson;

public class ExchangeRateResponse {
    private String base;
    private String date;
    private Rates rates;

    public static ExchangeRateResponse fromJson(String json) {
        return new Gson().fromJson(json, ExchangeRateResponse.class);
    }



    // Getters e Setters

    public Rates getRates() {
        return rates;
    }

    public void setRates(Rates rates) {
        this.rates = rates;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }
}

class Rates {
    private double BRL;
    private double USD;
    // Adicione os demais campos para as outras moedas

    // Getters e Setters
}
