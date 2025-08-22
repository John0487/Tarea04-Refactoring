package ChainOfResponsibility;

import Model.EstadoProblema;
import Model.Problema;
import Model.TipoProblema;
import Model.Usuario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;

class AgenteDeSoporteTest {
    
    @DisplayName("Comprobar que el agente de soporte maneja problemas leves")
    @Test
    void CP_05() {
        AgenteDeSoporte agente = new AgenteDeSoporte(1);
        Usuario usuario = new Usuario("Carlos", 789);
        Problema problema = new Problema(usuario, "Problema menor en el sistema", TipoProblema.Leve);

        agente.atenderReporte(problema);

        assertEquals(EstadoProblema.Resuelto, problema.getEstado());
    }
    
    @DisplayName("Comprobar que la cadena de responsabilidades funciona y la de la delegación se hace correctamente")
    @Test
    void CP_07() {
        GerenciaCrucero gerencia = new GerenciaCrucero(2);
        AgenteDeSoporte agente = new AgenteDeSoporte(1);
        agente.setNext(gerencia);
        Usuario usuario = new Usuario("Ana", 999);
        Problema problema = new Problema(usuario, "Falla crítica en sistema de navegación", TipoProblema.Critico);
        agente.atenderReporte(problema);
        assertEquals(EstadoProblema.Resuelto, problema.getEstado());
    }
}


