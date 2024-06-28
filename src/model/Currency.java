package model;

public class Currency {

    //Atributos
    String base_code;
    String nombre;
    double conversion_result;

    //Constructor
    public Currency(String base_code, String nombre) {

        this.base_code = base_code;
        this.nombre = nombre;
        this.conversion_result = 0.0;
    }

    //Getters
    public String getBase_code() {
        return base_code;
    }

    public String getNombre() {
        return nombre;
    }

    public double getConversion_result() {
        return conversion_result;
    }
}
