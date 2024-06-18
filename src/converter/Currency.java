package converter;

public class Currency {

    //Atributos
    String base_code;
    String nombre;

    //Constructor
    public Currency(String base_code, String nombre) {

        this.base_code = base_code;
        this.nombre = nombre;
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
}
