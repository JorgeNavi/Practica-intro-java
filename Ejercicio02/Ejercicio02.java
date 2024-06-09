package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
 
    
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número total de productos: ");
        int tamaño = scanner.nextInt();
        scanner.nextLine();

        CuentaSupermercado cuenta = new CuentaSupermercado(tamaño);

        for (int i = 0; i < tamaño; i++) {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el precio unitario del producto: ");
            double precioUnitario = scanner.nextDouble();

            System.out.print("Ingrese la cantidad del producto: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine();

            Producto producto = new Producto(nombre, precioUnitario, cantidad);
            cuenta.añadirProducto(producto);

            System.out.print("¿Hay otro producto? (s/n): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                break;
            }
        }

        cuenta.mostrarCuenta();
        scanner.close();
    }
}

