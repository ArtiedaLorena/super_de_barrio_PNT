class ProductoPorKilo extends Producto {
    public ProductoPorKilo(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: kilo";
    }
}
