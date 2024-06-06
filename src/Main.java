import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = cargarProductos();

        Collections.sort(productos);

        for (Producto producto : productos) {
            System.out.println(producto);
        }

        System.out.println("=============================");
        System.out.println("Producto más caro: " + productos.get(productos.size() - 1).getNombre());
        System.out.println("Producto más barato: " + productos.get(0).getNombre());
    }

    public static List<Producto> cargarProductos() {
        List<Producto> productos = new ArrayList<>();

        productos.add(new ProductoPorLitro("Coca-Cola Zero", 1.5, 20));
        productos.add(new ProductoPorLitro("Coca-Cola", 1.5, 18));
        productos.add(new ProductoPorLitro("Shampoo Sedal", 0.5, 19));
        productos.add(new ProductoPorKilo("Frutillas", 64));

        return productos;
    }
}