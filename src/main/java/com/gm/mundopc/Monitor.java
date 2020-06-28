package com.gm.mundopc;

public class Monitor extends DispositivosEyS{
    
    private final int idMonitor;
    private double tamaño;
    private static int contadorMonitor;
    
    public Monitor(String tipo, String marca, double tamaño) {
        super(tipo, marca);
        this.idMonitor = ++contadorMonitor;
        this.tamaño = tamaño;
    }  

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public static int getContadorMonitor() {
        return contadorMonitor;
    }

    public static void setContadorMonitor(int contadorMonitor) {
        Monitor.contadorMonitor = contadorMonitor;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", tama\u00f1o=" + tamaño + ", marca="+getMarca()+", tipo="+getTipo()+'}';
    }
}
