package com.gm.mundopc;

public class Teclado extends DispositivosEyS {
    private final int idTeclado;
    private int contadorTeclado;

    public Teclado(String tipo, String marca) {
        super(tipo, marca);
        this.idTeclado = ++contadorTeclado;
    } 

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", contadorTeclado=" + contadorTeclado + ", marca="+getMarca()+", tipo="+getTipo()+'}';
    }
}
