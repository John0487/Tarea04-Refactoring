package Model;

import java.util.List;

import FactoryMethod.Cabina;

public class Itinerario {
    private List<Ruta> rutas;
    private List<Cabina> cabinas;
    private List<Operador> operadores;


    public List<Ruta> getRutas(){
        return rutas;
    }

    public List<Cabina> getCabinas(){
        return cabinas;
    }

    public List<Operador> getOperadores(){
        return operadores;
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

    public void agregarRuta(Ruta ruta) {
        rutas.add(ruta);
    }

    public void agregarCabina(Cabina cabina) {
        cabinas.add(cabina);
    }

    public void agregarOperador(Operador operador) {
        operadores.add(operador);
    }
}
