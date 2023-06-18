public class PrestaAuto {
    private String marca;
    private int plazo;

    public PrestaAuto(){}

    public PrestaAuto(String marca, int plazo) {
        this.marca = marca;
        this.plazo = plazo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public String toString(){
        return "Marca: " + marca + "\nPlazo: " + plazo;
    }
}
