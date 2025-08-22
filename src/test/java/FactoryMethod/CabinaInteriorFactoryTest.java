package FactoryMethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

public class CabinaInteriorFactoryTest {
    @DisplayName("Comprobar manejo de estado de cabina invalido")
    @Test
    public void CP_02() {
        int n = 2;
        EstadoCabina estado = null;
        double precio = 100;
        CabinaInteriorFactory instance = new CabinaInteriorFactory();
        assertThrows(IllegalArgumentException.class, () -> {
        instance.crearCabina(n, estado, precio);
        });
    }
   
}
