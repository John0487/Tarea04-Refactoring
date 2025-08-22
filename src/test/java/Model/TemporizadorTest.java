package Model;

import FactoryMethod.Cabina;
import FactoryMethod.EstadoCabina;
import Model.Temporizador;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

class TemporizadorTest {

    // Clase interna para crear una cabina concreta sin crear archivo nuevo
    class CabinaTest extends Cabina {
        public CabinaTest(int n_cabina, EstadoCabina estado, double precio) {
            super(n_cabina, estado, precio);
        }
    }

    @DisplayName("Comprobar la correcta liberación de cabinas cuando el tiempo del temporizador llega a 0")
    @Test
    void CP_17_liberarCabinas_cambiaEstadoReservadoADisponible() {
        Cabina cabinaReservada = new CabinaTest(1, EstadoCabina.Reservado, 100);
        Cabina cabinaOcupada = new CabinaTest(2, EstadoCabina.Ocupada, 150);
        List<Cabina> cabinas = Arrays.asList(cabinaReservada, cabinaOcupada);
        Temporizador temporizador = new Temporizador(0);
        temporizador.liberarCabinas(cabinas);
        assertEquals(EstadoCabina.Disponible, cabinaReservada.getEstado());
        assertEquals(EstadoCabina.Disponible, cabinaOcupada.getEstado());
    }
}


