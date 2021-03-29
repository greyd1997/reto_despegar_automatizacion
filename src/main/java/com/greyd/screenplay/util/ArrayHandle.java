package com.greyd.screenplay.util;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandle {
    public int obtenerPos(ArrayList<Integer> arreglo)
    {
        int aux = arreglo.get(0);
        int pos=0;
        for (int i = 0; i < arreglo.size(); i++) {
            if (aux > arreglo.get(i)) {
                aux = arreglo.get(i);
                System.out.print("precio a comparar: " + arreglo.get(i));
                System.out.print("\n");
                pos = i;
            }
        }
        return pos;
    }

    public ArrayList<Integer> StringAInt(List<WebElement> arregloWeb)
    {
        ArrayList<Integer> arregloInt = new ArrayList<>();
        for (int i = 0; i < arregloWeb.size(); i++) {
            String pr = arregloWeb.get(i).getText().replace(".", "");
            int pr2 = Integer.parseInt(pr);
            arregloInt.add(pr2);
        }
        return arregloInt;
    }
}
