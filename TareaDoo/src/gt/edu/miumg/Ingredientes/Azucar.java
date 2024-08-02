package gt.edu.miumg.Ingredientes;

public class Azucar implements Ingrediente{
    private String nombre;
    private double cantidad;

    public Azucar(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    @Override
    public String ObtenerNombre() {
        return nombre;
    }

    @Override
    public double ObtenerCantidad() {
        return this.cantidad = cantidad;
    }
}
