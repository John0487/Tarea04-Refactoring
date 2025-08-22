package FactoryMethod;

public interface CabinaFactory {
    public Cabina crearCabina(int n, EstadoCabina estado, double precio);
}
