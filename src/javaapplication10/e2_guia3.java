package javaapplication10;

import java.util.Scanner;


public class e2_guia3 {
/*Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
Nota: investigar la función equals() en Java.
*/
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();
        
        if(frase.equals("eurekin")){
            System.out.println("CORRECTO");
       } else{
            System.out.println("INCORRECTO");
        }
        
    }

}
