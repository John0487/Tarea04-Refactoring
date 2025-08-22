package Model;

import FactoryMethod.Cabina;
import FactoryMethod.EstadoCabina;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

class UsuarioTest {

    // Clase concreta para pruebas
    static class CabinaSimple extends Cabina {
        public CabinaSimple(int n_cabina, EstadoCabina estado, double precio) {
            super(n_cabina, estado, precio);
        }
    }

    @DisplayName("Probar flujo normal de reserva")
    @Test
    void CP_10() {
        Usuario usuario = new Usuario("Juan", 101);
        Cabina cabina = new CabinaSimple(1, EstadoCabina.Disponible, 100);
        Servicios servicio = new Servicios("Wifi", "Internet a bordo", 20);
        Reserva reserva = usuario.hacerReserva(null,
                Arrays.asList(cabina),
                Arrays.asList(servicio));
        assertNotNull(reserva);
    }

    @DisplayName("Validar manejo de cabinas sin disponibilidad")
    @Test
    void CP_11() {
        Usuario usuario = new Usuario("Juan", 101);
        Cabina cabinaOcupada = new CabinaSimple(1, EstadoCabina.Ocupada, 100);
        assertThrows(IllegalStateException.class, () -> {
            usuario.hacerReserva(null,
                    Arrays.asList(cabinaOcupada),
                    Collections.emptyList());
        });
    }

    @DisplayName("Comprobar que se puede hacer correctamente un pago")
    @Test
    void CP_12() {
        Usuario usuario = new Usuario("Ana", 1);
        Pago pago = new Pago(usuario, 100.0, TipoDePago.TarjetaDeCredito);
        usuario.setPago(pago);
        assertDoesNotThrow(() -> usuario.realizarPago());
    }

    @DisplayName("Comprobar que no se puede realizar un pago con monto negativo")
    @Test
    void CP_13() {
        Usuario usuario = new Usuario("Ana", 1);
        Pago pago = new Pago(usuario, -50.0, TipoDePago.Efectivo);
        usuario.setPago(pago);

        assertThrows(IllegalArgumentException.class, () -> usuario.realizarPago());
    }
}


