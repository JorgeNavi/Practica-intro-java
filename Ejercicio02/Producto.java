package Ejercicio02;

public class Producto {

    private String nombre;
    private double precioUnitario;
    private int cantidad;
    
    //Constructor
    public Producto(String nombre, double precioUnitario, int cantidad) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getPrecioUnitario() {
        return precioUnitario;
    }


    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }


    public int getCantidad() {
        return cantidad;
    }


    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //añadir X cantidad a un producto
    public void sumarCantidad (int suma) {
        this.cantidad += suma;
    }

    //calcular el precio que va a resultar de ese producto en base a las cantidades
    public double totalPrecioProducto() {
        return precioUnitario * cantidad;
    }

    
}
