

import vista.VistaRequerimientos;
import vista.MenuCombo;
/**
 * Esta clase solo se debe usar para hacer pruebas locales, no se debe subir en
 * iMaster
 */
public class App {
    public static void main(String[] args) 
    {  
        /*
        System.out.println("Requerimiento 1");
        VistaRequerimientos.requerimiento1();
        System.out.println();

        System.out.println("Requerimiento 2");
        VistaRequerimientos.requerimiento2();
        System.out.println();

        System.out.println("Requerimiento 3");
        VistaRequerimientos.requerimiento3();
*/
        MenuCombo vm = new MenuCombo();
        vm.setVisible(true);
    }
}
