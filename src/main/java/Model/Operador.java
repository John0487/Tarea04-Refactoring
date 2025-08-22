package Model;

public class Operador {
    private String nombre;
    
    public Operador(String nombre){
        this.nombre = nombre;
    }

    public void establecerPoliticas(){
        System.out.println("Estableciendo politicas por el operador: " + nombre);
    }

    public void establecerCondicionesCabinas(){
        System.out.println("Estableciendo condiciones de cabina por el operador: " + nombre);
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
