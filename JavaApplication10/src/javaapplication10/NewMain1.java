package javaapplication10;

import java.util.Scanner;

/*Realizar un programa que pida dos números enteros positivos por teclado
y muestre por pantalla el siguiente menú:El usuario deberá elegir una opción
y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.*/
public class NewMain1 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("cargue dos numeros al sistema para realizar las siguientes operaciones matematicas");
        System.out.println("SUMA/RESTA/MULTIPLICACION/DIVISION");
        String opcion;
    
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        System.out.println("SELECCIONE UNA OPCION"
                + "\n OPCION1:"
                + "\n SUMA"
                + "\n OPCION2:"
                + "\n RESTA"
                + "\n OPCION3:"
                + "\n MULTIPLICACION"
                + "\n OPCION4:"
                + "\n DIVISION"
                + "\n OPCION5:"
                + "\n SALIR");
        System.out.println("elija una opcion");
        opcion = leer.next();
        switch(opcion){
            case "1":
              System.out.println("la suma de los numeros = "+(num1+num2));
              break;
            case "2":
                System.out.println("la resta de los numeros = "+(num1-num2));
                 break;
            case "3":
                System.out.println("la multiplicacion de los numeros = " + (num1*num2) );
                 break;
            case "4":
                System.out.println("la division de los numeros seleccionados = " + (num1/num2));
                 break;
            case "5": 
                System.out.println("seguro que quiere salir? presione Si o no");
                opcion = leer.next();
                 break;
                
        }
        while (!"S".equalsIgnoreCase(opcion));
    }

}
