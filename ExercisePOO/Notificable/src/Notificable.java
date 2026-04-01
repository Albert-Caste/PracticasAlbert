

public abstract  class Notificable {

    private String fecha;

    public Notificable(String fecha) {
        this.fecha = fecha;
    }

    public abstract String enviarNotificacion();

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
