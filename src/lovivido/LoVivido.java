/*
 * Ejercicio de la primera evaluación de refactorización. 
 * 
 */
package lovivido;

import javax.swing.JOptionPane;
/**
 * Consiste en saber cuántos días, meses y horas vivió el usuario.
 * @author tperezrodriguez
 */
public class LoVivido {
/**
 * Esta es la clase principal (main) donde instanciamos tanto los datos del usuario como el cálculo de datos para así poder operar con ellos.
 * @param args son los argumentos del método main
 */
    public static void main(String[] args) {
        
        DatosUsuario usuario1 = new DatosUsuario();
        String edad = usuario1.registrarEdad();
        String nombre = usuario1.registrarNombre();
        
        CalculoDatos calculo1 = new CalculoDatos();
        calculo1.calcularVivido(nombre, edad);

    }

}
