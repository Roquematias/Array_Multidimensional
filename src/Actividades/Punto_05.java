package Actividades;

import java.util.Scanner;

public class Punto_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[][] golosinas = {
            {"KitKat", "32", "10"},
            {"Chicles", "2", "50"},
            {"Caramelos de Menta", "2", "50"},
            {"Huevo Kinder", "25", "10"},
            {"Chetoos", "30", "10"},
            {"Twix", "26", "10"},
            {"M&M'S", "35", "10"},
            {"Papas Lays", "40", "20"},
            {"Milkybar", "30", "10"},
            {"Alfajor Tofi", "20", "15"},
            {"Lata Coca", "50", "20"},
            {"Chitos", "45", "10"}
        };

        double totalVentas = 0.0; // 
        int opcion;

        do {
            System.out.println("\nMenú de la máquina expendedora:");
            System.out.println("1. Pedir golosina");
            System.out.println("2. Mostrar golosinas");
            System.out.println("3. Rellenar golosinas");
            System.out.println("4. Apagar maquina");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número de golosina (0 a " + (golosinas.length - 1) + "): ");
                    int seleccion = scanner.nextInt();
                    if (seleccion >= 0 && seleccion < golosinas.length) {
                        int cantidadActual = Integer.parseInt(golosinas[seleccion][2]);
                        if (cantidadActual > 0) {
                            double precio = Double.parseDouble(golosinas[seleccion][1]);
                            totalVentas += precio; 
                            cantidadActual--;
                            golosinas[seleccion][2] = String.valueOf(cantidadActual); 
                            System.out.println("Has adquirido: " + golosinas[seleccion][0] + " por $" + precio);
                        } else {
                            System.out.println("Lo siento, " + golosinas[seleccion][0] + " esta agotada. Por favor, elige otra golosina.");
                        }
                    } else {
                        System.out.println("Seleccion no valida.");
                    }
                    break;

                case 2:
                    System.out.println("Golosinas disponibles:");
                    for (int i = 0; i < golosinas.length; i++) {
                        System.out.println(i + ". " + golosinas[i][0] + " - Precio: $" + golosinas[i][1] + " - Cantidad: " + golosinas[i][2]);
                    }
                    break;

                case 3:
                    System.out.print("Ingrese la contraseña para acceder: ");
                    String contrasena = scanner.next();
                    if (contrasena.equals("AdminXYZ")) {
                        System.out.print("Ingrese el número de golosina (0 a " + (golosinas.length - 1) + "): ");
                        int posRellenar = scanner.nextInt();
                        if (posRellenar >= 0 && posRellenar < golosinas.length) {
                            System.out.print("Ingrese la cantidad a recargar: ");
                            int cantidadRecargar = scanner.nextInt();
                            int cantidadActual = Integer.parseInt(golosinas[posRellenar][2]);
                            cantidadActual += cantidadRecargar;
                            golosinas[posRellenar][2] = String.valueOf(cantidadActual);
                            System.out.println("Se ha recargado " + cantidadRecargar + " unidades de " + golosinas[posRellenar][0]);
                        } else {
                            System.out.println("Seleccion no valida.");
                        }
                    } else {
                        System.out.println("Contraseña incorrecta.");
                    }
                    break;

                case 4:
                    // Apagar máquina
                    System.out.println("Apagando la maquina...");
                    System.out.println("Total de ventas durante la ejecucion: $" + totalVentas);
                    break;

                default:
                    System.out.println("Opcion no válida.");
            }

        } while (opcion != 4);

        scanner.close(); 
    }
}
