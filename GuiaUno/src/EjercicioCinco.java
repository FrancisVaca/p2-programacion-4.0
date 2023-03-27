
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Francisco
 */
public class EjercicioCinco {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int numeroIngresado;
        
        System.out.println("INGRESE UN NUMERO ENTERO : ");
        numeroIngresado = leer.nextInt();
        
        System.out.println(" EL DOBLE DEL NUMERO INGRESADO ES: " +numeroIngresado*2);
        System.out.println(" EL TRIPLE DEL NUMERO INGRESADO ES: " +numeroIngresado*3);
        //esta funcion me permite sacar la raiz cuadrada de un numero al ponerlo dentro de los aprentesis
        System.out.println(" LA RAIZ CUADRADA DEL NUMERO INGRESADO ES: " +Math.sqrt(numeroIngresado));
    }
    
}
