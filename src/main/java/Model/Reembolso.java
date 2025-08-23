package Model;

public class Reembolso {
    private double montoReembolsado;
    private boolean reembolsado;
    
    public Reembolso(){
        this.montoReembolsado = 0.0;
        this.reembolsado = false;
    }

    public boolean procesarReembolso(double monto){
        if(!reembolsado){
            this.montoReembolsado = monto;
            this.reembolsado = true;
            System.out.println("Reembolso Procesado con exito la cantidad de: " + montoReembolsado);
            return true;
        }
        return false;
    }

    public double getMontoReembolsado() {
        return montoReembolsado;
    }

    public boolean getReembolsado() {
        return reembolsado;
    }

    public void setMontoReembolsado(double montoReembolsado){
        this.montoReembolsado = montoReembolsado;
    }

    public void setReembolsado(boolean reembolsado){
        this.reembolsado = reembolsado;
    }
}
