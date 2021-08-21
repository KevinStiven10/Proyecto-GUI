package vista;

import java.util.ArrayList;

import controlador.ControladorRequerimientos;
import modelo.vo.Requerimiento_1Vo;
import modelo.vo.Requerimiento_2Vo;
import modelo.vo.Requerimiento_3Vo;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {

        try {
            // Su código
            ArrayList<Requerimiento_1Vo> requerimiento1 = controlador.consultarRequerimiento1();

            // Cada VO cargado, mostrarlo en la vista
            for (Requerimiento_1Vo proyecto : requerimiento1) {
                System.out.printf("%s %d %n",

                    proyecto.getCiudad_recidencia(), proyecto.getAvgSalario());
            }
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void requerimiento2() {

        try {
            // Su código
            ArrayList<Requerimiento_2Vo> requerimiento2 = controlador.consultarRequerimiento2();

            // Cada VO cargado, mostrarlo en la vista
            for (Requerimiento_2Vo proyecto : requerimiento2) {
                System.out.printf("%d %s %n",

                    proyecto.getID_Proyecto(), proyecto.getProveedor());
            }
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void requerimiento3() {

        try {
            // Su código
            ArrayList<Requerimiento_3Vo> requerimiento3 = controlador.consultarRequerimiento3();

            // Cada VO cargado, mostrarlo en la vista
            for (Requerimiento_3Vo proyecto : requerimiento3) {
                System.out.printf("%d %s %n",

                    proyecto.getID_Proyecto(), proyecto.getNombre_Material());
            }
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }
}