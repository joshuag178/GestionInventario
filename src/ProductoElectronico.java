public class ProductoElectronico extends Producto implements Vendible{
    private int garantiaMeses;

    public ProductoElectronico(String id, String nombre, String descripcion, String categoria, String etiquetas, Double precio, String urlFoto, int garantiaMeses) {
        super(id, nombre, descripcion, categoria, etiquetas, precio, urlFoto);
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Información del Articulo \n Id: " + getId() + ", Nombre: " + getNombre() + ", Descripción: " + getDescripcion() + ", Cartegoria: " + getCategoria() + ", Etiquetas: " + getEtiquetas() + ", Precio: $ " + String.format("%.2f", getPrecio()) + ", URL Foto: " + getUrlFoto() + "," + " Garantia: " + this.garantiaMeses + " Meses" + " \n");
    }

    @Override
    public void calcularPrecioVenta(double porcentajeGanancia) {
        double precioVenta;
        precioVenta = (this.getPrecio() * porcentajeGanancia) + this.getPrecio();
        System.out.println("Precio Venta Producto Electronico: " + precioVenta);
    }
}
