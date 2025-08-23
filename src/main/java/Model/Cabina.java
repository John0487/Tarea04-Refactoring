package FactoryMethod;

import java.util.List;

public abstract class Cabina {
    protected int n_cabina;
    protected EstadoCabina estado;
    protected double precio;
    
    public Cabina(int n_cabina, EstadoCabina estado, double precio){
        this.n_cabina = n_cabina;
        this.precio = precio;
        this.estado = estado;
    }

    public void liberar(){
        if (this.getEstado() == EstadoCabina.Reservado) {
            this.setEstado(EstadoCabina.Disponible);
            System.out.println("Cabina " + this.getN_cabina() + " liberada automáticamente");
        }
    }   

    public int getN_cabina() {
        return n_cabina;
    }

    public EstadoCabina getEstado() {
        return estado;
    }

    public double getPrecio() {
        return precio;
    }
    

    public void setN_cabina(int n_cabina) {
        this.n_cabina = n_cabina;
    }

    public void setEstado(EstadoCabina estado) {
        this.estado = estado;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cabina other = (Cabina) obj;
        if (this.n_cabina != other.n_cabina) {
            return false;
        }
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        return this.estado == other.estado;
    }

    
}
