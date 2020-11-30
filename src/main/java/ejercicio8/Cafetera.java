/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author Hind
 */
public class Cafetera {

    private double capacidadMaxima;
    private double capacidadActual;

    /* public Cafetera(double capacidadMaxima, double capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }*/
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.capacidadActual = 0;
    }

    /*Constructor, que recibe sólo la capacidad máxima de la cafetera;
inicializa la cantidad actual de café igual a la capacidad máxima (cafetera llena).*/
    public Cafetera(double capacidadMaxima) {
        this.capacidadMaxima = capacidadActual;

    }

    /*Constructor, que recibe la capacidad máxima y la cantidad actual.
    Si la cantidad actual que se pasa es mayor que la capacidad máxima de la cafetera,
    //se ajustará la cantidad actual a la capacidad máxima*/
    public Cafetera(double capacidadMaxima, double capacidadActual) {
        if (capacidadActual > capacidadMaxima) {
            capacidadMaxima = capacidadActual;
        }
    }

    //llenarCafetera(): hace que la cantidad actual sea igual a la capacidad.
    public static void llenarCafetera() {
      
    }
   /* servirTaza(double cantidadAServir): simula la acción de servir una taza con la capacidad indicada.
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.*/
    public static void servirTaza(double cantidadAServir,double capacidadActual){
        System.out.println("cuanto es la contidad a servir ?");
        Scanner scan=new Scanner(System.in);
        cantidadAServir=scan.nextDouble();
        
        if (cantidadAServir < capacidadActual){
            System.out.println("Capacidad sufisente");
            capacidadActual=capacidadActual-cantidadAServir;
        }
        cantidadAServir=capacidadActual;
    }
    //vaciarCafetera(): pone la cantidad de café actual en cero
    public static void vaciarCafetera(double capacidadActual){
        capacidadActual=0;
    }
    /*agregarCafe(double cantidadAgregar): añade a la cafetera la cantidad de café indicada, 
    teniendo en cuenta que la cafetera no puede rebosar.*/
      public static void agregarCafe(double cantidadAgregar){
          
      }
}
