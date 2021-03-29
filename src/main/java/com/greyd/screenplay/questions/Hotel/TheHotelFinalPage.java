package com.greyd.screenplay.questions.Hotel;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.greyd.screenplay.userinterface.hotel.HotelFindPage.PRECIO_BARATO;

public class TheHotelFinalPage implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return PRECIO_BARATO.resolveFor(actor).isVisible();
    }

    @Override
    public String getSubject() {
        return "The Cheapest hotel button is visible";
    }

    public static Question<Boolean> isVisible()
    {
        return new TheHotelFinalPage();
    }
}
