package Model;

import Model.Pago;
import Model.TipoDePago;
import Model.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

class PagoTest {

    
    @DisplayName("Comprobar la validación de un pago valido")
    @Test
    void CP_14() {
        Usuario usuario = new Usuario("Carlos", 1);
        Pago pago = new Pago(usuario, 100.0, TipoDePago.TarjetaDeCredito);
        assertTrue(pago.pagoValido());
    }

    @DisplayName("Comprobar la validación de un pago invalido")
    @Test
    void CP_15() {
        Usuario usuario = new Usuario("Carlos", 1);
        Pago pago = new Pago(usuario, 0.0, TipoDePago.TarjetaDeCredito);
        assertFalse(pago.pagoValido());
    }

    @DisplayName("Comprobar que se puede realizar un reembolso correctamente")
    @Test
    void CP_16() {
        Usuario usuario = new Usuario("Carlos", 1);
        Pago pago = new Pago(usuario, 100.0, TipoDePago.TarjetaDeDebito);
        assertTrue(pago.procesarReembolso());
    }
}

