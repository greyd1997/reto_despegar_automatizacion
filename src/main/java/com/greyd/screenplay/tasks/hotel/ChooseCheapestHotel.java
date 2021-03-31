package com.greyd.screenplay.tasks.hotel;

import com.greyd.screenplay.model.Price;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.greyd.screenplay.userinterface.hotel.HotelFindPage.PRECIO_BARATO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChooseCheapestHotel implements Task {
    private Price hPrice;

    public ChooseCheapestHotel(Price hPrice){
        this.hPrice= hPrice;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(PRECIO_BARATO),
                Click.on(PRECIO_BARATO)




        );

    }

    public static ChooseCheapestHotel with(Price hPrice)
    {
        return instrumented(ChooseCheapestHotel.class, hPrice);
    }
}
