package FactoryMethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;


public class SuiteFactoryTest {
    @DisplayName("Verificar creación de suite")
    @Test
    public void CP_01(){
        int n = 1;
        EstadoCabina estado = EstadoCabina.Disponible;
        double precio = 400;
        SuiteFactory sf = new SuiteFactory();
        CabinaSuite cs = new CabinaSuite(1,estado,precio);
        assertEquals(cs,sf.crearCabina(n, estado, precio));
    }
}
