package Adapter;
import Model.Usuario;

public class AdapterNotificadorCorreo implements Notificador{
    public NotificadorCorreo notificadorCorreo;

    public AdapterNotificadorCorreo(NotificadorCorreo nc){
        this.notificadorCorreo = nc;
    }

    @Override
    public void notificar(Usuario usuario, String test){
        notificadorCorreo.enviarCorreo(usuario);
    }

    public NotificadorCorreo getNotificadorCorreo() {
        return notificadorCorreo;
    }

    public void setNotificadorCorreo(NotificadorCorreo notificadorCorreo) {
        this.notificadorCorreo = notificadorCorreo;
    }
}
