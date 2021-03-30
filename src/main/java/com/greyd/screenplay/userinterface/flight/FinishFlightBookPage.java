package com.greyd.screenplay.userinterface.flight;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinishFlightBookPage {
    public static final Target PAYMENT_CHECKBOX = Target.the("payment").located(By.xpath("//span[contains(text(), 'PSE')]"));
    public static final Target SELECT_BANK_PANEL = Target.the("bank select").located(By.xpath("//select[@cashpaymentinfo='cashPaymentInfo']"));
    public static final Target BANK_SELECT = Target.the("bank select").located(By.xpath("//option[contains(text(), 'Scotiabank Colpatria')]"));
    public static final Target BILLING_DATA = Target.the("billing data").located(By.xpath("//div[@checkoutsection='billing-data']"));
    public static final Target FIRST_NAME = Target.the("first name").located(By.xpath("//input[@id='invoice-first-name-0']"));
    public static final Target LAST_NAME = Target.the("last name").located(By.xpath("//input[@id='invoice-last-name-0']"));
    public static final Target DOCUMENT_TYPE_PANEL = Target.the("document type panel").located(By.xpath("//select[@id='invoice-fiscal-identification-type-0']"));
    public static final Target DOCUMENT_TYPE_SELECT = Target.the("document type select").located(By.xpath("//option[@value='CC']"));
    public static final Target DOCUMENT_NUMBER = Target.the("document number").located(By.xpath("//input[@id='invoice-fiscal-identification-number-0']"));
    public static final Target ADDRESS = Target.the("address").located(By.xpath("//input[@class='input-tag invoice-fiscal-address-street ng-untouched ng-pristine ng-invalid']"));
    public static final Target TRAVELER_DATA = Target.the("traveler data").located(By.xpath("//div[@checkoutsection='traveler-data']"));
    public static final Target TRAVELER_NAME = Target.the("traveler name").located(By.xpath("//input[@class='input-tag traveler-first-name ng-untouched ng-pristine ng-invalid']"));
    public static final Target TRAVELER_LAST_NAME = Target.the("traveler last name").located(By.xpath("//input[@class='input-tag traveler-last-name ng-untouched ng-pristine ng-invalid']"));
    public static final Target DOCUMENT_TRAVELER_NUMBER = Target.the("traveler id number").located(By.xpath("//input[@id='traveler-identification-number-0']"));
    public static final Target SELECT_DAY_PANEL = Target.the("day panel").located(By.xpath("//select[@id='traveler-birthday-day-0']/option[@value='16']"));
    public static final Target SELECT_MONTH_PANEL = Target.the("month panel").located(By.xpath("//select[@id='traveler-birthday-month-0']/option[@value='7']"));
    public static final Target SELECT_YEAR_PANEL = Target.the("year panel").located(By.xpath("//select[@id='traveler-birthday-year-0']/option[@value='1997']"));
    public static final Target SEX_CHECKBOX = Target.the("sexo").located(By.xpath("//em[contains(text(), 'Masculino')]"));
    public static final Target EMAIL_DATA = Target.the("email data").located(By.xpath("//div[@checkoutsection='email-data']"));
    public static final Target EMAIL = Target.the("email").located(By.xpath("//input[@placeholder='Ingresa el email de contacto']"));
    public static final Target CONFIRM_EMAIL = Target.the("confirm email").located(By.xpath("//input[@placeholder='Ingresa tu email']"));
    public static final Target PHONE_DATA = Target.the("phone data").located(By.xpath("//div[@checkoutsection='phone-data']"));
    public static final Target AREA_NUMBER = Target.the("area number").located(By.xpath("//input[@autocomplete='section-contact-phone-0 tel-area-code']"));
    public static final Target CELLPHONE_NUMBER = Target.the("cellphone number").located(By.xpath("//input[@autocomplete='section-contact-phone-0 tel-local']"));
    public static final Target POLICY = Target.the("policy").located(By.xpath("//span[contains(text(), 'acepto las')]"));
    public static final Target BUY_BUTTON = Target.the("payment").located(By.xpath("//em[contains(text(), 'Comprar')]"));

}
