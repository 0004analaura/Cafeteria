package gt.edu.miumg.Sucursal;

public class Empleado {
    private String nombre;
    private String puesto;
    private int salario;

    public Empleado(String nombre, String puesto, int salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void Trabajar(Empleado empleadoCocinero){
        Empleado empleado = empleadoCocinero;
        String nombreDelEmpleado = empleado.getNombre();
        String puestoDelEmpleado = empleado.getPuesto();
        System.out.println("El empleado " + nombreDelEmpleado + " con puesto de " + puestoDelEmpleado + " hara el siguiente pedido:");
    }

    public void TomarOrden(Empleado empleadoMesero){
        Empleado empleado = empleadoMesero;
        String nombreDelEmpleado = empleado.getNombre();
        String puestoDelEmpleado = empleado.getPuesto();
        System.out.println("El empleado " + nombreDelEmpleado + " con puesto de " + puestoDelEmpleado +  " ha tomado el pedido");
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }
}
