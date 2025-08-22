package Adapter;

import Adapter.AdapterNotificadorSMS;
import Model.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

class AdapterNotificadorSMSTest {

    @DisplayName("Comprobar que se envía el SMS correctamente")
    @Test
    void CP_18_notificar_usuarioValido_enviaSMS_sinError() {
        Usuario usuario = new Usuario("Juan", 123);
        NotificadorSMS notificadorSMS = new NotificadorSMS();
        AdapterNotificadorSMS adapter = new AdapterNotificadorSMS(notificadorSMS);
        assertDoesNotThrow(() -> adapter.notificar(usuario, "test"));
    }
}


