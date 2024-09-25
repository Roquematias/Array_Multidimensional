package Actividades;

import java.util.Scanner;

import java.util.Scanner;

public class Punto_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int X;
        do {
            System.out.print("Ingresa un valor entero X (4 <= X <= 10): ");
            X = scanner.nextInt();
        } while (X < 4 || X > 10);
        
        int[][] matriz = new int[X][X];
        boolean matrizRellena = false;

        int opcion;
        do {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Rellenar la matriz");
            System.out.println("2. Sumar una fila");
            System.out.println("3. Sumar una columna");
            System.out.println("4. Sumar la diagonal principal");
            System.out.println("5. Sumar la diagonal inversa");
            System.out.println("6. Media de todos los valores de la matriz");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingresa los valores para la matriz:");
                    for (int i = 0; i < X; i++) {
                        for (int j = 0; j < X; j++) {
                            System.out.print("Valor en [" + i + "][" + j + "]: ");
                            matriz[i][j] = scanner.nextInt();
                        }
                    }
                    matrizRellena = true; 
                    break;

                case 2:
                    if (!matrizRellena) {
                        System.out.println("Deba rellenar la matriz primero.");
                    } else {
                        int fila;
                        do {
                            System.out.print("Ingresa el numero de fila (0 a " + (X - 1) + "): ");
                            fila = scanner.nextInt();
                        } while (fila < 0 || fila >= X);
                        System.out.println("Suma de la fila " + fila + ": " + sumaFila(matriz, fila));
                    }
                    break;

                case 3:
                    if (!matrizRellena) {
                        System.out.println("Debe rellenar la matriz primero.");
                    } else {
                        int col;
                        do {
                            System.out.print("Ingresa el numero de columna (0 a " + (X - 1) + "): ");
                            col = scanner.nextInt();
                        } while (col < 0 || col >= X);
                        System.out.println("Suma de la columna " + col + ": " + sumaColumna(matriz, col));
                    }
                    break;

                case 4:
                    if (!matrizRellena) {
                        System.out.println("Debe rellenar la matriz primero.");
                    } else {
                        System.out.println("Suma de la diagonal principal: " + sumaDiagonalPrincipal(matriz));
                    }
                    break;

                case 5:
                    if (!matrizRellena) {
                        System.out.println("Debe rellenar la matriz primero.");
                    } else {
                        System.out.println("Suma de la diagonal inversa: " + sumaDiagonalInversa(matriz));
                    }
                    break;

                case 6:
                    if (!matrizRellena) {
                        System.out.println("Debe rellenar la matriz primero.");
                    } else {
                        System.out.println("Media de todos los valores de la matriz: " + mediaMatriz(matriz));
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 0);
        
        scanner.close();
    }

    private static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int valor : matriz[fila]) {
            suma += valor;
        }
        return suma;
    }

    private static int sumaColumna(int[][] matriz, int col) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][col];
        }
        return suma;
    }

    private static int sumaDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    private static int sumaDiagonalInversa(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][matriz.length - 1 - i];
        }
        return suma;
    }

    private static double mediaMatriz(int[][] matriz) {
        int suma = 0;
        int totalElementos = 0;

        for (int[] fila : matriz) {
            for (int valor : fila) {
                suma += valor;
                totalElementos++;
            }
        }
        return (double) suma / totalElementos;
    }
}
