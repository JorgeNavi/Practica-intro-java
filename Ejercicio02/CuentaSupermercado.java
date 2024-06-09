package Ejercicio02;

public class CuentaSupermercado {
    
    private Producto[] productos;
    private int numProductos;


    //constructor
    public CuentaSupermercado(int tamaño) {
        this.productos = new Producto[tamaño];
        this.numProductos = 0;
    }

    //añadir productos
    public void añadirProducto(Producto nuevoProducto) {
        for (int i = 0; i < numProductos; i++) {
            if (productos[i].getNombre().equals(nuevoProducto.getNombre())) {
                productos[i].setCantidad(productos[i].getCantidad() + nuevoProducto.getCantidad());
                return;
            }
        }
        productos[numProductos++] = nuevoProducto;
    }

    //precio total compra
    public double totalCompra() {
        double totalCompra = 0;
        for (int i = 0; i < numProductos; i++) {
            totalCompra += productos[i].totalPrecioProducto();
        }
        return totalCompra;
    }

    //mostrar la cuenta
    public void mostrarCuenta() {
        System.out.println("Producto             Un.       PU    Total");
        System.out.println("------------------------------------------");
        for (int i = 0; i < numProductos; i++) {
            Producto producto = productos[i];
            System.out.println(String.format("%-20s %4d %8.2f %8.2f", 
                producto.getNombre(), 
                producto.getCantidad(), 
                producto.getPrecioUnitario(), 
                producto.totalPrecioProducto()));
        }
        System.out.println("------------------------------------------");
        System.out.println(String.format("Total:                            %8.2f", totalCompra()));
    }
}
