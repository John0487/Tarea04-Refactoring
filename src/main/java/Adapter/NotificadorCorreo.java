package Adapter;
import Model.Usuario;

public class NotificadorCorreo {
    public void enviarCorreo(Usuario usuario){
        System.out.println("Enviando correo al Usuario: "+usuario.getNombre());
    }
}
