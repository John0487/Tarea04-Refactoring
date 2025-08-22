package Adapter;
import Model.Usuario;

public class NotificadorMensajeria {
    public void enviarMensaje(Usuario usuario){
        System.out.println("Enviando mensaje al Usuario: "+usuario.getNombre());
    }
}
