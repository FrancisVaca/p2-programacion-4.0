
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
public class EjercicioUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
    
        Scanner leer = new Scanner(System.in);
        int numeroUno;
        int numeroDos;
        int resultado;
        System.out.println("Ingrese primer numero entero: ");
        numeroUno = leer.nextInt();
        System.out.println("Ingrese segundo numero entero: ");
        numeroDos = leer.nextInt();
        
        resultado = numeroUno + numeroDos;
        
        System.out.println("La suma de los numeros ingresados es " +resultado);
    }
    
}
