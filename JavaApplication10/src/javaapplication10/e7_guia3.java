package javaapplication10;

import java.util.Scanner;

/*Realizar un programa que simule el funcionamiento de un dispositivo RS232, 
este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, 
el primer carácter tiene que ser X y el último tiene que ser una O.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas.
Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().*/

public class e7_guia3 {

    public static void main(String[] args) {
       Scanner leer  = new Scanner(System.in);
        System.out.println("BIENVENIDO AL SISTEMA RS232");
        System.out.println("escribir una palabra de 5 caracteres comenzadas en X y terminadas en O ");
        int Palabras_correctas=0;
        int palabras_incorrectas=0;
        
        String cadena = "", fde = "&&&&&";
        
        while(true){
            System.out.println("ingrese la cadena");
            cadena = leer.nextLine();
            /* se va a terminar de correctar cuando se ingresen 5"&")*/
            if (cadena.equals(fde)){
            break;
        }
        if (cadena.length()== 5 && cadena.charAt(0)=='X'&& cadena.charAt(4)=='O') {
        Palabras_correctas++;
        
        }else{
    palabras_incorrectas++;
        
        
    }
}
        System.out.println("La cantidad de palabras correctas ingresadas es = " + Palabras_correctas);
        System.out.println("La cantidad de palabras correctas ingresadas es = " + palabras_incorrectas);
          
}
 }
