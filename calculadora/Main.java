/*
 * xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
 * Main.java
 *
 * Autor:Andres F. Cardenas
 *
 * Clase principal de la calculadora
 *
 * xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
 */

package calculadora;

public class Main {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora(); // se crea una instalacia de calculadora
        calculadora.setTitle("Calculadora"); // sele pone titulo a la ventana        

        calculadora.pack(); // se le da una medida a la ventana tambien se puede usar setSize()
        calculadora.setVisible(true); // le decimos a java que la ventana sea visible
        calculadora.setLocation(300, 200); // se da la localizacion por defecto de la ventana
    }

}
