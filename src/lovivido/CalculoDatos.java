/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lovivido;

import javax.swing.JOptionPane;

/**
 * Esta clase calcula los datos del usuario que insertó sus datos
 *
 * @author tperezrodriguez
 */
public class CalculoDatos {

    /**
     * DATOS VIVIDOS DEL USUARIO Instanciamos los meses, los días, las horas y
     * la edad con la que vamos a operar para luego poder utilizarlo y hayar el
     * número de datos vividor por el usuario
     */
    int mesesVividos, diasVividos, horasVividas, laEdad;

    /**
     * Este método calcula tanto los meses, como los días, como las horas
     * vividas del usuario
     *
     * @param nombre es el nombre que registró el usuario a través del JOption
     * @param edad es la edad que registró el usuario a través del JOption
     */
    public void calcularVivido(String nombre, String edad) {

        laEdad = Integer.parseInt(edad);

        mesesVividos = (laEdad * 12);
        diasVividos = (laEdad * 365);
        horasVividas = (diasVividos * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + mesesVividos, "Numero de meses vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + diasVividos, "Numero de días vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + horasVividas, "Numero de horas vividos de " + nombre, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
