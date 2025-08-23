package Model;
import FactoryMethod.Cabina;
import java.util.List;

public class Reserva {
    private Usuario usuario;
    private List<Cabina> cabinas;
    private List<Servicios> servicios;
    private Temporizador temp;

    public Reserva(Usuario usuario, List<Cabina> cabinas, List<Servicios> servicios, Temporizador temp){
        this.usuario = usuario;
        this.cabinas = cabinas;
        this.servicios = servicios;
    }
  
    public double calcularCostoTotal() {
        boolean sinCabinas = cabinas == null || cabinas.isEmpty();
        boolean sinServicios = servicios == null || servicios.isEmpty();

        if (sinCabinas && sinServicios) {
            throw new IllegalArgumentException("No se puede calcular costo sin cabinas ni servicios");
        }
        
        double costoTotal = costoPorCabinas() + costoPorServicios();
        
        System.out.println("💰 Costo total calculado: $" + costoTotal);
        return costoTotal;
    }
    public double costoPorCabinas(){
        double monto = 0.0;
        for (Cabina cabina : cabinas) {
            monto += cabina.getPrecio();
        }
        return monto;
    }
    public double costoPorServicios(){
        double monto = 0.0;
        for (Servicios servicio : servicios) {
            monto += servicio.getPrecio();
        }
        return monto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Cabina> getCabinas() {
        return cabinas;
    }

    public List<Servicios> getServicios() {
        return servicios;
    }

    public Temporizador getTemporizador(){
        return temp;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public void setCabinas(List<Cabina> cabinas){
        this.cabinas = cabinas;
    }

    public void setServicios(List<Servicios> servicios){
        this.servicios = servicios;
    }

    public void setTemporizador(Temporizador temp){
        this.temp = temp;
    }
}
