package Actividades;

import java.util.Scanner;

public class Punto_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int X;
        do {
            System.out.print("Ingrese un valor entero X (3 <= X <= 10): ");
            X = scanner.nextInt();
        } while (X < 3 || X > 10);
        
        int[][] matriz = new int[X][X];
        
        System.out.println("Ingrese los valores para la matriz:");
        for (int i = 0; i < X; i++) {
            for (int j = 0; j < X; j++) {
                System.out.print("Valor en [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz resultante:");
        imprimirMatriz(matriz);

        int[] sumaColumnas = new int[X];
        
        for (int j = 0; j < X; j++) {
            for (int i = 0; i < X; i++) {
                sumaColumnas[j] += matriz[i][j];
            }
        }

        System.out.println("Suma de las columnas:");
        for (int suma : sumaColumnas) {
            System.out.print(suma + " ");
        }
        System.out.println();

        int sumaTotal = 0;
        for (int suma : sumaColumnas) {
            sumaTotal += suma;
        }

        System.out.println("Suma total de las columnas: " + sumaTotal);
        
        scanner.close(); 
    }

    private static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
