package ChainOfResponsibility;
import Model.Problema;
import Model.EstadoProblema;
import Model.TipoProblema;

public class GerenciaCrucero extends HandlerReporte {
    
    public GerenciaCrucero(int n) {
        super(null ,"Gerencia de Crucero", n);
    }
    
    @Override
    public void atenderReporte(Problema p) {
        System.out.println("\n [GERENCIA CRUCERO] ID: " + ID + " - Procesando problema: " + p);
        
        if (p.getTipo() == TipoProblema.Critico) {
            System.out.println("  [" + nombre + "] Problema crítico resuelto con autoridad ejecutiva");
            p.setEstado(EstadoProblema.Resuelto);
            
            manejarProblemaCritico(p);
            
        } else if (p.getTipo() == TipoProblema.Leve) {
            System.out.println("   [" + nombre + "] Problema leve resuelto rápidamente");
            p.setEstado(EstadoProblema.Resuelto);
            
        } else {
            System.out.println("   [" + nombre + "] No se puede determinar el tipo de problema");
            transferirAlSiguiente(p);
        }
    }
    
    private void manejarProblemaCritico(Problema p) {
        System.out.println("Activando protocolo de emergencia");
        System.out.println("Contactando autoridades pertinentes");
        System.out.println("Notificando a stakeholders");
        System.out.println("Autorizando compensaciones excepcionales");
    }
}