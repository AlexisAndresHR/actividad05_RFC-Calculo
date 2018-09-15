
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import models.ModelRFC;
import views.ViewRFC;


public class ControllerRFC {
    
    ModelRFC modelrfc; // Objetos para acceder a las clases e interfaces.
    ViewRFC viewrfc;
    
    
    ActionListener actionlistener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewrfc.jb_obtener) {
                jb_obtener_action_performed();
            }
            else if (e.getSource() == viewrfc.jb_limpiar) {
                jb_limpiar_action_performed();
            }
        }
    };
    
    
    public ControllerRFC(ModelRFC modelrfc, ViewRFC viewrfc) {
        this.modelrfc = modelrfc;
        this.viewrfc = viewrfc;
        
        this.viewrfc.jb_obtener.addActionListener(actionlistener);
        this.viewrfc.jb_limpiar.addActionListener(actionlistener);
        initComponents();
    }
    
    
// Acciones de botones de la interfaz para obtener RFC
    public void jb_obtener_action_performed() {
        modelrfc.setApellido_pat(String.valueOf(viewrfc.jtf_apellido_pat.getText()));
        modelrfc.setApellido_mat(String.valueOf(viewrfc.jtf_apellido_mat.getText()));
        modelrfc.setNombre(String.valueOf(viewrfc.jtf_nombres.getText()));
        
        modelrfc.setAnio(String.valueOf(viewrfc.jcb_anio_nac.getSelectedItem())); // Obtiene el quinto y sexto caracteres del RFC.

        String caracter_7_8 = (String) viewrfc.jcb_mes_nac.getSelectedItem(); // Obtiene el séptimo y octavo caracteres del RFC.
        String caracter_9_10 = (String) viewrfc.jcb_dia_nac.getSelectedItem(); // Obtiene el noveno y décimo caracteres del RFC.
        
        viewrfc.jl_rfc.setText("Su RFC es: " + modelrfc.obtener_apellido_pat() + modelrfc.obtener_apellido_mat() + modelrfc.obtener_nombre() + modelrfc.obtener_anio() + caracter_7_8 + caracter_9_10 + "XXX"); //prueba...
    }
    
    public void jb_limpiar_action_performed() {
        viewrfc.jtf_nombres.setText("");
        viewrfc.jtf_apellido_pat.setText("");
        viewrfc.jtf_apellido_mat.setText("");
        viewrfc.jcb_anio_nac.setSelectedIndex(0);
        viewrfc.jcb_mes_nac.setSelectedIndex(0);
        viewrfc.jcb_dia_nac.setSelectedIndex(0);
        viewrfc.jl_rfc.setText("Su RFC es: ");
    }
    
// Método para acceder a los componentes de ViewRFC.
    public void initComponents() {
        viewrfc.setVisible(true);
    }
    
}
