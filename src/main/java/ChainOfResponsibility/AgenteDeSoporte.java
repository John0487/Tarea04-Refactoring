package ChainOfResponsibility;
import Model.Problema;
import Model.EstadoProblema;
import Model.TipoProblema;

public class AgenteDeSoporte extends HandlerReporte {
    
    public AgenteDeSoporte(int n) {
        super(new GerenciaCrucero(n+1),"Agente de Soporte", n);
    }
    
    @Override
    public void atenderReporte(Problema p) {
        System.out.println("\n🎧 [AGENTE DE SOPORTE] ID: " + ID + " - Procesando problema: " + p);
        
        // El agente de soporte maneja principalmente problemas leves
        if (p.getTipo() == TipoProblema.Leve && 
            p.getEstado() == EstadoProblema.Abierto) {
            
            System.out.println(" [" + nombre + "] Problema leve resuelto mediante soporte técnico");
            p.setEstado(EstadoProblema.Resuelto);
            
            // Acciones específicas de soporte
            proporcionarSoporteTecnico(p);
            
        } else if (p.getTipo() == TipoProblema.Critico) {
            System.out.println(" [" + nombre + "] Problema crítico requiere escalación a gerencia");
            transferirAlSiguiente(p);
            
        } else {
            System.out.println(" [" + nombre + "] No puedo manejar este problema");
            transferirAlSiguiente(p);
        }
    }
    
    private void proporcionarSoporteTecnico(Problema p) {
        System.out.println("Ejecutando diagnóstico técnico");
        System.out.println("Aplicando solución estándar");
        System.out.println("Enviando confirmación al usuario: " + p.getUsuario().getNombre());
        System.out.println("Documentando solución en base de conocimiento");
    }
}