package Adapter;

import Model.Usuario;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.DisplayName;

class AdapterNotificadorCorreoTest {

    @DisplayName("Comprobar que se envía la notificación por email correctamente")
    @Test
    void CP_03() {
        NotificadorCorreo notificador = new NotificadorCorreo();
        AdapterNotificadorCorreo adapter = new AdapterNotificadorCorreo(notificador);
        Usuario usuario = new Usuario("Juan", 123);
        assertDoesNotThrow(() -> {
        adapter.notificar(usuario, "Mensaje de prueba");
    });
    
  }
}

