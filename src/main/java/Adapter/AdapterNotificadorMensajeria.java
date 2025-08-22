package Adapter;
import Model.Usuario;

public class AdapterNotificadorMensajeria implements Notificador{
    public NotificadorMensajeria notificadorMensajeria;
    
    public AdapterNotificadorMensajeria(NotificadorMensajeria nm){
        this.notificadorMensajeria = nm;
    }

    @Override
    public void notificar(Usuario usuario, String test){
        if (usuario==null){
            throw new IllegalArgumentException();
        }
        notificadorMensajeria.enviarMensaje(usuario);
    }

    public NotificadorMensajeria getNotificadorMensajeria() {
        return notificadorMensajeria;
    }

    public void setNotificadorMensajeria(NotificadorMensajeria notificadorMensajeria) {
        this.notificadorMensajeria = notificadorMensajeria;
    }
}
