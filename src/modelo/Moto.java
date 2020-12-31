package modelo;

public class Moto extends Vehiculo {

    private String cilindradas;

    public Moto() {
        super();
    }

    public Moto(String marca, String modelo, double precio, String cilindradas) {

        super(marca, modelo, precio);
        this.cilindradas = cilindradas;

    }

    public String getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }

}
