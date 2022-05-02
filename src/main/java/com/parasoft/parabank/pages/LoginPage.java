package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By registerButton =By.linkText("Register");
    By signUpMessage = By.xpath("//h1[text()='Signing up is easy!']");


    By usernameToLogin = By.name("username");
    By passwordToLogin = By.name("password");
    By clickOnLogin = By.xpath("//input[@value='Log In']");

    By logOutButton = By.xpath("//a[@href='/parabank/logout.htm']");

    By isHomePageMessage =By.xpath("//h2[text()='Customer Login']");

    public void clickOnRegisterButton(){
        mouseHoverToElementAndClick(registerButton);
        }


        public String getSignUpMessage(){

        return getTextFromElement(signUpMessage);
        }

        public void sendUsername(String username){

        sendTextToElement(usernameToLogin,username);
        }

        public void sendPassword(String password){

        sendTextToElement(passwordToLogin,password);
        }

        public void clickOnLoginButton(){
        clickOnElement(clickOnLogin);
        }

        public void clickOnLogoutButton()
        {

            mouseHoverToElementAndClick(logOutButton);
        }

        public String isUserOnHomePageAfterSuccessfullyLogOut(){

        return getTextFromElement(isHomePageMessage);

        }






}
