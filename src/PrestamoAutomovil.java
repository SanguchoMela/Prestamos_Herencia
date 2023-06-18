
public class PrestamoAutomovil extends Prestamo {

    private String marca;
    private String modelo;

    private int plazo;

    public PrestamoAutomovil(){
        super();
    }


    public PrestamoAutomovil(int fecha_inicio, int fecha_fin, double monto, int tasa_interes, int plazo, String marca, String modelo) {
        super(fecha_inicio, fecha_fin, monto, tasa_interes);
        this.plazo = plazo;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    //Metodos
    public double calcular_cuota_pago(){
        return (monto * tasa_interes)/(1-(1+Math.pow(tasa_interes,plazo)));
    }
    public double calcular_interes_acumulado(){
        return (monto * tasa_interes * plazo);
    }

    //Metodo para mostrar datos
    public void mostraInfo(){
        System.out.print("Anio inicial: "+getFecha_inicio());
        System.out.print("\nAnio final: "+getFecha_fin());
        System.out.print("\nMonto: "+getMonto());
        System.out.print("\nTasa de interes: "+getTasa_interes()+"%");
        System.out.print("\nPlazo: "+getPlazo());
        System.out.print("\nMarca: "+getMarca());
        System.out.print("\nModelo: "+getModelo());
        System.out.print("\n- Cuota de pago: "+String.format("%.2f",calcular_cuota_pago()));
        System.out.print("\n- Interes acumulado: "+String.format("%.2f",calcular_interes_acumulado()));
    }

}
