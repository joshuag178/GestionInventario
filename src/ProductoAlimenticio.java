public class ProductoAlimenticio extends Producto implements Vendible{
    private String fechaCaducidad;

    public ProductoAlimenticio(String nombre, String descripcion, String categoria, String etiquetas, Double precio, String urlFoto, String fechaCaducidad) {
        super(nombre, descripcion, categoria, etiquetas, precio, urlFoto);
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Información del Articulo \n Nombre: " + getNombre() + ", Descripción: " + getDescripcion() + ", Cartegoria: " + getCategoria() + ", Etiquetas: " + getEtiquetas() + ", Precio: $ " + String.format("%.2f", getPrecio()) + ", URL Foto: " + getUrlFoto() + "," + " Fecha de Caducidad: " + this.fechaCaducidad + " \n");
    }

    @Override
    public void calcularPrecioVenta(double porcentajeGanancia) {
        double precioVenta;
        precioVenta = (this.getPrecio() * porcentajeGanancia) + this.getPrecio();
        System.out.println("Precio Venta Producto Alimenticio: " + String.format("%.2f", precioVenta) + "\n");
    }
}
