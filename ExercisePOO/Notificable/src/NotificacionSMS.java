import java.util.ArrayList;
import java.util.List;

public class NotificacionSMS extends Notificable{

    private EstadoMensaje estadoSms;
    private List<Notificable> listNotificacionSMS;

    public NotificacionSMS(String fecha, EstadoMensaje estadoSms) {
        super(fecha);
        this.estadoSms = estadoSms;
        this.listNotificacionSMS = new ArrayList<>();
    }

    @Override

    public String enviarNotificacion(){
        String mensajeSMS =" Notificacion de SMS : " + estadoSms;

        return mensajeSMS;
    }

    public EstadoMensaje getEstadoSms() {
        return estadoSms;
    }

    public void setEstadoSms(EstadoMensaje estadoSms) {
        this.estadoSms = estadoSms;
    }

    public List<Notificable> getListNotificacionSMS() {
        return listNotificacionSMS;
    }

    public void setListNotificacionSMS(List<Notificable> listNotificacionSMS) {
        this.listNotificacionSMS = listNotificacionSMS;
    }
}
