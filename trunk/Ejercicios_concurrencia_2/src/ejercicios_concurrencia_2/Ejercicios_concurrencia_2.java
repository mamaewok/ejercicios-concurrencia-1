package ejercicios_concurrencia_2;

import hilos.HiloContadorDivisores;
import hilos.HiloEsPrimo;

import java.util.Scanner;

/**
 *
 * @author Mañana
 */
public class Ejercicios_concurrencia_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Introduzca el Numero.");
        Scanner teclado = new Scanner(System.in);
        int i=0;
        while ((i=teclado.nextInt()) > 0) {
            Thread t1 = new HiloEsPrimo(i);
            Thread t2 = new HiloContadorDivisores(i);
            t1.start();
            t2.start();
          
        }






    }
}

