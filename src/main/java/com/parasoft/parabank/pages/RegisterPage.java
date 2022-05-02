package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By myFirstName = By.xpath("//input[@id='customer.firstName']");
    By myLastName = By.xpath("//input[@name='customer.lastName']");
    By streetName = By.xpath("//input[@id='customer.address.street']");
    By cityName = By.xpath("//input[@id='customer.address.city']");
    By stateName = By.xpath("//input[@id='customer.address.state']");
    By postCode = By.xpath("//input[@name='customer.address.zipCode']");
    By phoneNo = By.xpath("//input[@name='customer.phoneNumber']");
    By ssn = By.xpath("//input[@name='customer.ssn']");
    By userName = By.xpath("//input[@name='customer.username']");
    By password = By.xpath("//input[@id='customer.password']");
    By repeatPassword = By.xpath("//input[@id='repeatedPassword']");

    By registerButton = By.xpath("//input[@value='Register']");

    public void enterFirstName(String firstName) {

        sendTextToElement(myFirstName, firstName);


    }

    public void enterSecondName(String secondName) {

        sendTextToElement(myLastName, secondName);
    }


    public void enterStreetName(String street) {
        sendTextToElement(streetName, street);
    }


    public void enterCityName(String city) {

        sendTextToElement(cityName, city);
    }

    public void enterStateName(String state) {

        sendTextToElement(stateName, state);
    }

    public void enterPostCode(String postCodeEntered) {
        sendTextToElement(postCode, postCodeEntered);

    }

    public void enterPhoneNumber(String phoneNumber) {
        sendTextToElement(phoneNo, phoneNumber);

    }

    public void enterSsnNumber(String ssnEntered) {
        sendTextToElement(ssn, ssnEntered);

    }

    public void enterUserNumber(String userNameEntered) {
        sendTextToElement(userName, userNameEntered);

    }

    public void enterPassword(String passwordEntered) {
        sendTextToElement(password, passwordEntered);

    }

    public void enterRepeatPassword(String repeatPasswordEntered) {

        sendTextToElement(repeatPassword, repeatPasswordEntered);

    }


    public void clickOnRegisterButton() {

        clickOnElement(registerButton);
    }

    public String checkWelcomeMessageAfterRegisteredSuccessfully(){

       return getTextFromElement(By.xpath("//p[text()='Your account was created successfully. You are now logged in.']"));
    }


}
