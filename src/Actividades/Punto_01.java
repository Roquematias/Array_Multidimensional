package Actividades;

import java.util.Scanner;

public class Punto_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] paisesCiudades = new String[4][3];

        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese el nombre del país #" + (i + 1) + ": ");
            String pais = scanner.nextLine();

            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el nombre de la ciudad #" + (j + 1) + " en " + pais + ": ");
                paisesCiudades[i][j] = scanner.nextLine();
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print("Pais: " + paisesCiudades[i][0] + " Ciudades: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(paisesCiudades[i][j]);
                if (j < 2) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
