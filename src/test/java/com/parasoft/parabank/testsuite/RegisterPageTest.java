package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.LoginPage;
import com.parasoft.parabank.pages.RegisterPage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {
  LoginPage loginPageObj = new LoginPage();
  RegisterPage registerPageObj = new RegisterPage();

    /*
      1.verifyThatSigningUpPageDisplay
          * click on the ‘Register’ link
          * Verify the text ‘Signing up is easy!’
       */
    @Test

    public void isSignInMessageDisplayedWhenClickOnRegister(){
       loginPageObj.clickOnRegisterButton();
       String actualMessage = loginPageObj.getSignUpMessage();
        Assert.assertEquals(actualMessage,"Signing up is easy!");

    }

    /*
    2.userShouldRegisterAccountSuccessfully
			* click on the ‘Register’ link
			* Enter First name
			* Enter Last name
			* Enter Address
			* Enter City
			* Enter State
			* Enter Zip Code
			* Enter Phone
			* Enter SSN
			* Enter Username
			* Enter Password
			* Enter Confirm
			* Click on REGISTER button
			* Verify the text 'Your account was created successfully. You are now logged in.’

     */

    @Test

    public void userShouldRegisterAccountSuccessfully(){

      loginPageObj.clickOnRegisterButton();

      registerPageObj.enterFirstName("MyFirstname");
      registerPageObj.enterSecondName("lastname");
      registerPageObj.enterStreetName("14,my street");
      registerPageObj.enterCityName("my city");
      registerPageObj.enterStateName("state");
      registerPageObj.enterPostCode("ha2 0py");
      registerPageObj.enterPhoneNumber("1234567890");
      registerPageObj.enterSsnNumber("m734k00");
      registerPageObj.enterUserNumber("JosephSmith32");
      registerPageObj.enterPassword("MyPassword123");
      registerPageObj.enterRepeatPassword("MyPassword123");


      registerPageObj.clickOnRegisterButton();

      String actualMessage = registerPageObj.checkWelcomeMessageAfterRegisteredSuccessfully();
      Assert.assertEquals(actualMessage,"Your account was created successfully. You are now logged in.");





    }

}
