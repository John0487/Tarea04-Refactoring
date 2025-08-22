package Model;
import FactoryMethod.Cabina;
import ChainOfResponsibility.HandlerReporte;
import FactoryMethod.EstadoCabina;
import java.util.List;

public class Usuario {
    private String nombre;
    private int ID;
    private Pago pago;
    private List<Problema> problemas;

    public Usuario(String nombre, int ID){
        this.nombre = nombre;
        this.ID = ID;
        this.pago = pago;
        this.problemas = problemas;
    }

    public Reserva hacerReserva(Crucero crucero, List<Cabina> cabinas, List<Servicios> servicios){
        System.out.println("Realizando reserva por usuario : " + nombre + " con ID: " + ID);

        for (Cabina c : cabinas) {
            if (c.getEstado() != EstadoCabina.Disponible) {
                throw new IllegalStateException("Cabina " + c.getN_cabina() + " no está disponible");
            }
        }
        Reserva reserva = new Reserva(this, cabinas, servicios, new Temporizador(300));
        reserva.calcularCostoTotal();
        return reserva;
    }



    public void reportarProblemas(Problema p, HandlerReporte hr){
        System.out.println("Problema sera atendido en breve");
        hr.atenderReporte(p);
    }

    public void realizarPago(){
        if (pago.pagoValido()){
            System.out.println("Usuario: " + nombre + " ha pagado la cantidad de: " + pago.getMonto() + " con: " + pago.getTipo());
        }
        else {
            System.out.println("No se pudo completar el pago, intente otra vez");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getID() {
        return ID;
    }

    public Pago getPago() {
        return pago;
    }

    public List<Problema> getProblemas(){
        return problemas;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public void setPago(Pago pago){
        this.pago = pago;
    }

    public void setProblemas(List<Problema> problemas){
        this.problemas = problemas;
    }

}
