package FactoryMethod;

public class CabinaInteriorFactory implements CabinaFactory{
    @Override
    public Cabina crearCabina(int n, EstadoCabina estado, double precio) {
        if (estado == null) {
        throw new IllegalArgumentException("El estado no puede ser null");
        }
        return new CabinaFamiliar(n, estado, precio);
    }
}
