package com.company;

public class Producto extends Elemento implements Item {

    private Integer cantidad;
    private Double precioUnitario;

    public Integer getCantidadProducto() {
        return cantidad;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidad = cantidadProducto;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Producto(String nombre, String descripcion, Integer cantidadProducto, Double precioUnitario) {
        super(nombre, descripcion);
        this.cantidad = cantidadProducto;
        this.precioUnitario = precioUnitario;
    }

    @Override
    public Double calcularTotalItem() {
        return cantidad * precioUnitario;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Descripcion: "+getDescripcion());
        System.out.println("Cantidad: "+getCantidadProducto());
        System.out.println("Precio unitario: "+getPrecioUnitario());
    }

    @Override
    public void modificarCantidaDeHoras(int nuevaCantidad) {
        setCantidadProducto(nuevaCantidad);
    }

}
