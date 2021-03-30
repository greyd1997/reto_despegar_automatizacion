package com.greyd.screenplay.userinterface.hotel;

import com.greyd.screenplay.util.Date;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.SerenityWebdriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelHomePage {
    public static Date date = new Date();
    public static final Target DESTINO_HOTEL_FIELD = Target.the("origen").located(By.xpath("//input[@class='input-tag']"));
    public static final Target DESTINO_HOTEL_CONFIRM = Target.the("origen").located(By.xpath("//em[contains(text(), 'Marta')]"));
    public static final Target OPEN_FECHA_HOTEL_FIELD = Target.the("open fecha hotel").located(By.xpath("//input[@placeholder='Entrada']"));
    public static final Target FECHA_ENTRADA_FIELD = Target.the("date in").located(By.xpath("//div [@data-month='"+date.getAnio()+"-0"+date.getMes()+"']//div[@class='sbox5-monthgrid-datenumber-number' and contains(text(), '"+date.getDia()+"')]"));//div[contains(text(), '"+date.calculardiaIda()+"')]"));
    public static final Target FECHA_SALIDA_FIELD = Target.the("date out").located(By.xpath("//div [@data-month='"+date.getAnio()+"-0"+date.getMesRegreso()+"']//div[@class='sbox5-monthgrid-datenumber-number' and contains(text(), '"+date.getDiaRegreso()+"')]"));
    public static final Target BUSCAR_BUTTON = Target.the("search button").located(By.xpath("//em[contains(text(), 'Buscar')]"));



}
