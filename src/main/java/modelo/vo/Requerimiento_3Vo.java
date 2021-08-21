package modelo.vo;

public class Requerimiento_3Vo {
    // Su código
    private int ID_Proyecto;
    private String nombre_Material;
    
    public Requerimiento_3Vo() {
    }
    public Requerimiento_3Vo(int iD_Proyecto, String nombre_Material) {
        ID_Proyecto = iD_Proyecto;
        this.nombre_Material = nombre_Material;
    }
    public int getID_Proyecto() {
        return ID_Proyecto;
    }
    public void setID_Proyecto(int iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }
    public String getNombre_Material() {
        return nombre_Material;
    }
    public void setNombre_Material(String nombre_Material) {
        this.nombre_Material = nombre_Material;
    }
}