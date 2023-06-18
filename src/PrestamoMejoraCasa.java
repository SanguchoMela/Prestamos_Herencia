public class PrestamoMejoraCasa extends Prestamo{
    private String tipo_mejora;

    public PrestamoMejoraCasa(){
        super();
    }
    public PrestamoMejoraCasa(int fecha_inicio, int fecha_fin, double monto, int tasa_interes, String tipo_mejora) {
        super(fecha_inicio, fecha_fin, monto, tasa_interes);
        this.tipo_mejora = tipo_mejora;
    }

    public String getTipo_mejora() {
        return tipo_mejora;
    }

    public void setTipo_mejora(String tipo_mejora) {
        this.tipo_mejora = tipo_mejora;
    }

    public void imprimir_tipo_mejora(){
        System.out.println(getTipo_mejora());
    }

}
