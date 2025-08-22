package Model;
import java.time.LocalDate;

public class Ruta {
    private String nombre;
    private LocalDate fecha;
    private String inicio;
    private String destino;


    public Ruta(String nombre, LocalDate fecha, String inicio, String destino){
        this.nombre = nombre;
        this.fecha = fecha;
        this.inicio = inicio;
        this.destino = destino;
    }


    public String getNombre() {
        return nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getInicio() {
        return inicio;
    }

    public String getDestino() {
        return destino;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }


}
