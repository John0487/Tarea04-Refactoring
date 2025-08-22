package Adapter;

import Model.Usuario;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.DisplayName;

class AdapterNotificadorMensajeriaTest {

    @DisplayName("Comprobar que se envía el mensaje correctamente")
    @Test
    void CP_04() {
        NotificadorMensajeria notificador = new NotificadorMensajeria();
        AdapterNotificadorMensajeria adapter = new AdapterNotificadorMensajeria(notificador);
        Usuario usuario = new Usuario("Pedro", 456);
        assertDoesNotThrow(() -> {
        adapter.notificar(usuario, "Mensaje de prueba");
    });
    }
}

