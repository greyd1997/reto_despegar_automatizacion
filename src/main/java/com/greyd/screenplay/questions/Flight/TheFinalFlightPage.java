package com.greyd.screenplay.questions.Flight;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.greyd.screenplay.userinterface.flight.FinishFlightBookPage.BUY_BUTTON;

public class TheFinalFlightPage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return BUY_BUTTON.resolveFor(actor).isVisible();
    }

    @Override
    public String getSubject() {
        return "the buy button is visible";
    }
    public static Question<Boolean> isVisible()
    {
        return new TheFinalFlightPage();
    }
}
