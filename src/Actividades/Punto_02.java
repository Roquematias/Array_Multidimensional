package Actividades;

import java.util.Scanner;

public class Punto_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de X (filas del primer array): ");
        int X = scanner.nextInt();
        System.out.print("Ingrese el valor de Y (columnas del primer array): ");
        int Y = scanner.nextInt();
        
        int[][] array1 = new int[X][Y];
        System.out.println("Ingrese los valores para el primer array:");
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                System.out.print("Valor en [" + i + "][" + j + "]: ");
                array1[i][j] = scanner.nextInt();
            }
        }

        int[][] array2 = new int[Y][X];
        System.out.println("Ingrese los valores para el segundo array:");
        for (int i = 0; i < Y; i++) {
            for (int j = 0; j < X; j++) {
                System.out.print("Valor en [" + i + "][" + j + "]: ");
                array2[i][j] = scanner.nextInt();
            }
        }

        int[][] resultado = new int[X][Y];
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < Y; j++) {
                resultado[i][j] = 0; 
                for (int k = 0; k < Y; k++) {
                    resultado[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        System.out.println("Primer array (X, Y):");
        imprimirArray(array1);

        System.out.println("Segundo array (Y, X):");
        imprimirArray(array2);

        System.out.println("Array resultante (X, Y):");
        imprimirArray(resultado);

        scanner.close(); // 
    }

    private static void imprimirArray(int[][] array) {
        for (int[] fila : array) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
