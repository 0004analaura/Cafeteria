package gt.edu.miumg.Sucursal;

public class Equipo {
    private String tipo;
    private String estado;

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public void apagarEquipo() {
        String tipoDelEquipo = getTipo();
        System.out.println("APAGANDO " + tipoDelEquipo + ": El pedido esta listo para servir!!");
    }

    public void encenderEquipo() {
        String tipoDeEquipo = getTipo();
        System.out.println("EQUIPO " + tipoDeEquipo +  " ENCENDIDO: Preparando el pedido con los ingredientes ingresados...\n" +
                "Preparacion exitosa!!!");
    }

    public void repararEquipo() {
        System.out.println("El equipo se esta reparando...\nEquipo reparado!!!");
    }

    public String getTipo() {
        return tipo;
    }
}