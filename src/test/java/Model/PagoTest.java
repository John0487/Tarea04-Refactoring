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
    
    @DisplayName("Asegurar que solo se aceptan tipos de pago válidos")
    @Test
    void CP_21(){
        Usuario usuario = new Usuario("Carlos",1);
        Pago pago = new Pago(usuario, 100.0, null);
         assertThrows(IllegalStateException.class, () -> {
            pago.pagoValido();
        });
    }
    
    @DisplayName("Validar que no se permite procesar reembolsos duplicados")
    @Test
    void CP_22(){
        Usuario usuario = new Usuario("Carlos",1);
        Pago pago = new Pago(usuario, 100.0, TipoDePago.TarjetaDeDebito);
        pago.procesarReembolso();
        assertFalse(pago.procesarReembolso());
    }
}

