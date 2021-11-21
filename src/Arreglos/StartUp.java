package Arreglos;

import java.util.Scanner;

public class StartUp {
    public static void main(String[] args) {
        int numero = 7;
        Scanner scanner = new Scanner(System.in);
        int[] arreglo1 = new int[numero];
        int[] arreglo2 = new int[numero];
        int[] arreglo3 = new int[numero];

        for (int i = 0; i < numero; i++) {
            System.out.print("Número " + (i + 1) + " del arreglo 1: ");
            arreglo1[i] = scanner.nextInt();
            System.out.print("Número " + (i + 1) + " del arreglo 2: ");
            arreglo2[i] = scanner.nextInt();
        }

        for (int i = 0; i < numero; i++) {
            arreglo3[i] = arreglo1[i] - arreglo2[i];
        }

        System.out.println("Promedio del arreglo 1: " + Promedio(arreglo1));
        System.out.println("Promedio del arreglo 2: " + Promedio(arreglo2));
        System.out.println("Promedio del arreglo 3: " + Promedio(arreglo3));

        Mostrar(arreglo3);
    }

    public static double Promedio(int[] arreglo) {
        double suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        return suma / arreglo.length;
    }

    public static void Mostrar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("[" + i + "] = " + arreglo[i]);
        }
    }

}
