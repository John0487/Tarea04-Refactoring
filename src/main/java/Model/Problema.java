package Model;

public class Problema {
    private Usuario usuario;
    private String descripcion;
    private EstadoProblema estado;
    private TipoProblema tipo;

    public Problema(Usuario usuario, String descripcion, TipoProblema tipo){
        this.usuario = usuario;
        this.descripcion = descripcion;
        this.estado = EstadoProblema.Abierto;
        this.tipo = tipo;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public EstadoProblema getEstado() {
        return estado;
    }

    public TipoProblema getTipo() {
        return tipo;
    }
    public String getNombreUsuario(){
        return usuario.getNombre();
    }

    public void setEstado(EstadoProblema estado){
        this.estado = estado;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public void setTipo(TipoProblema tipo){
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "'" + descripcion + "' (Tipo de problema: " + tipo + ", Estado: " + estado + ")";
    }

}
