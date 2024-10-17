package gadv.AluraChallengeConversor.modules;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConverterAPIConsult {
    private static final String apiKey = getApiKey();

    private static String getApiKey() {
        File file = new File("apiKey.txt");
        try {
            Scanner scanner = new Scanner(file);
            String apiKey = scanner.nextLine();
            scanner.close();
            return apiKey;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("El archivo apiKey.txt no fue encontrado. Asegúrate de que el archivo esté presente en el directorio.");
        }
    }

    public CurrencyConversions consultConversions(String currencyCode) {
        String requestUrl = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + currencyCode;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(requestUrl))
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() != 200) {
                throw new RuntimeException("Error en la consulta de la API: " + response.statusCode());
            }
            String json = response.body();
            CurrencyConversions currencyConversions = new Gson().fromJson(json, CurrencyConversions.class);
            if (currencyConversions.getConversion_rates() == null) {
                throw new RuntimeException("La respuesta de la API no contiene datos válidos.");
            }
            return currencyConversions;
        } catch (Exception e) {
            System.err.println("Error en la consulta de conversión de moneda: " + e.getMessage());
            throw new RuntimeException("No se pudo realizar la conversión. Por favor, inténtalo más tarde.");
        }
    }
}
