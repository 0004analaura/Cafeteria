package gt.edu.miumg.Cafe;

import gt.edu.miumg.Ingredientes.Agua;
import gt.edu.miumg.Ingredientes.Grano;
import gt.edu.miumg.Ingredientes.Azucar;
import gt.edu.miumg.Ingredientes.Leche;

import java.util.Scanner;

public class CafeEspressoItaliano extends Cafe{
    private int intensidad;

    public int getIntensidad() {
        return intensidad;
    }

    public CafeEspressoItaliano(String nombre, String tamano, int intensidad, int precio){
        super(nombre,tamano,precio);
        this.intensidad = intensidad;
    }

    @Override
    public CafeEspressoItaliano Preparar(Object cafeEspressoItaliano) {
        CafeEspressoItaliano cafeEspressoItalianoPedido = (CafeEspressoItaliano)cafeEspressoItaliano;
        String nombreDeLaBebida = cafeEspressoItalianoPedido.getNombre();
        String tamanoDeLaBebida = cafeEspressoItalianoPedido.getTamano();
        int precioDeLaBebida = cafeEspressoItalianoPedido.getPrecio();
        int intensidadDeLaBebida = cafeEspressoItalianoPedido.getIntensidad();
        System.out.println("El cliente pidio un: " + nombreDeLaBebida + " con tamano de " + tamanoDeLaBebida + " e intensidad de " + intensidadDeLaBebida + " con un precio de " + precioDeLaBebida);
        System.out.println("Preparando los ingredientes que iran en el equipo");
        // 1. Agua
        Agua agua = new Agua("Agua Purificada", 16);
        Agua primerIngrediente = cafeEspressoItalianoPedido.setAgua(agua);
        String nombreDelPrimerIngrediente = primerIngrediente.ObtenerNombre();
        double cantidadDelPrimerIngrediente = primerIngrediente.ObtenerCantidad();
        System.out.println("1. " + cantidadDelPrimerIngrediente + " minilitros de " + nombreDelPrimerIngrediente);
        // 2. Grano
        Grano grano = new Grano("Grano de cafe", "entero", 6);
        Grano segundoIngrediente = cafeEspressoItalianoPedido.setGrano(grano);
        String nombreDelSegundoIngrediente = segundoIngrediente.ObtenerNombre();
        double cantidadDelSegundoIngrediente = segundoIngrediente.ObtenerCantidad();
        String tipoDeGrano = segundoIngrediente.setTipo();
        System.out.println("2. " + cantidadDelSegundoIngrediente + " " + nombreDelSegundoIngrediente + " " + tipoDeGrano);
        //3. Azucar
        Azucar azucar = new Azucar("Azucar", 3);
        Azucar tercerIngrediente = cafeEspressoItalianoPedido.setAzucar(azucar);
        String nombreDelTercerIngrediente = tercerIngrediente.ObtenerNombre();
        double cantidadDelTercerIngrediente = tercerIngrediente.ObtenerCantidad();
        System.out.println("3. " + cantidadDelTercerIngrediente + " cucharadas pequenas de: " + nombreDelTercerIngrediente);

        //4. Leche(opcional)
        Scanner decision = new Scanner(System.in);
        System.out.println("Quieres agregar leche en tu cafe? escribe 'si' si la quieres agregar.");
        String opcion = decision.nextLine();
        if (opcion.equalsIgnoreCase("si")){
            Leche leche = new Leche("Leche", "Fresca Pasteurizada", 10);
            Leche cuartoIngrediente = cafeEspressoItalianoPedido.setLeche(leche);
            String nombreDelCuartoIngrediente = cuartoIngrediente.ObtenerNombre();
            String tipoDelCuartoIngrediente = cuartoIngrediente.getTipo();
            double cantidadDelCuartoIngrediente = cuartoIngrediente.ObtenerCantidad();
            System.out.println("4. " + cantidadDelCuartoIngrediente + " minilitros de " + nombreDelCuartoIngrediente + " " + tipoDelCuartoIngrediente);
        } else {
            System.out.println("Entendido, haremos el cafe sin la leche");
        }
        System.out.println("Echando los ingredientes en el equipo....\nIngredientes listos para hacer el pedido!!!");
        return cafeEspressoItalianoPedido;
    }

    @Override
    public CafeEspressoItaliano Servir(Object cafeEspressoItaliano) {
        CafeEspressoItaliano cafeEspressoItalianoPedido = (CafeEspressoItaliano)cafeEspressoItaliano;
        String nombreDelPedido = cafeEspressoItalianoPedido.getNombre();
        System.out.println("El " + nombreDelPedido + " se esta llevando a la mesa del cliente");
        return cafeEspressoItalianoPedido;
    }
}
