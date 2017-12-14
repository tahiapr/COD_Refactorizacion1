/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lovivido;

import javax.swing.JOptionPane;

/**
 * Esta clase es para registrar los datos del usuario que va a hayar su tiempo vivido
 * @author tperezrodriguez
 */
public class DatosUsuario {

    /**
     * DATOS DEL USUARIO Instanciamos las variables de nombre y edad para luego
     * guardar en ellas la entrada de datos del usuario
     */
    private String nombre, edad;

    /**
     * ENTRADA DE DATOS DEL USUARIO A través de un método pedimos el nombre del
     * usuario Esto lo hacemos a través de un cuadro de diálogo JOption
     *
     * @return devuelve el nombre
     */
    public String registrarNombre() {
        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        return nombre;
    }

    /**
     * ENTRADA DE DATOS DEL USUARIO A través de un método pedimos la edad del
     * usuario Esto lo hacemos a través de un cuadro de diálogo JOption
     *
     * @return devuelve la edad
     */
    public String registrarEdad() {
        edad = JOptionPane.showInputDialog("Escriba su edad: ");
        return edad;
    }

}
