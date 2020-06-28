package com.gm.mundopc;

public class Orden {
    private final int idorden;
    private final Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idorden = ++contadorOrdenes;
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if(contadorComputadoras < MAX_COMPUTADORAS){
            computadoras[contadorComputadoras++] = computadora;
        }else{
            System.out.println("usted ha sobrepasado el limite en los productos");
        }
    }
    
    public void mostrarOrden(){
        System.out.println("orden :" + idorden);
        System.out.println("computadoras de la orden #" + idorden +":");
        for(int i=0; i< contadorComputadoras; i++){
            System.out.println(computadoras[i]);
        }
    }
}
