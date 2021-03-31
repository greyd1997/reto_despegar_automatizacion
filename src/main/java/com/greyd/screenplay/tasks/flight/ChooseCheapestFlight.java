package com.greyd.screenplay.tasks.flight;


import com.greyd.screenplay.model.Price;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static com.greyd.screenplay.userinterface.flight.FlightFindPage.CONTINUE_BUTTON;
import static com.greyd.screenplay.userinterface.flight.FlightFindPage.SELECT_FLIGHT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ChooseCheapestFlight implements Task {
    private Price fPrice;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_FLIGHT)
                //JavaScriptClick.on((CONTINUE_BUTTON))
        );
    }

    public static ChooseCheapestFlight with(Price fPrice)
    {
        return instrumented(ChooseCheapestFlight.class, fPrice);
    }
}
