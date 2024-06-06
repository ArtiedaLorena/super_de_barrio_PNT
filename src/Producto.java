import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Producto implements Comparable<Producto> {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract String toString();

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Producto otroProducto) {
        return Double.compare(this.precio, otroProducto.precio);
    }
}