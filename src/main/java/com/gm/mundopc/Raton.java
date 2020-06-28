package com.gm.mundopc;

public class Raton extends DispositivosEyS{
    private final int idRaton;
    private int contadorRatones;

    public Raton(String tipo, String marca) {
        super(tipo, marca);
        this.idRaton = ++contadorRatones;
    } 

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ", contadorRatones=" + contadorRatones + ", marca="+getMarca()+", tipo="+getTipo()+'}';
    }
}
