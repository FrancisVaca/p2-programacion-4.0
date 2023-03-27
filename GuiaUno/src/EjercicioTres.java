
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
public class EjercicioTres {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String frase;
        
        System.out.println("Ingrese una frase gordo: ");
        frase = leer.next();
        
        //paso lo ingresado a mayusculas   
        System.out.println("Su frase en mayusculas es: " +frase.toUpperCase());
        //ahora a minusculas
        System.out.println("Su frase en minusculas es: " +frase.toLowerCase());
    }
    
}
