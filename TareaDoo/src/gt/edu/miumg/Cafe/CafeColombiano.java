package gt.edu.miumg.Cafe;
import gt.edu.miumg.Ingredientes.Agua;
import gt.edu.miumg.Ingredientes.Azucar;
import gt.edu.miumg.Ingredientes.Grano;


public class CafeColombiano extends Cafe{
    private String tipoDeGrano;

    public String getTipoDeGrano() {
        return tipoDeGrano;
    }

    public CafeColombiano(String nombre, String tamano, String tipoDeGrano, int precio){
        super(nombre,tamano,precio);
        this.tipoDeGrano = tipoDeGrano;
    }

    @Override
    public CafeColombiano Preparar(Object cafeColombiano) {
        CafeColombiano cafeColombianoPedido = (CafeColombiano)cafeColombiano;
        String nombreDeLaBebida = cafeColombianoPedido.getNombre();
        String tamanoDeLaBebida = cafeColombianoPedido.getTamano();
        int precioDeLaBebida = cafeColombianoPedido.getPrecio();
        String tipoDeGranoParaLaBebida = cafeColombianoPedido.getTipoDeGrano();
        //int intensidadDeLaBebida = cafeColombianoPedido.getIntensidad();
        System.out.println("El cliente pidio un: " + nombreDeLaBebida + " con tamano de " + tamanoDeLaBebida + " con tipo de grano " + tipoDeGranoParaLaBebida + " a un precio de " + precioDeLaBebida);
        System.out.println("Preparando los ingredientes que iran en el equipo");
        // 1. Agua
        Agua agua = new Agua("Agua Purificada", 12.5);
        Agua primerIngrediente = cafeColombianoPedido.setAgua(agua);
        String nombreDelPrimerIngrediente = primerIngrediente.ObtenerNombre();
        double cantidadDelPrimerIngrediente = primerIngrediente.ObtenerCantidad();
        System.out.println("1. " + cantidadDelPrimerIngrediente + " minilitros de " + nombreDelPrimerIngrediente);
        // 2. Grano
        Grano grano = new Grano("Grano de cafe", "molido", 5.5);
        Grano segundoIngrediente = cafeColombianoPedido.setGrano(grano);
        String nombreDelSegundoIngrediente = segundoIngrediente.ObtenerNombre();
        double cantidadDelSegundoIngrediente = segundoIngrediente.ObtenerCantidad();
        String tipoDeGrano = segundoIngrediente.setTipo();
        System.out.println("2. " + cantidadDelSegundoIngrediente + " " + nombreDelSegundoIngrediente + " " + tipoDeGrano);
        //3. Azucar
        Azucar azucar = new Azucar("Azucar", 2);
        Azucar tercerIngrediente = cafeColombianoPedido.setAzucar(azucar);
        String nombreDelTercerIngrediente = tercerIngrediente.ObtenerNombre();
        double cantidadDelTercerIngrediente = tercerIngrediente.ObtenerCantidad();
        System.out.println("3. " + cantidadDelTercerIngrediente + " cucharadas pequenas de: " + nombreDelTercerIngrediente);
        System.out.println("Echando los ingredientes en el equipo....\nIngredientes listos para hacer el pedido!!!");
        return cafeColombianoPedido;
    }

    @Override
    public CafeColombiano Servir(Object cafeColombiano) {
        CafeColombiano cafeColombianoPedido = (CafeColombiano)cafeColombiano;
        String nombreDelPedido = cafeColombianoPedido.getNombre();
        System.out.println("El " + nombreDelPedido + " se esta llevando a la mesa del cliente");
        return cafeColombianoPedido;
    }
}