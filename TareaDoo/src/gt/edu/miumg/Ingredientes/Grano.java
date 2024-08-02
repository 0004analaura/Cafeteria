package gt.edu.miumg.Ingredientes;

public class Grano implements Ingrediente{
    private String nombre;
    private String tipo;
    private double cantidad;

    public Grano(String nombre, String tipo, double cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public String setTipo() {
        return this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public double ObtenerCantidad() {
        return this.cantidad = cantidad;
    }

    @Override
    public String ObtenerNombre() {
        return nombre;
    }
}