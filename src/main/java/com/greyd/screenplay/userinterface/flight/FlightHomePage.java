package com.greyd.screenplay.userinterface.flight;

import com.greyd.screenplay.util.Date;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightHomePage {
    public static Date date = new Date();
    public static final Target IDA_CHECKBOX = Target.the("ida").located(By.xpath("//span[contains(text(), 'Solo ida')]"));
    public static final Target ORIGEN_FIELD = Target.the("origen").located(By.xpath("//input[@class='input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-origin-input sbox-primary sbox-places-first places-inline']"));
    public static final Target ORIGEN_CONFIRM = Target.the("origen").located(By.xpath("//em[contains(text(), 'Medell')]"));
    public static final Target DESTINO_FIELD = Target.the("destino").located(By.xpath("//input[@class='input-tag sbox-main-focus sbox-bind-reference-flight-roundtrip-destination-input sbox-secondary sbox-places-second places-inline']"));
    public static final Target DESTINO_CONFIRM = Target.the("origen").located(By.xpath("//em[contains(text(), 'Marta')]"));
    public static final Target OPEN_FECHA_FIELD = Target.the("open fecha").located(By.xpath("//input[@placeholder='Ida']"));
    public static final Target FECHA_FIELD = Target.the("fecha").located(By.xpath("//span[contains(text(), '"+date.getDia()+"')]"));
    public static final Target BUSCAR_BUTTON = Target.the("buscar").located(By.xpath("//em[contains(text(), 'Buscar')]"));


}
