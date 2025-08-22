package Model;
import FactoryMethod.Cabina;
import java.util.List;

public class Crucero {
    private int capacidad;
    private int duracion_viaje;
    private List<Ruta> rutas;
    private List<Cabina> cabinas;
    private List<Operador> operadores;

    public Crucero(int capacidad, int duracion_viaje, List<Ruta> rutas, List<Cabina> cabinas, List<Operador> operadores){
        this.capacidad = capacidad;
        this.duracion_viaje = duracion_viaje;
        this.rutas = rutas;
        this.cabinas = cabinas;
        this.operadores = operadores;
    }

    public List<Ruta> getRutas(){
        return rutas;
    }

    public List<Cabina> getCabinas(){
        return cabinas;
    }

    public List<Operador> getOperadores(){
        return operadores;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getDuracion_viaje() {
        return duracion_viaje;
    }

    public void setRutas(List<Ruta> rutas){
        this.rutas = rutas;
    }

    public void setCabinas(List<Cabina> cabinas){
        this.cabinas = cabinas;
    }

    public void setOperadores(List<Operador> operadores){
        this.operadores = operadores;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setDuracion_viaje(int duracion_viaje) {
        this.duracion_viaje = duracion_viaje;
    }
}
