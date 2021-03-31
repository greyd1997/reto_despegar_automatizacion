package com.greyd.screenplay.userinterface.flight;

import com.greyd.screenplay.util.ArrayHandle;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class FlightFindPage {
    public final static ArrayHandle handle = new ArrayHandle();
    public static WebDriver driver= SerenityWebdriverManager.inThisTestThread().getCurrentDriver();
    public static List<WebElement> listaPrecios = driver.findElements(By.xpath("//span[@class='fare-wrapper -eva-3-p-md']//p[@class='item-fare fare-price']//span[@class='amount price-amount']"));
    public static ArrayList<Integer> precios =handle.StringAInt(listaPrecios);
    public static int posicion = handle.obtenerPos(precios);
    public static String precioBarato = listaPrecios.get(posicion).getText();
    public static final Target SELECT_FLIGHT = Target.the("recommended flight").located(By.xpath("//span[contains(text(), '"+precioBarato+"')]/ancestor::node()[12]//em[@class='btn-text']"));
    public static final Target CONTINUE_BUTTON = Target.the("continue").located(By.xpath("//em[contains(text(), 'Continuar')]"));
}
