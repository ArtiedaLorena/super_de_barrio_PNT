class ProductoPorLitro extends Producto {
    private double litros;

    public ProductoPorLitro(String nombre, double litros, double precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + " /// Litros: " + litros + " /// Precio: $" + getPrecio();
    }
}