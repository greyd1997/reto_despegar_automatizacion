package com.greyd.screenplay.tasks.hotel;
import com.greyd.screenplay.model.Hotel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import static com.greyd.screenplay.userinterface.hotel.HotelHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BookHotel implements Task {
    private Hotel hotel;

    public BookHotel(Hotel hotel){
        this.hotel= hotel;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DESTINO_HOTEL_FIELD),
                Enter.theValue(hotel.getDestino()).into(DESTINO_HOTEL_FIELD),
                Click.on(DESTINO_HOTEL_CONFIRM),
                JavaScriptClick.on(OPEN_FECHA_HOTEL_FIELD),
                JavaScriptClick.on(FECHA_ENTRADA_FIELD),
                JavaScriptClick.on(FECHA_SALIDA_FIELD),
                Click.on(BUSCAR_BUTTON)



        );

    }

    public static BookHotel with(Hotel hotel)
    {
        return instrumented(BookHotel.class, hotel);
    }
}
