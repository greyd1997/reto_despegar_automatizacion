package com.greyd.screenplay.userinterface.flight;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FlightFindPage {
    public static final Target SELECT_FLIGHT = Target.the("recommended flight").located(By.xpath("//em[contains(text(), 'Seleccionar')]"));
}
