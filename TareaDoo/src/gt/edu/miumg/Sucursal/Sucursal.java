package gt.edu.miumg.Sucursal;

public abstract class Sucursal {
    private static String nombre;
    private String direccion;
    private String especialidad;

    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public static String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String setEspecialidad(String especialidad) {
        return this.especialidad = especialidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public abstract Empleado agregarEmpleado(Empleado empleado);
    public abstract void agregarIngrediente();
    public abstract Equipo agregarEquipo(Equipo equipo);
    public abstract void agregarEspecialidad();
}