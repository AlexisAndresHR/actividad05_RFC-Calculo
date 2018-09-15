
package main;

import models.ModelRFC;
import views.ViewRFC;
import controllers.ControllerRFC;

/**
 *
 * @author Hernández Ramírez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // .
        ModelRFC modelrfc = new ModelRFC();
        ViewRFC viewrfc = new ViewRFC();
        ControllerRFC controllerrfc = new ControllerRFC(modelrfc, viewrfc);
    }
    
}
