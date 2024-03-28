package com.gm.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadora[];
    private static int contadorOrdenes;
    private static int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadora = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadora[this.contadorComputadoras++] = computadora;
        }
        else {
            System.out.println("Has superado el limite de " + MAX_COMPUTADORAS);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Orden #: " + this.idOrden );
        System.out.println("Computadoras de la orden #: " + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadora[i]);
        }
    }
    
    
}
