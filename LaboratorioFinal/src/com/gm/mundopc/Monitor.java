package com.gm.mundopc;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, double tamanio) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{");
        sb.append("idMonitor= ").append(idMonitor);
        sb.append(", marca= ").append(marca);
        sb.append(", tamanio= ").append(tamanio);
        sb.append('}');
        return sb.toString();
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamaño() {
        return tamanio;
    }

    public void setTamaño(double tamaño) {
        this.tamanio = tamaño;
    }

}
