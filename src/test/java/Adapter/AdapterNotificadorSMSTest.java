package Adapter;

import Adapter.AdapterNotificadorSMS;
import Model.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

class AdapterNotificadorSMSTest {

    @DisplayName("Comprobar que se envía el SMS correctamente")
    @Test
    void CP_18() {
        Usuario usuario = new Usuario("Juan", 123);
        NotificadorSMS notificadorSMS = new NotificadorSMS();
        AdapterNotificadorSMS adapter = new AdapterNotificadorSMS(notificadorSMS);
        assertDoesNotThrow(() -> adapter.notificar(usuario, "test"));
    }
    
    @DisplayName("Validar que no se puede enviar notificación a un usuario nulo.")
    @Test
    void CP_23() {
        Usuario usuario = null;
        NotificadorSMS notificadorSMS = new NotificadorSMS();
        AdapterNotificadorSMS adapter = new AdapterNotificadorSMS(notificadorSMS);
        assertThrows(IllegalArgumentException.class, () -> {
            adapter.notificar(usuario, "test");
        });
    }
}


