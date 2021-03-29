package com.greyd.screenplay.userinterface.hotel;

import com.greyd.screenplay.util.ArrayHandle;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HotelFindPage {
    public final static ArrayHandle handle = new ArrayHandle();
    public static WebDriver driver= SerenityWebdriverManager.inThisTestThread().getCurrentDriver();
    public static List<WebElement> listaPrecios = driver.findElements(By.xpath("//span[@class='main-value']"));
    public static ArrayList<Integer> precios =handle.StringAInt(listaPrecios);
    public static int posicion = handle.obtenerPos(precios);
    public static String precioBarato = listaPrecios.get(posicion).getText();
    public static final Target PRECIO_BARATO = Target.the("precios").located(By.xpath("//span[@class='main-value' and contains(text(), '" + precioBarato + "')]"));
}
