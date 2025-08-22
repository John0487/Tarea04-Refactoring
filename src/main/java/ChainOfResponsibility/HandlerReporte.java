package ChainOfResponsibility;
import Model.EstadoProblema;
import Model.Problema;

public abstract class HandlerReporte{
    protected HandlerReporte nextHandler;
    protected String nombre;
    protected int ID;

    public HandlerReporte(String nombre, int ID){
        this.nombre = nombre;
        this.ID = ID;
    }
    
    public HandlerReporte(HandlerReporte nextHandler, String nombre, int ID) {
        this.nextHandler = nextHandler;
        this.nombre = nombre;
        this.ID = ID;
    }
    
    public void setNext(HandlerReporte h) {
        this.nextHandler = h;
    }
    
    public abstract void atenderReporte(Problema p);
    
    protected void transferirAlSiguiente(Problema problema) {
        if (nextHandler != null) {
            System.out.println("   → [" + nombre + "] Transfiriendo al siguiente nivel...");
            nextHandler.atenderReporte(problema);
        } else {
            System.out.println("  X [" + nombre + "] No hay más niveles para manejar el reporte");
            problema.setEstado(EstadoProblema.Cerrado); 
        }
    }
    
    public String getNombre(){
        return nombre;
    }

    public int getID(){
        return ID; 
    }
    
    public HandlerReporte getNextHandler(){ 
        return nextHandler;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setID(int ID) {
        this.ID = ID;
    }
}