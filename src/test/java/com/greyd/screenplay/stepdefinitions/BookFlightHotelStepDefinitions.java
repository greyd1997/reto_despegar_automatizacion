package com.greyd.screenplay.stepdefinitions;

import com.greyd.screenplay.model.Flight;
import com.greyd.screenplay.model.Hotel;
import com.greyd.screenplay.model.HotelPrice;
import com.greyd.screenplay.model.Tourist;
import com.greyd.screenplay.questions.Flight.TheFinalFlightPage;
import com.greyd.screenplay.questions.Hotel.TheHotelFinalPage;
import com.greyd.screenplay.tasks.flight.FillFlightInformation;
import com.greyd.screenplay.tasks.flight.ScheduleFlight;
import com.greyd.screenplay.tasks.hotel.BookHotel;
import com.greyd.screenplay.tasks.hotel.ChooseCheapestHotel;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BookFlightHotelStepDefinitions {
    @Before
    public void prepareStage1()
    {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^(.*) wants to get to the page to look for flights  to go to Santa Marta$")
    public void goToHomePage(String actorName) {
        theActorCalled(actorName).wasAbleTo(Open.url("https://www.despegar.com.co/vuelos/"));
    }


    @When("^Gustavo inputs the data to search and select a flight  to santa marta$")
    public void ScheduleFlight() throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(ScheduleFlight.with(new Flight("medell","santa marta")));
        Thread.sleep(5000);
        theActorInTheSpotlight().attemptsTo(FillFlightInformation.with(new Tourist("Gustavo","Rey","123456789","calle 123 #32-32","gustavoemail@gmail.com","+57","3002327465")));
        Thread.sleep(5000);


    }

    @Then("^Gustavo will be able to schedule a flight  to Santa Marta$")
    public void ShouldSeeTheBuyButton() {
        theActorInTheSpotlight().should(seeThat(TheFinalFlightPage.isVisible()));

    }
    @Before
    public void prepareStage2()
    {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) wants to get to the page to look for Hotels  to go to Santa Marta$")
    public void goToHotelHomePage(String actorName) {
        theActorCalled(actorName).wasAbleTo(Open.url("https://www.despegar.com.co/hoteles/"));
    }

    @When("^Gustavo inputs the data to search and select a hotel  in santa marta$")
    public void bookCheapHotel() throws InterruptedException {
        Thread.sleep(5000);
        theActorInTheSpotlight().attemptsTo(BookHotel.with(new Hotel("Santa Marta")));
        Thread.sleep(10000);
        theActorInTheSpotlight().attemptsTo(ChooseCheapestHotel.with(new HotelPrice()));
        Thread.sleep(10000);
    }

    @Then("^Gustavo will be able to book a hotel in Santa Marta$")
    public void gustavoWillBeAbleToBookAHotelInSantaMarta() {
        theActorInTheSpotlight().should(seeThat(TheHotelFinalPage.isVisible()));
    }



}
