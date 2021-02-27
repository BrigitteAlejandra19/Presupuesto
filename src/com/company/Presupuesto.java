package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Presupuesto {

    private Integer numeroPresupuesto;
    private LocalDate fechaPresupesto;
    List<Item> items = new ArrayList<>();
    private Cliente cliente;

    public Presupuesto(Integer numeroPresupuesto, LocalDate fechaPresupesto, Cliente cliente) {
        this.numeroPresupuesto = numeroPresupuesto;
        this.fechaPresupesto = fechaPresupesto;
        this.cliente = cliente;
    }


    public void agregarItemAlPresupuesto(Item item){
        items.add(item);
    }

    public void eliminarItemAlPresupuesto(int indiceItem){
        items.remove(indiceItem);
    }


    public double[] obtenerTotales(){
        double totalServicio = 0;
        double totalProducto = 0;
        for(Item item: items){
            if (item instanceof Producto){
                totalProducto += item.calcularTotalItem();
            }else
                totalServicio += item.calcularTotalItem();
        }
        return new double[]{totalProducto, totalServicio, totalProducto + totalServicio};
    }

    public void mostrarItemsPresupuesto(){
        for (int i=0; i< items.size(); i++){
            System.out.println("EL codigo del Item es: "+i);
            items.get(i).mostrarDetalle();
        }
    }


    public void salir(){

    }

    public Item obtenerItem(int codigoItem) {
        return items.get(codigoItem);
    }
}


