package FactoryMethod;

public class CabinaBalconFactory implements CabinaFactory{

    @Override
    public Cabina crearCabina(int n, EstadoCabina estado, double precio) {
        if (estado == null) {
        throw new IllegalArgumentException("El estado no puede ser null");
        }
        return new CabinaBalcon(n, estado, precio);
    }

}
