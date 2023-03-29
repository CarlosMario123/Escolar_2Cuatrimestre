public class UtilesEscolares implements Comparable<UtilesEscolares> {

    private String descripcion;
    private int cantidadAComprar;
    private int cantidadComprada;

    public UtilesEscolares(String descripcion, int cantidadAComprar, int cantidadComprada) {
        this.descripcion = descripcion;
        this.cantidadAComprar = cantidadAComprar;
        this.cantidadComprada = cantidadComprada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int obtenerDiferencia() {
        return cantidadAComprar - cantidadComprada;
    }

    public void modificarCantidadComprada(int cantidadComprada) {
        this.cantidadComprada = cantidadComprada;
    }

    @Override
    public String toString() {
        String  mensaje = descripcion + " - "  + obtenerDiferencia() * -1 + " existe de sobra";
        if(obtenerDiferencia() > -1){
           mensaje =  descripcion + " - " + obtenerDiferencia() + " unidades pendientes";
        }
        return mensaje;
    }

    @Override
    public int compareTo(UtilesEscolares otroElemento) {
        return this.descripcion.compareTo(otroElemento.descripcion);
    }
}