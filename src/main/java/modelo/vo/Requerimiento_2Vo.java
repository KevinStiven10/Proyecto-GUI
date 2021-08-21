package modelo.vo;

public class Requerimiento_2Vo {
    // Su código
    private int ID_Proyecto;
    private String proveedor;

    public Requerimiento_2Vo() {
    }
    public Requerimiento_2Vo(int iD_Proyecto, String proveedor) {
        ID_Proyecto = iD_Proyecto;
        this.proveedor = proveedor;
    }
    public int getID_Proyecto() {
        return ID_Proyecto;
    }
    public void setID_Proyecto(int iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }
    public String getProveedor() {
        return proveedor;
    }
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    } 
}