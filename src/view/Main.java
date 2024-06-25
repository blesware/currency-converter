package view;

import model.Currency;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Currency> currencys = new ArrayList<>();

        //Para agregar mas monedas, basta con agregar mas objetos Currency al ArrayList
        //WARNING: Las monedas agregadas a este ArrayList deben estar presentes en
        //la lista de ExchangeRate-API https://www.exchangerate-api.com/docs/supported-currencies
        //el base_code (Currency Code) debe coincidir al mensionado en la documentacion, el nombre es a eleccion
        currencys.add(new Currency("USD", "Dolar Americano"));
        currencys.add(new Currency("ARS", "Peso Argentino"));
        currencys.add(new Currency("COP", "Peso Colombiano"));
        currencys.add(new Currency("CLP", "Peso Chileno"));
        currencys.add(new Currency("BRL", "Real Brasileño"));
        currencys.add(new Currency("VES", "Bolivar Venezolano"));

        try {

            Menu.deployMenu(currencys);

        } catch (Exception e) {

            System.out.println("Error: " + e);
        }
    }
}
