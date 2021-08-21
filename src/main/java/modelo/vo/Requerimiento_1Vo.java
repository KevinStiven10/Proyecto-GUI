package modelo.vo;

public class Requerimiento_1Vo {
    // Su código
    private String ciudad_recidencia;
    private int avgSalario;

    public Requerimiento_1Vo() {
    }
    public Requerimiento_1Vo(String ciudad_recidencia, int avgSalario) {
        this.ciudad_recidencia = ciudad_recidencia;
        this.avgSalario = avgSalario;
    }
    public String getCiudad_recidencia() {
        return ciudad_recidencia;
    }
    public void setCiudad_recidencia(String ciudad_recidencia) {
        this.ciudad_recidencia = ciudad_recidencia;
    }
    public int getAvgSalario() {
        return avgSalario;
    }
    public void setAvgSalario(int avgSalario) {
        this.avgSalario = avgSalario;
    }
}