package Model;
import FactoryMethod.Cabina;
import java.util.List;

public class Crucero {
    private int capacidad;
    private int duracion_viaje;
    Itinerario itinerario;

    public Crucero(int capacidad, int duracion_viaje, Itinerario itinerario){
        this.capacidad = capacidad;
        this.duracion_viaje = duracion_viaje;
        this.itinerario = itinerario;
    }
    public Itinerario getItinerario(){
        return itinerario;
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public int getDuracion_viaje() {
        return duracion_viaje;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setDuracion_viaje(int duracion_viaje) {
        this.duracion_viaje = duracion_viaje;
    }
}
