package com.greyd.screenplay.tasks.flight;

import com.greyd.screenplay.model.Flight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import static com.greyd.screenplay.userinterface.flight.FlightHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ScheduleFlight implements Task {
    private Flight flight;

    public ScheduleFlight(Flight flight){
        this.flight= flight;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(IDA_CHECKBOX),
                Clear.field(ORIGEN_FIELD),
                Enter.theValue(flight.getOrigen()).into(ORIGEN_FIELD),
                Click.on(ORIGEN_CONFIRM),
                Enter.theValue(flight.getDestino() ).into(DESTINO_FIELD),
                Click.on(DESTINO_CONFIRM),
                Click.on(OPEN_FECHA_FIELD),
                Click.on(FECHA_FIELD),
                Click.on(BUSCAR_BUTTON)
        );

    }

    public static ScheduleFlight with(Flight flight)
    {
        return instrumented(ScheduleFlight.class, flight);
    }
}
