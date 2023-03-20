package javaapplication10;

import java.util.Scanner;


public class e8_guia3 {
/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
 Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del cuadrado: ");
        int n = scanner.nextInt();
        
        // Dibuja la primera fila del cuadrado
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();
        
        // Dibuja las filas intermedias del cuadrado
        for (int i = 2; i < n; i++) {
            System.out.print("* ");
            for (int j = 2; j < n; j++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }
        
        // Dibuja la última fila del cuadrado
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
    }
}
