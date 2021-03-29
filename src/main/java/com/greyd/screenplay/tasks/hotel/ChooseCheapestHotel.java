package com.greyd.screenplay.tasks.hotel;

import com.greyd.screenplay.model.HotelPrice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;

import static com.greyd.screenplay.userinterface.hotel.HotelFindPage.PRECIO_BARATO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChooseCheapestHotel implements Task {
    private HotelPrice hPrice;

    public ChooseCheapestHotel(HotelPrice hPrice){
        this.hPrice= hPrice;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PRECIO_BARATO),
                Click.on(PRECIO_BARATO)




        );

    }

    public static ChooseCheapestHotel with(HotelPrice hPrice)
    {
        return instrumented(ChooseCheapestHotel.class, hPrice);
    }
}
