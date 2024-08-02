package gt.edu.miumg.Sucursal;

import gt.edu.miumg.Ingredientes.Agua;
import gt.edu.miumg.Ingredientes.Azucar;
import gt.edu.miumg.Ingredientes.Leche;
import gt.edu.miumg.Ingredientes.Grano;


public class SucursalRoma extends Sucursal{
    private String horario;

    public SucursalRoma(String nombre, String direccion, String horario){
        super(nombre,direccion);
        this.horario = horario;
    }

    @Override
    public Empleado agregarEmpleado(Empleado empleado) {
        return empleado;
    }

    @Override
    public Equipo agregarEquipo(Equipo equipo) {
        return equipo;
    }

    @Override
    public void agregarIngrediente() {
        // Agregamos el primer ingrediente: AGUA
        Agua agua = new Agua("Agua Pura", 30);
        String nombreDelPrimerIngrediente = agua.ObtenerNombre();
        double cantidadDisponileDelPrimerIngrediente = agua.ObtenerCantidad();

        // Agregamos el segundo ingrediente: GRANO
        Grano grano = new Grano("Grano de Cafe", "entero", 10);
        String nombreDelSegundoIngrediente = grano.ObtenerNombre();
        String tipoDelSegundoIngrediente = grano.getTipo();
        double cantidadDisponibleDelSegundoIngrediente = grano.ObtenerCantidad();

        // Agregamos el tercer ingrediente: AZUCAR
        Azucar azucar = new Azucar("Azucar", 5);
        String nombreDelTercerIngrediente = azucar.ObtenerNombre();
        double cantidadDisponibleDelTercerIngrediente = azucar.ObtenerCantidad();

        // Agregamos el cuarto ingrediente: LECHE
        Leche leche = new Leche("Leche", "Fresca Pasteurizada", 10);
        String nombreDelCuartoIngrediente = leche.ObtenerNombre();
        String tipoDelCuartoIngrediente = leche.getTipo();
        double cantidadDisponibleDelCuartoIngrediente = leche.ObtenerCantidad();

        // Imprimimos los ingredientes ingresados
        String nombreDeLaSucursal = SucursalRoma.getNombre();
        System.out.println("Los ingredientes ingresados a la sucursal " + nombreDeLaSucursal + " son: \n" +
                "1. " + nombreDelPrimerIngrediente + " con cantidad disponible de " + cantidadDisponileDelPrimerIngrediente + " Galones.\n" +
                "2. " + nombreDelSegundoIngrediente + " de tipo " + tipoDelSegundoIngrediente + " con cantidad disponible de " + cantidadDisponibleDelSegundoIngrediente + " Quintales.\n" +
                "3. " + nombreDelTercerIngrediente + " con cantidad disponible de " + cantidadDisponibleDelTercerIngrediente + " Quintales.\n" +
                "4. " + nombreDelCuartoIngrediente + " de tipo " + tipoDelCuartoIngrediente + " con cantidad disponible de " + cantidadDisponibleDelCuartoIngrediente + " Galones.");

    }

    @Override
    public void agregarEspecialidad() {
        String especialidad = super.setEspecialidad("Cafe Espresso Italiano");
        System.out.println("Esta sucursal se especializa en servir " + especialidad);
    }
}