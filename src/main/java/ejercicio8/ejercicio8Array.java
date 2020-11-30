/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Hind
 */
public class ejercicio8Array {
    public static void main(String[] args) {
          //introduce el tamaño de tabla
        System.out.println("Introduce el tamaño de tabla (n)");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//numero de tamaño del array

        //crear array de n tamaño 
        int[] list = new int[n];

        //inicializa el array con los valores que el usuario introduzca por teclado
        for (int i = 0; i < list.length; i++) {
            System.out.println("Introduce el valores que quieres: ");
            list[i] = scan.nextInt();
        }

        MostrarArray(list);

    }

    public static void MostrarArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int estrella = list[i];

            for (int j = 0; j < estrella; j++) {
                int[] listEt = new int[estrella];
                System.out.print("*");
               

            }
        }

    }
}
