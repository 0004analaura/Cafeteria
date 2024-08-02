package gt.edu.miumg.Sucursal;
import gt.edu.miumg.Cafe.CafeColombiano;
import gt.edu.miumg.Cafe.CafeEspressoItaliano;
import gt.edu.miumg.Sucursal.Empleado;
import gt.edu.miumg.Sucursal.Equipo;
import gt.edu.miumg.Sucursal.SucursalBogota;
import gt.edu.miumg.Sucursal.SucursalRoma;

import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        // Hacemos una condicional switch para probar hacer un cafe en cualquiera de las dos sucursales
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige cualquiera de las opciones:\n" +
                "1.  Sucursal de Bogota.\n" +
                "2. Sucursal de Roma");
        String opcion = sc.nextLine();
        switch (opcion) {
            case "1":
                sucursalBogota();
                break;
            case "2":
                sucursalRoma();
                break;
        }

    }

    public static void sucursalBogota() {

        SucursalBogota sucursalBogota = new SucursalBogota("Cafesito","Bogota", "54896321");
        String nombreDeLaSucursal = SucursalBogota.getNombre();
        String direccionDeLaSucursal = sucursalBogota.getDireccion();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Bienvenido a la Sucursal " + nombreDeLaSucursal + " ubicada en " + direccionDeLaSucursal);
        sucursalBogota.agregarEspecialidad();
        System.out.println("--------------------------------------------------------------------------------");
        sucursalBogota.agregarIngrediente();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Preparar el pedido del cliente");
        System.out.println("--------------------------------------------------------------------------------");


        Empleado marvin = new Empleado("Luisa", "mesera", 1500);
        Empleado empleadoLuisa = sucursalBogota.agregarEmpleado(marvin);
        empleadoLuisa.TomarOrden(empleadoLuisa);
        System.out.println("--------------------------------------------------------------------------------");


        Empleado Pedro = new Empleado("Pedro", "cocinero", 2000);
        Empleado empleadoPedro = sucursalBogota.agregarEmpleado(Pedro);


        empleadoPedro.Trabajar(empleadoPedro);
        System.out.println("--------------------------------------------------------------------------------");
        CafeColombiano cafeColombiano = new CafeColombiano("Cafe a la colombia","taza mediana","Molido", 10);
        cafeColombiano.Preparar(cafeColombiano);
        System.out.println("--------------------------------------------------------------------------------");


        Equipo cafetera = new Equipo("French press", "Activa");
        Equipo frenchPress = sucursalBogota.agregarEquipo(cafetera);
        frenchPress.encenderEquipo();
        System.out.println("--------------------------------------------------------------------------------");
        frenchPress.apagarEquipo();
        System.out.println("--------------------------------------------------------------------------------");


        cafeColombiano.Servir(cafeColombiano);
        System.out.println("--------------------------------------------------------------------------------");
    }

    public static void sucursalRoma(){
        // creamos una sucursal de roma y esta se especializa en cafe espresso italiano
        SucursalRoma sucursalRoma = new SucursalRoma("ElSabor","Roma", "de 7 a 9");
        String nombreDeLaSucursal = SucursalRoma.getNombre();
        String direccionDeLaSucursal = sucursalRoma.getDireccion();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Bienvenido a la Sucursal " + nombreDeLaSucursal + " ubicada en " + direccionDeLaSucursal);
        sucursalRoma.agregarEspecialidad();
        System.out.println("--------------------------------------------------------------------------------");
        sucursalRoma.agregarIngrediente();
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Preparar pedido");
        System.out.println("--------------------------------------------------------------------------------");


        Empleado Santi = new Empleado("Santi", "mesero", 2500);
        Empleado empleadoSanti = sucursalRoma.agregarEmpleado(Santi);
        empleadoSanti.TomarOrden(Santi);
        System.out.println("--------------------------------------------------------------------------------");


        Empleado Karina = new Empleado("Karina", "cocinero", 3500);
        Empleado empleadoKarina = sucursalRoma.agregarEmpleado(Karina);


        empleadoKarina.Trabajar(Karina);
        System.out.println("--------------------------------------------------------------------------------");
        CafeEspressoItaliano cafeEspressoItaliano = new CafeEspressoItaliano("Cafe a la Roma","taza mediana",8, 15);
        cafeEspressoItaliano.Preparar(cafeEspressoItaliano);
        System.out.println("--------------------------------------------------------------------------------");


        Equipo cafetera = new Equipo("Aeropress", "Activa");
        Equipo Aeropress = sucursalRoma.agregarEquipo(cafetera);
        Aeropress.encenderEquipo();
        System.out.println("--------------------------------------------------------------------------------");
        Aeropress.apagarEquipo();
        System.out.println("--------------------------------------------------------------------------------");

      
        cafeEspressoItaliano.Servir(cafeEspressoItaliano);
        System.out.println("--------------------------------------------------------------------------------");
    }
}

