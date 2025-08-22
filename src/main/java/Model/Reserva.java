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
        if ((cabinas == null || cabinas.isEmpty()) && (servicios == null || servicios.isEmpty())) {
            throw new IllegalArgumentException("No se puede calcular costo sin cabinas ni servicios");
        }

        double costoTotal = 0.0;
        for (Cabina cabina : cabinas) {
            costoTotal += cabina.getPrecio();
        }

        for (Servicios servicio : servicios) {
            costoTotal += servicio.getPrecio();
        }

        System.out.println("💰 Costo total calculado: $" + costoTotal);
        return costoTotal;
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
