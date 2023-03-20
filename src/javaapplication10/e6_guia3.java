package javaapplication10;

import java.util.Scanner;

/*Realizar un programa que pida dos números enteros positivos por teclado
y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción
y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.*/


public class e6_guia3 {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        System.out.println("ingrese dos numeros enteros positivos");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        String Opcion;
        System.out.println("**el usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú.**");
        do {
            System.out.println("Seleccione una opción"
                    + "\n1. Sumar"
                    + "\n2. Restar"
                    + "\n3. Multiplicar"
                    + "\n4. Dividir"
                    + "\n5. Salir"
                    + "\nElija opción");
            Opcion = input.next();
        switch(Opcion){
           
            case "1": 
                System.out.println("la suma del num1 + num2 = " + (num1+num2));
     
                break;
            case "2":
               System.out.println("la resta del num1  - num2 = " + (num1 - num2));
                 break;
            case "3":
             System.out.println("la multiplicacion del num1  / num2 = " + (num1*num2));
                 break;
            case "4": 
               System.out.println("la division del num1  / num2 = " + (num1 / num2));
                 break;
            case "5":
                System.out.println("seguro deseas salir? S/N");
               Opcion = input.next();
            }
        } while (!"S".equalsIgnoreCase(Opcion));
    }
}
               