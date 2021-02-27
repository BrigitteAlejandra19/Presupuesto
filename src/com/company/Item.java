package com.company;

public interface Item {
    // todos los msjs comunes entre los productos y servicios


    Double calcularTotalItem();
    void mostrarDetalle();

    void modificarCantidaDeHoras(int nuevaCantidad);
}
