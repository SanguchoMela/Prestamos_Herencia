public class PrestamoHipotecario extends Prestamo {
    int plazohipoteca;
    String tipoPropiedad;

    public PrestamoHipotecario(){
        super();
    }

    public PrestamoHipotecario(int fecha_inicio, int fecha_fin, double monto, int tasa_interes, int plazo, String tipoPropiedad) {
        super(fecha_inicio, fecha_fin, monto, tasa_interes);
        this.plazohipoteca = plazo;
        this.tipoPropiedad = tipoPropiedad;
    }

    public int getPlazohipoteca() {
        return plazohipoteca;
    }

    public void setPlazohipoteca(int plazohipoteca) {
        this.plazohipoteca = plazohipoteca;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    @Override
    public String toString() {
        return "Prestamo Hipotecario: \n" +
                "plazohipoteca=" + plazohipoteca +
                ", tipoPropiedad='" + tipoPropiedad + '\'' +
                ", fecha_inicio=" + fecha_inicio +
                ", fecha_fin=" + fecha_fin +
                ", monto=" + monto +
                ", tasa_interes=" + tasa_interes +
                '}';
    }
}



