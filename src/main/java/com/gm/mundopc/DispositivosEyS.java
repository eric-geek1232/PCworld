package com.gm.mundopc;

public class DispositivosEyS {
    private String tipo;
    private String marca;

    public DispositivosEyS(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada{" + "tipo=" + tipo + ", marca=" + marca + '}';
    }
    
}
