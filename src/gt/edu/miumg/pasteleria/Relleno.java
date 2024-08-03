package gt.edu.miumg.pasteleria;

public class Relleno implements Ingredientes{
    private String sabor;
    private int cantidad;

    public Relleno(String sabor, int cantidad)
    {
        this.sabor = sabor;
        this.cantidad = cantidad;
    }

    @Override
    public String obtenerNombre() {
        return sabor;
    }

    @Override
    public int obtenerCantidad() {
        return cantidad;
    }
}
