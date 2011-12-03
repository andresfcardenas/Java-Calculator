/*
 * xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
 * VentanasEmergentes.java
 *
 * Autor:Andres F. Cardenas
 *
 * Clase que hace posible mostrar las ventanas emergentes
 *
 * xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
 */

package calculadora;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VentanasEmergentes extends JFrame{

    public VentanasEmergentes(){
        String cadena = "Asegurate de que la caja de texto tiene caracteres numericos validos y que no este vacia ";
        JLabel mensaje = new JLabel(cadena, JLabel.CENTER);

        getContentPane().add(mensaje, "Center");
        setTitle("Introduce caracteres validos"); // le damos titulo a la ventana        

        setSize(700, 100);
        setVisible(true);
        setLocation(200, 250);
    }

    public VentanasEmergentes(String nombreVentana){
        String cadena = "Creado por Andres F. Cardenas";
        JLabel mensaje = new JLabel(cadena, JLabel.CENTER);

        getContentPane().add(mensaje, "Center");
        setTitle(nombreVentana);

        setSize(400, 100);
        setVisible(true);
        setLocation(300, 250);
    }
}
