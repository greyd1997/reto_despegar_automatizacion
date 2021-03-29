package com.greyd.screenplay.util;

import java.time.LocalDateTime;

public class Date {
    private LocalDateTime ldt = LocalDateTime.now();
    private int dia = ldt.getDayOfMonth() + 1;
    private int mes = ldt.getMonthValue();
    private int anio = ldt.getYear();

    public int getDia()
    {
        return dia;
    }
    public int getMes()
    {
        return mes;
    }
    public int getAnio()
    {
        return anio;
    }
    public int calculardiaIda()
    {
        if(this.getDia()>31)
        {
            dia = 1;
            mes = mes+1;
        }
        return dia;
    }
    public int calculardiaRegreso()
    {
        int diaRegreso= dia+1;


        if(diaRegreso>31)
        {
            diaRegreso=1;

        }
        return diaRegreso;
    }
    public int calcularMesIda()
    {
        int mesRegreso=mes;
                if(dia>31)
                {
                    mesRegreso=mes+1;
                }

        return mesRegreso;
    }
    public int calcularMesRegreso()
    {
        int diaRegreso=dia+1;
        int mesRegreso=mes;
        if(dia>31)
        {
            mesRegreso=mes+1;
        }

        return mesRegreso;
    }



}
