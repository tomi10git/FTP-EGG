package javaapplication10;

import java.util.Scanner;


public class e3_guia3 {
/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”
, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase de no mas de 8 caracteres");
          String frase = leer.nextLine();
       if (frase.length() == 8 ) {
           System.out.println("CORRECTO ");
       }else{
           System.out.println("INCORRECTO");
       }
 
        }
    }


