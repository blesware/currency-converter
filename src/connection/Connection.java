package connection;

import com.google.gson.*;
import converter.Converter;

public class Connection {

    public static void cliente() {

    }

    public static void peticion() {

    }

    public static String respuesta(String currencyOrigin, String currency, double value) {

        double result = Converter.otherCurrency(0, 0);

        return "$" + value + " " + currencyOrigin + " = $" + result + " " + currency;
    }
}
