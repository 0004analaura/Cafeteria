package gt.edu.miumg.Sucursal;
import gt.edu.miumg.Ingredientes.Agua;
import gt.edu.miumg.Ingredientes.Azucar;
import gt.edu.miumg.Ingredientes.Grano;


public class SucursalBogota extends Sucursal{
    private String telefono;

    public SucursalBogota(String nombre, String direccion, String telefono){
        super(nombre,direccion);
        this.telefono = telefono;
    }

    @Override
    public void agregarIngrediente() {
        // Agregamos el primer ingrediente: AGUA
        Agua agua = new Agua("Agua Pura", 20);
        String nombreDelPrimerIngrediente = agua.ObtenerNombre();
        double cantidadDisponileDelPrimerIngrediente = agua.ObtenerCantidad();

        // Agregamos el segundo ingrediente: GRANO
        Grano grano = new Grano("Grano de Cafe", "molido", 5);
        String nombreDelSegundoIngrediente = grano.ObtenerNombre();
        String tipoDelSegundoIngrediente = grano.getTipo();
        double cantidadDisponibleDelSegundoIngrediente = grano.ObtenerCantidad();

        // Agregamos el tercer ingrediente: AZUCAR
        Azucar azucar = new Azucar("Azucar", 3);
        String nombreDelTercerIngrediente = azucar.ObtenerNombre();
        double cantidadDisponibleDelTercerIngrediente = azucar.ObtenerCantidad();

        // Imprimimos los ingredientes ingresados
        String nombreDeLaSucursal = SucursalBogota.getNombre();
        System.out.println("Los ingredientes ingresados a la sucursal " + nombreDeLaSucursal + " son: \n" +
                "1. " + nombreDelPrimerIngrediente + " con cantidad disponible de " + cantidadDisponileDelPrimerIngrediente + " Galones.\n" +
                "2. " + nombreDelSegundoIngrediente + " de tipo " + tipoDelSegundoIngrediente + " con cantidad disponible de " + cantidadDisponibleDelSegundoIngrediente + " Quintales.\n" +
                "3. " + nombreDelTercerIngrediente + " con cantidad disponible de " + cantidadDisponibleDelTercerIngrediente + " Quintales.");
    }

    @Override
    public void agregarEspecialidad() {
        String especialidad = super.setEspecialidad("Cafe Colombiano");
        System.out.println("Esta sucursal se especializa en servir " + especialidad);
    }

    @Override
    public Equipo agregarEquipo(Equipo equipo) {
        return equipo;
    }

    @Override
    public Empleado agregarEmpleado(Empleado empleado) {
        return empleado;
    }
}