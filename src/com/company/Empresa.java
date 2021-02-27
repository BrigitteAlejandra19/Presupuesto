package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {

    Scanner sc = new Scanner(System.in);
    int op = 0;

    List<Presupuesto> presupuestos = new ArrayList<>();

    public void agregarPresupuesto(Presupuesto presupuesto){
        presupuestos.add(presupuesto);
    }

    public void mostrarMenuPresupuesto() {
        Presupuesto presupuesto = null;
        do{
            System.out.println("\n Menú: \n");
            System.out.println("Por favor ingrese la opcion deseada: ");
            System.out.println("1) Agregar Items al presupuesto");
            System.out.println("2) Modificar items al presupuesto");
            System.out.println("3) Eliminar items del presupuesto");
            System.out.println("4) Mostrar presupuesto");
            System.out.println("0) Salir");
            System.out.print("Ingrese la opción deseada: ");
            op = sc.nextInt();

            switch (op){
                case 1:
                    presupuesto = crearPresupuesto();
                    break;
                case 2:
                    modificarItemsPresupuesto(presupuesto);
                    break;
                case 3:
                    eliminarItemsPresupuesto(presupuesto);
                    break;
                case 4:
                    mostrarPresupuesto(presupuesto);
                    break;
            }
        }while(op!=0);
    }

    public Presupuesto crearPresupuesto() {
        Cliente Kel = new Cliente("Kel", "19077478");
        Presupuesto presupuesto = new Presupuesto(1, LocalDate.now(), Kel);
        Item prod1 = new Producto("Celular","Samsung", 10, 2000.00);
        Item ser1 = new Servicio("Reparacion","celulares", 100.00, 4,"Anthony");
        presupuesto.agregarItemAlPresupuesto(prod1);
        presupuesto.agregarItemAlPresupuesto(ser1);
        return presupuesto;
     }

        public void modificarItemsPresupuesto (Presupuesto presupuesto) {
            if (presupuesto == null){
                System.out.println("No existe presupuesto");
                return;
            }
            presupuesto.mostrarItemsPresupuesto();
            System.out.println("Escriba el codigo del item que desea modificar ");
            int codigoItem = sc.nextInt();
            System.out.println("Escriba la NUEVA cantidad: ");
            int nuevaCantidad = sc.nextInt();
            Item item1 = presupuesto.obtenerItem(codigoItem);
            item1.modificarCantidaDeHoras(nuevaCantidad);
        }

    public void eliminarItemsPresupuesto (Presupuesto presupuesto) {
        if (presupuesto != null){

        presupuesto.mostrarItemsPresupuesto();
        System.out.println("Escriba el indice del item que desea eliminar");
        int indiceItem = sc.nextInt();

        presupuesto.eliminarItemAlPresupuesto(indiceItem);
        }else
            System.out.println("No existe presupuesto");
    }

    public void mostrarPresupuesto(Presupuesto presupuesto) {
          if (presupuesto != null){
              presupuesto.mostrarItemsPresupuesto();
              double[] totales = presupuesto.obtenerTotales();
              System.out.println("Total Servicios: " + totales[1]);
              System.out.println("Total Productos: " + totales[0]);
              System.out.println("Total General: " + totales[2]);
          } else
              System.out.println("No existe presupuesto");
    }


}
