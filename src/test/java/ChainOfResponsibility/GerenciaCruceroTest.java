package ChainOfResponsibility;

import Model.EstadoProblema;
import Model.Problema;
import Model.TipoProblema;
import Model.Usuario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;

class GerenciaCruceroTest {

    @DisplayName("Comprobar que el gerente del crucero maneja problemas críticos")
    @Test
    void CP_06() {
        GerenciaCrucero gerencia = new GerenciaCrucero(1);
        Usuario usuario = new Usuario("Luis", 101);
        Problema problema = new Problema(usuario, "Falla grave en el motor principal", TipoProblema.Critico);
        gerencia.atenderReporte(problema);
        assertEquals(EstadoProblema.Resuelto, problema.getEstado());
    }
}
