package converter;

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

    //Getters and Setters
    public String getBase_code() {
        return base_code;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getConversion_result() {
        return conversion_result;
    }

    public void setConversion_result(double conversion_result) {
        this.conversion_result = conversion_result;
    }

    @Override
    public String toString() {

        return "" + conversion_result;
    }
}
