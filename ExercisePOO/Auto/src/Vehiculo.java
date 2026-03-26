import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    private String modelo;
    private double velocidad;
    private List<Vehiculo> listVehiculo;

    public Vehiculo(String modelo, double velocidad){
        this.modelo = modelo;
        this.velocidad=velocidad;
        this.listVehiculo = new ArrayList<>();
    }




    public void accelerateVehicle(double velocidad, Vehiculo vehiculo){
        vehiculo.setVelocidad(velocidad);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public List<Vehiculo> getListVehiculo() {
        return listVehiculo;
    }

    public void setListVehiculo(List<Vehiculo> listVehiculo) {
        this.listVehiculo = listVehiculo;
    }
}
