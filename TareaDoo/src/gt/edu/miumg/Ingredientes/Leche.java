package gt.edu.miumg.Ingredientes;

public class Leche implements Ingrediente{

    private String nombre;
    private String tipo;
    private double cantidad;

    public Leche(String nombre, String tipo, double cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
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
