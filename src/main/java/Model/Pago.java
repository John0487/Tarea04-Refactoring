package Model;

public class Pago {
    private Usuario usuario;
    private double monto;
    private TipoDePago tipo;
    private Reembolso reembolso;

    public Pago(Usuario usuario, double monto, TipoDePago tipo, Reembolso reembolso){
        this.usuario = usuario;
        this.monto = monto;
        this.tipo = tipo;
        this.reembolso = reembolso;
    }

    public boolean pagoValido(){
        if (tipo==null){
            throw new IllegalStateException();
        }
        System.out.println("💳 Validando pago de $" + monto + " con " + tipo);
        return monto>0;
    }  

    public void realizarPago(){
        if (this.pagoValido()){
            System.out.println("Usuario: " + usuario.getNombre() + " ha pagado la cantidad de: " + this.getMonto() + " con: " + this.getTipo());
        }
        else {
            System.out.println("No se pudo completar el pago, intente otra vez");
        }
    }
    
    public boolean procesarReembolsoPago(){
        return reembolso.procesarReembolso(monto);
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

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public void setMonto(double monto){
        this.monto = monto;
    }

    public void setTipo(TipoDePago tipo){
        this.tipo = tipo;
    }
    
    
    public Reembolso getReembolso(){
        return this.reembolso;
    }

    public double getMontoReembolsado() {
        return reembolso.getMontoReembolsado();
    }

    public boolean getReembolsado() {
        return reembolso.getReembolsado();
    }
}
