public class Main {
    public static void main(String[] args) {
        ProductoAlimenticio productoAlimenticio = new ProductoAlimenticio("PA1","Leche Entera Alpina", "Bolsa x 1.100 ml", "Lacteo/Huevos y refrigerados", "Leches", 300.503432, "https://alpina.com/media/catalog/product/cache/b6f2be0b6c86c25988d2ad5d737f6527/l/e/leche-entera-alpina-bolsa-1100-ml-7702001041404-img1.png", "10-05-2024");
        productoAlimenticio.mostrarDetalle();
        productoAlimenticio.calcularPrecioVenta(0.5);

        ProductoElectronico productoElectronico = new ProductoElectronico("PE1","Laptop", "Laptop Marca DELL, pantalla 14'', procesador Core i5-5000", "Computadoras", "Computadora, Laptop", 9600.50, "https://i.dell.com/is/image/DellContent/content/dam/ss2/product-images/dell-client-products/notebooks/inspiron-notebooks/14-7430-2in1-intel/media-gallery/notebook-inspiron-14-7430-silver-fpr-gallery-2.psd?qlt=90,0&op_usm=1.75,0.3,2,0&resMode=sharp&pscan=auto&fmt=png-alpha&hei=500", 3);
        productoElectronico.mostrarDetalle();
        productoElectronico.calcularPrecioVenta(0.2);

    }
}