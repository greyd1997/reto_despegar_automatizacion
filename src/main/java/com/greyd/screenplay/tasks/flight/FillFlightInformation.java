package com.greyd.screenplay.tasks.flight;


import com.greyd.screenplay.model.Tourist;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;


import static com.greyd.screenplay.userinterface.flight.FinishFlightBookPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FillFlightInformation implements Task {
    private Tourist tourist;

    public FillFlightInformation(Tourist tourist){
        this.tourist= tourist;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                JavaScriptClick.on(PAYMENT_CHECKBOX),
                Click.on(SELECT_BANK_PANEL),
                Click.on(BANK_SELECT),
                Scroll.to(BILLING_DATA),
                Enter.theValue(tourist.getName()).into(FIRST_NAME),
                Enter.theValue(tourist.getLastName()).into(LAST_NAME),
                Click.on(DOCUMENT_TYPE_PANEL),
                Click.on(DOCUMENT_TYPE_SELECT),
                Enter.theValue(tourist.getIdNumber()).into(DOCUMENT_NUMBER),
                Enter.theValue(tourist.getAddress()).into(ADDRESS),
                Scroll.to(TRAVELER_DATA),
                Enter.theValue(tourist.getName()).into(TRAVELER_NAME),
                Enter.theValue(tourist.getLastName()).into(TRAVELER_LAST_NAME),
                Enter.theValue(tourist.getIdNumber()).into(DOCUMENT_TRAVELER_NUMBER),
                //Click.on(SELECT_DAY_PANEL),
                //Click.on(SELECT_MONTH_PANEL ),
                //Click.on(SELECT_YEAR_PANEL),
                //Click.on(SEX_CHECKBOX),
                Scroll.to(EMAIL_DATA),
                Enter.theValue(tourist.getEmail()).into(EMAIL),
                Enter.theValue(tourist.getEmail()).into(CONFIRM_EMAIL),
                Scroll.to(PHONE_DATA),
                Enter.theValue(tourist.getPhoneArea()).into(AREA_NUMBER),
                Enter.theValue(tourist.getPhoneNumber()).into(CELLPHONE_NUMBER),
                Click.on(POLICY)

        );


    }

    public static FillFlightInformation with(Tourist tourist)
    {
        return instrumented(FillFlightInformation.class, tourist);
    }
}
