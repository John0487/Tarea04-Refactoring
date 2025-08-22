package Adapter;
import Model.Usuario;

public class NotificadorSMS {
    public void enviarSMS(Usuario usuario){
        System.out.println("Enviando SMS al Usuario: "+usuario.getNombre());
    }
}
