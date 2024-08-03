package gt.edu.miumg.pasteleria;

public class Cobertura implements Ingredientes{
    private String tipo;
    private int cantidad;

    public Cobertura(String tipo, int cantidad)
    {
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return tipo;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
