package Adapter;
import Model.Usuario;

public class AdapterNotificadorSMS implements Notificador{
    public NotificadorSMS notificadorSMS;

    public AdapterNotificadorSMS(NotificadorSMS ns){
        this.notificadorSMS = ns;
    }

    @Override
    public void notificar(Usuario usuario, String test){
        if (usuario==null){
            throw new IllegalArgumentException();
        }
        notificadorSMS.enviarSMS(usuario);
    }

    public NotificadorSMS getNotificadorSMS() {
        return notificadorSMS;
    }

    public void setNotificadorSMS(NotificadorSMS notificadorSMS) {
        this.notificadorSMS = notificadorSMS;
    }  
}
