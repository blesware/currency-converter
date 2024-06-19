package connection;

import com.google.gson.*;
import converter.Converter;

//Clase para manejo de la conexion con la API de ExchangeRate
//por medio del protocolo http
public class Connection {

    public static void client() {

    }

    public static void petition() {

    }

    public static String response(String currencyOrigin, String currency, double value) {

        double result = Converter.otherCurrency(0, 0);

        return "$" + value + " " + currencyOrigin + " = $" + result + " " + currency;
    }
}
