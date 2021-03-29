Feature: Book Flight and Hotel
  As a tourist
  I want to schedule a flight and a hotel
  To get to Santa Marta

  Scenario: Book Flight
    Given Gustavo wants to get to the page to look for flights  to go to Santa Marta
    When Gustavo inputs the data to search and select a flight  to santa marta
    Then Gustavo will be able to schedule a flight  to Santa Marta

   Scenario: Book Hotel
     Given Gustavo wants to get to the page to look for Hotels  to go to Santa Marta
     When Gustavo inputs the data to search and select a hotel  in santa marta
     Then Gustavo will be able to book a hotel in Santa Marta

