package controller;

import com.google.gson.*;
import model.Currency;
import java.net.URI;
import java.net.http.*;

//Clase para manejo de la conexion con la API de ExchangeRate
//por medio del protocolo http
public class Connection {

    public static String response(String currencyOrigin, String currency, double value) {

        try {

            //Modificar la API KEY por la dada en https://www.exchangerate-api.com
            final String API_KEY = "055ad13237c1bd1eff4294e2";

            URI direccion = URI.create("https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + currencyOrigin + "/" + currency + "/" + value);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(direccion).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            double result = new Gson().fromJson(response.body(), Currency.class).getConversion_result();

            return "$" + value + " " + currencyOrigin + " = $" + String.format("%.2f",result) + " " + currency;

        } catch (Exception e) {

            return "Error: " + e.getMessage();
        }
    }
}
