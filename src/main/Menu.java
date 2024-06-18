package main;

import connection.Connection;
import converter.Converter;
import converter.Currency;
import java.util.*;

public class Menu {

    //Metodo para leer por teclado unicamente String's
    private static String input() {
        Scanner input = new Scanner(System.in);
        String x = input.nextLine();
        return x;
    }

    //Metodo para desplegar el menu de opciones de manera estatica
    public static void desplegar(List<Currency> currencys) {

        String opt = "";
        int x = 0;

        System.out.println("Bienvenido a Currency Converter v1.0");
        System.out.println("By: Blesware");

        while(x == 0) {

            System.out.println("***********************************");
            System.out.println("Seleccione su moneda");
            System.out.println("1) Dolar Americano[USD]");
            System.out.println("2) Peso Argentino [ARS]");
            System.out.println("3) Peso Colombiano [COP]");
            System.out.println("4) Peso Chileno [CLP]");
            System.out.println("5) Real Brasileño [BRL]");
            System.out.println("6) Salir");
            System.out.print("Digite la opcion: ");
            opt = input();
            System.out.println("***********************************");

            switch (opt.trim()) {

                case "1":

                    desplegarSubMenu("USD", currencys);
                    waitKey();
                    break;

                case "2":

                    desplegarSubMenu("ARS", currencys);
                    waitKey();
                    break;

                case "3":

                    desplegarSubMenu("COP", currencys);
                    waitKey();
                    break;

                case "4":

                    desplegarSubMenu("CLP", currencys);
                    waitKey();
                    break;

                case "5":

                    desplegarSubMenu("BRL", currencys);
                    waitKey();
                    break;

                case "6":

                    System.out.println("");
                    System.out.println("Ejecucion finalizada");

                    x = 1;
                    break;

                default:

                    System.out.println("");
                    System.out.println("Opcion no valida, vuelva a intentar");
                    System.out.println("");
            }
        }
    }

    //Metodo para desplegar el sub menu de opciones
    private static void desplegarSubMenu(String iso, List<Currency> currencys) {

        HashMap<Integer, String> mapSubMenu = new HashMap<>();

        int j = 1;
        int x = 0;
        double value = 0.0;

        do {

            x = 0;

            System.out.println("Selecione la moneda a la cual desea");
            System.out.println("hacer el cambio");

            //Ignorando la moneda seleccionada anteriormente en la menu de opciones
            for (int i = 0; i < currencys.size(); i++) {

                if(!(currencys.get(i).getBase_code().equals(iso))) {

                    System.out.println(j + ") " + currencys.get(i).getNombre() + " [" + currencys.get(i).getBase_code() + "]");
                    mapSubMenu.put(j, currencys.get(i).getBase_code());
                    j++;
                }
            }

            System.out.println("Digite la opcion: ");
            String opt = input();

            System.out.println("");

            switch (opt) {

                case "1":

                    value = pedirValor();
                    System.out.println(Connection.respuesta(iso, mapSubMenu.get(1), value));
                    break;

                case "2":

                    value = pedirValor();
                    System.out.println(Connection.respuesta(iso, mapSubMenu.get(2), value));
                    break;

                case "3":

                    value = pedirValor();
                    System.out.println(Connection.respuesta(iso, mapSubMenu.get(3), value));
                    break;

                case "4":

                    value = pedirValor();
                    System.out.println(Connection.respuesta(iso, mapSubMenu.get(4), value));
                    break;

                default:

                    System.out.println("Opcion no valida, vuelva a intentar");
                    System.out.println("");
                    x = 1;
            }

        } while(x != 0);

        System.out.println("***********************************");
    }

    //Metodo para pedir el valor a cambiar
    private static double pedirValor() {

        String value = "";

        while(true) {

            try {

                System.out.print("Digite el monto a cambiar: $");
                value = input();

                return Double.valueOf(value);

            } catch (Exception e) {

                System.out.println("");
                System.out.println("El monto debe ser numerico, vuelva a intentarlo");
                System.out.println("");
            }
        }
    }

    //Metodo para pausar la ejecucion momentaneamente
    private static void waitKey() {

        System.out.println("Presione cualquier tecla para continuar");
        String x = input();
        System.out.println("");
    }
}