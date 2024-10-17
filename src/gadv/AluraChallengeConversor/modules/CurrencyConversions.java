package gadv.AluraChallengeConversor.modules;

import com.google.gson.JsonObject;

public class CurrencyConversions {
    private JsonObject conversion_rates;
    public JsonObject getConversion_rates() {
        return conversion_rates;
    }
    public double convertToCode(String currencyCode){
        if (conversion_rates.has(currencyCode)) {
            try {
                return conversion_rates.get(currencyCode).getAsDouble();
            } catch (NumberFormatException e) {
                throw new RuntimeException("Error al convertir la tasa de cambio para la moneda: " + currencyCode);
            }
        } else {
            throw new RuntimeException("Código de moneda no encontrado: " + currencyCode);
        }
    }
}
