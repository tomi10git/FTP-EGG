package javaapplication10;

import java.util.Scanner;

/*Escriba un programa en el cual se ingrese un valor limite positivo, 
y a continuacion solicite numeros al usuario hasta que la suma de los numeros 
introducidos supere el límite inicial.*/

public class e5_guia3 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero Maximo");
       int numMax = input.nextInt();
        int cont = 0;
        int suma = 0; 
       
        while (suma < numMax ) {
            System.out.println("ingrese un numero");
             int num = input.nextInt();
             suma+= num; 
             cont++;
            
        }
        System.out.println("la cantidad de numeros ingresados son " + cont + " y la suma es = " + suma+ " y superan el limite maximo positivo");
        }
        
    }