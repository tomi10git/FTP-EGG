package javaapplication10;

import java.util.Scanner;

/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”,
en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la funcion Substring y equals() de Java.
 */
public class e4_guia3 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE UNA FRASE QUE COMIENCE CON LA PRIMERA LETRA DEL ALFABETO NDEAHHH ");
         String frase = leer.nextLine();
         
       if (frase.startsWith("a") || frase.startsWith("A")){
           System.out.println("CORRECTO");
        }else{
           System.out.println("INCORRECTO");
           
       }
       
       
       
    }

}
