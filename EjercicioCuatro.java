
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
public class EjercicioCuatro {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
      float centigrados;
      float fahren;
      
      System.out.println("INGRESE LA CANTIDAD DE GRADOS CENTIGRADOS A CONVERTIR: ");
      centigrados = leer.nextByte();
      
      fahren= 32+(9*centigrados/5);
      
      System.out.println("La conversion de " +centigrados+ " grados centigrados a fahrenheit es : " +fahren);
       
    }
    
}
