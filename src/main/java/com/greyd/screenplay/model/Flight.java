package com.greyd.screenplay.model;

public class Flight {
    private String origen;
    private String destino;


    public Flight(String origen, String destino)
    {
        this.origen=origen;
        this.destino=destino;
    }

    public String getOrigen()
    {
        return origen;
    }
    public String getDestino()
    {
        return destino;
    }


}
