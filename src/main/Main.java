package main;

import converter.Currency;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Currency> currencys = new ArrayList<>();

        //Para agregar mas monedas, basta con agregar mas objetos Currency al ArraList
        currencys.add(new Currency("USD", "Dolar Americano"));
        currencys.add(new Currency("ARS", "Peso Argentino"));
        currencys.add(new Currency("COP", "Peso Colombiano"));
        currencys.add(new Currency("CLP", "Peso Chileno"));
        currencys.add(new Currency("BRL", "Real Brasileño"));

        try {

            Menu.deployMenu(currencys);

        } catch (Exception e) {

            System.out.println("Error: " + e);
        }
    }
}
