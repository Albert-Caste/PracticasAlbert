public class Cajero {
    private String nombre;
    private int id;
    private double baseDinero;

    public Cajero(String nombre, int id, double baseDinero) {
        this.nombre = nombre;
        this.id = id;
        this.baseDinero = baseDinero;
    }


    //Get and set


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseDinero() {
        return baseDinero;
    }

    public void setBaseDinero(double baseDinero) {
        this.baseDinero = baseDinero;
    }
}
