package Model;

public class Pago {
    private Usuario usuario;
    private double monto;
    private TipoDePago tipo;
    private double montoReembolsado;
    private boolean reembolsado;

    public Pago(Usuario usuario, double monto, TipoDePago tipo){
        this.usuario = usuario;
        this.monto = monto;
        this.tipo = tipo;
        this.montoReembolsado = 0.0;
        this.reembolsado = false;
    }

    public boolean pagoValido(){
        System.out.println("💳 Validando pago de $" + monto + " con " + tipo);
        return monto>0;
    }  
    
    public boolean procesarReembolso(){
        if(!reembolsado){
            this.montoReembolsado = monto;
            this.reembolsado = true;
            System.out.println("Reembolso Procesado con exito la cantidad de: " + montoReembolsado);
            return true;
        }
        return false;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public double getMonto() {
        return monto;
    }

    public TipoDePago getTipo() {
        return tipo;
    }

    public double getMontoReembolsado() {
        return montoReembolsado;
    }

    public boolean getReembolsado() {
        return reembolsado;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public void setMonto(double monto){
        this.monto = monto;
    }

    public void setTipo(TipoDePago tipo){
        this.tipo = tipo;
    }

    public void setMontoReembolsado(double montoReembolsado){
        this.montoReembolsado = montoReembolsado;
    }

    public void setReembolsado(boolean reembolsado){
        this.reembolsado = reembolsado;
    }
}
