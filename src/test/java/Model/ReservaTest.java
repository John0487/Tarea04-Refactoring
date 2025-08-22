package Model;

import FactoryMethod.Cabina;
import FactoryMethod.EstadoCabina;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

class ReservaTest {

    //Clase concreta para pruebas
    static class CabinaSimple extends Cabina {
        public CabinaSimple(int n_cabina, EstadoCabina estado, double precio) {
            super(n_cabina, estado, precio);
        }
    }
    
    
    @DisplayName("Verificar cálculo correcto del costo total")
    @Test
    void CP_08() {
        Usuario usuario = new Usuario("Maria", 1001);
        Cabina cabina1 = new CabinaSimple(1, EstadoCabina.Disponible, 100.0);
        Cabina cabina2 = new CabinaSimple(2, EstadoCabina.Disponible, 150.0);
        Servicios servicio = new Servicios("Spa", "Acceso al spa", 50.0);
        Reserva reserva = new Reserva(usuario,
                Arrays.asList(cabina1, cabina2),
                Arrays.asList(servicio),
                null);
        double costoEsperado = 100.0 + 150.0 + 50.0;
        double costoCalculado = reserva.calcularCostoTotal();
        assertEquals(costoEsperado, costoCalculado);
    }

    @DisplayName("Comprobar que no puede haber una reserva sin cabinas y sin servicios")
    @Test
    void CP_09() {
        Usuario usuario = new Usuario("Maria", 1001);
        Reserva reserva = new Reserva(usuario,
                Collections.emptyList(),
                Collections.emptyList(),
                null);
        assertThrows(IllegalArgumentException.class, () -> {
            reserva.calcularCostoTotal();
        });
    }
}


