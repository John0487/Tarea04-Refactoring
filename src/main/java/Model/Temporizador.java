package Model;
import FactoryMethod.Cabina;
import FactoryMethod.EstadoCabina;
import java.util.List;

public class Temporizador {
    private int tiempo;

    public Temporizador(int tiempo){
        this.tiempo = tiempo;
    }

    public void liberarCabinas(List<Cabina> cabinas){
        System.out.println("Tiempo finalizado, liberando las cabinas");
        for(Cabina cabina : cabinas){
            cabina.liberar();
        }
    }

    public int getTiempo(){
        return tiempo;
    }

    public void setTiempo(int tiempo){
        this.tiempo = tiempo;
    }
}
