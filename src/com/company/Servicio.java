package com.company;

public class Servicio extends Elemento implements Item {

    private Double costoPorHora;
    private Integer cantidadDeHoras;
    private String nombredDelTecnico; //lista preestablecida

    public Servicio(String nombre, String descripcion, Double costoPorHora, Integer cantidadDeHoras, String nombredDelTecnico) {
        super(nombre, descripcion);
        this.costoPorHora = costoPorHora;
        this.cantidadDeHoras = cantidadDeHoras;
        this.nombredDelTecnico = nombredDelTecnico;
    }

    public Double getCostoPorHora() {
        return costoPorHora;
    }

    public void setCostoPorHora(Double costoPorHora) {
        this.costoPorHora = costoPorHora;
    }

    public Integer getCantidadDeHoras() {
        return cantidadDeHoras;
    }

    public void setCantidadDeHoras(Integer cantidadDeHoras) {
        this.cantidadDeHoras = cantidadDeHoras;
    }

    public String getNombredDelTecnico() {
        return nombredDelTecnico;
    }

    public void setNombredDelTecnico(String nombredDelTecnico) {
        this.nombredDelTecnico = nombredDelTecnico;
    }

    @Override
    public Double calcularTotalItem() {
        return cantidadDeHoras * costoPorHora;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Nombre: "+getNombre());
        System.out.println("Descripcion: "+getDescripcion());
        System.out.println("Costo Por Hora: "+getCostoPorHora());
        System.out.println("Cantidad de Horas: "+getCantidadDeHoras());
        System.out.println("Nombred Del Tecnico: "+getNombredDelTecnico());
        }

    @Override
    public void modificarCantidaDeHoras(int nuevaCantidad) {
        setCantidadDeHoras(nuevaCantidad);
    }

}

