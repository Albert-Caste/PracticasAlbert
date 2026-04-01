import java.util.ArrayList;
import java.util.List;

public class NotificacionEmail extends  Notificable{

    private EstadoMensaje estado;
    private List<Notificable> listNotificacionEmail;

    public NotificacionEmail ( String fecha, EstadoMensaje estado){
        super(fecha);
        this.estado = estado;
        this.listNotificacionEmail = new ArrayList<>();
    }


    @Override
    public String enviarNotificacion(){
        String mensajeNotificacion = "Notificacion de Email: " + estado;


        return mensajeNotificacion;
    }

    public EstadoMensaje getEstado() {
        return estado;
    }

    public void setEstado(EstadoMensaje estado) {
        this.estado = estado;
    }

    public List<Notificable> getListNotificacionEmail() {
        return listNotificacionEmail;
    }

    public void setListNotificacionEmail(List<Notificable> listNotificacionEmail) {
        this.listNotificacionEmail = listNotificacionEmail;
    }
}
