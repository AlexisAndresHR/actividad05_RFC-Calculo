
package models;


public class ModelRFC {
    
    private String apellido_pat = ""; // Apellido paterno...

    public String getApellido_pat() {
        return apellido_pat;
    }
    public void setApellido_pat(String apellido_pat) {
        this.apellido_pat = apellido_pat;
    }
    
    public String obtener_apellido_pat() { // Método para obtener los primeros dos caracteres del RFC.
        
        String cant_apellido_pat[] = apellido_pat.split(" "); // Divide por palabras el 'apellido paterno' introducido.
        String caracter_1_2;
        
        if ("Ñ".equals(cant_apellido_pat[0].substring(0, 1)) ) { // Comprueba si la primera letra del apellido es Ñ.
            caracter_1_2 = "XX";
        }
        else {
            
            if ("DE".equals(cant_apellido_pat[0]) || "DEL".equals(cant_apellido_pat[0]) ) { // Comprueba si la primera palabra del apellido paterno es "inválida" para el RFC.
                if ("LOS".equals(cant_apellido_pat[1]) || "LAS".equals(cant_apellido_pat[1]) || "LA".equals(cant_apellido_pat[1]) ) { // Comprueba si la segunda palabra del apellido paterno es "inválida" para el RFC.
                    caracter_1_2 = cant_apellido_pat[2].substring(0, 2);
                }
                else
                    caracter_1_2 = cant_apellido_pat[1].substring(0, 2);
            }
            else
                caracter_1_2 = cant_apellido_pat[0].substring(0, 2);
        }
        
        return caracter_1_2;
    }
    
    
    private String apellido_mat = ""; // Apellido materno...

    public String getApellido_mat() {
        return apellido_mat;
    }
    public void setApellido_mat(String apellido_mat) {
        this.apellido_mat = apellido_mat;
    }
    
    public String obtener_apellido_mat() { // Método para obtener el tercer caracter del RFC.
        
        String cant_apellido_mat[] = apellido_mat.split(" "); // Divide por palabras el 'apellido materno' introducido.
        String caracter_3;
        
        if ("".equals(apellido_mat)) { // Comprueba si existe o no un segundo apellido.
            caracter_3 = "X";
        }
        else {
            if ("Ñ".equals(cant_apellido_mat[0].substring(0, 1)) ) { // Comprueba si la primera letra del apellido es Ñ.
                caracter_3 = "X";
            }
            else {
                if ("DE".equals(cant_apellido_mat[0]) || "DEL".equals(cant_apellido_mat[0]) || "Y".equals(cant_apellido_mat[0]) ) { // Comprueba si la primera palabra del apellido materno es "inválida" para el RFC.
                    if ("LOS".equals(cant_apellido_mat[1]) || "LAS".equals(cant_apellido_mat[1]) || "LA".equals(cant_apellido_mat[1]) ) { // Comprueba si la segunda palabra del apellido materno es "inválida" para el RFC.
                        caracter_3 = cant_apellido_mat[2].substring(0, 1);
                    }
                    else
                        caracter_3 = cant_apellido_mat[1].substring(0, 1);
                }
                else
                    caracter_3 = apellido_mat.substring(0, 1);
            }
        }
        
        return caracter_3;
    }
    
    
    private String nombre = ""; // Nombres...

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String obtener_nombre() { // Método para obtener el cuarto caracter del RFC.
        
        String num_nombres[] = nombre.split(" "); // Divide por palabras el 'nombre' introducido.
        String caracter_4;
        
        
        if ("MARIA".equals(num_nombres[0]) ||  "MA".equals(num_nombres[0]) || "MA.".equals(num_nombres[0]) ) { // Comprueba si el primer nombre es "inválido" según las excepciones del RFC.
            if ("DE".equals(num_nombres[1]) || "DEL".equals(num_nombres[1])) { // Comprueba si la segunda palabra del nombre es "inválida" para el RFC.
                if ("LOS".equals(num_nombres[2]) || "LAS".equals(num_nombres[2]) ) { // Comprueba si la tercera palabra del nombre es "inválida" para el RFC.
                    caracter_4 = num_nombres[3].substring(0, 1);
                }
                else
                    caracter_4 = num_nombres[2].substring(0, 1);
            }
            else
                caracter_4 = num_nombres[1].substring(0, 1);
        }
        
        else if ("JOSE".equals(num_nombres[0]) || "J".equals(num_nombres[0]) || "J.".equals(num_nombres[0]) ) { // Comprueba si el primer nombre es "inválido" según las excepciones del RFC.
            if ("DE".equals(num_nombres[1]) || "DEL".equals(num_nombres[1])) { // Comprueba si la segunda palabra del nombre es "inválida" para el RFC.
                caracter_4 = num_nombres[2].substring(0, 1);
            }
            else
                caracter_4 = num_nombres[1].substring(0, 1);
        }
        
        else {
            caracter_4 = nombre.substring(0, 1);
        }
        
        return caracter_4;
    }
    
    
    private String anio = ""; // Año...

    public String getAnio() {
        return anio;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }
    
    public String obtener_anio() { // Método para obtener el quinto y sexto caracteres del RFC.
        String caracter_5_6 = anio.substring(2);
        return caracter_5_6;
    }
    
}
