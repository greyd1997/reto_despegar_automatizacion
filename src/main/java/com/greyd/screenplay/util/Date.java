package com.greyd.screenplay.util;

import java.time.LocalDateTime;

public class Date {
    private LocalDateTime ldt = LocalDateTime.now();
    private int dia = ldt.getDayOfMonth() + 3;
    private int mes = ldt.getMonthValue();
    private int anio = ldt.getYear();

    public int getDia()
    {
        if(dia>31)
        {
            setDia(1);
            return dia;
        }
        else
        {
            return dia;
        }


    }
    public int getDiaRegreso()
    {
        if(dia>31)
        {
            setDia(1);
            return dia+1;
        }
        else
        {
            return dia+1;
        }


    }


    public void setDia( int dia)
    {
        this.dia=dia;
    }
    public int getMes()
    {
        if(dia>31)
        {
            setMes(mes+1);
        }
        return mes;

    }

    public void setMes(int mes)
    {
        this.mes=mes;
    }
    public int getAnio()
    {
        if(mes>12)
        {
            setAnio(anio+1);
            setMes(1);
        }
        else
        {
            return anio;
        }

        return anio;
    }

    public void setAnio(int anio)
    {
        this.anio=anio;
    }




}
