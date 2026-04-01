import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main (String []args){
        List<Notificable> listNotificaciones =new ArrayList<>();


        Notificable notificacionSms1 = new NotificacionSMS("hoy", EstadoMensaje.ERROR);
        Notificable notificableEmail = new NotificacionEmail("ayer", EstadoMensaje.ENVIADO);

        NotificacionEmail notificacionEmail2 = new NotificacionEmail("hoy", EstadoMensaje.ENVIANDOeMAIL);
        NotificacionSMS notificacionSMS2 = new NotificacionSMS("mañana :D", EstadoMensaje.ENVIADO);



        listNotificaciones.add(notificacionSms1);
        listNotificaciones.add(notificacionSMS2);
        listNotificaciones.add(notificacionEmail2);
        listNotificaciones.add(notificableEmail);

        System.out.println(recorrerLista(listNotificaciones));



    }

    public static String recorrerLista (List<Notificable> lista){
        String concatenacionLista = "";
        for (Notificable n : lista){
            concatenacionLista+= n.getFecha() +"  " + n.enviarNotificacion() + "\n";


        }
        return concatenacionLista;
    }
}
