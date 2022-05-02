package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.LoginPage;
import com.parasoft.parabank.testbase.TestBase;
import org.junit.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPageObj = new LoginPage();

    /*
    1.userShouldLoginSuccessfullyWithValidCredentials
			* Enter valid username
			* Enter valid password
			* Click on ‘LOGIN’ button
			* Verify the ‘Accounts Overview’ text is display
     */

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){

        loginPageObj.sendUsername("JinatAman1");
        loginPageObj.sendPassword("Jinat1234");
        loginPageObj.clickOnLoginButton();

    }


    /*
    2.verifyTheErrorMessage
			* Enter invalid username
			* Enter invalid password
			* Click on Login button
			* Verify the error message ‘The username and password could not be verified.’
     */
    @ Test
    public void verifyErrorMessage(){
        loginPageObj.sendUsername("JinatAman");
        loginPageObj.sendPassword("Jinat1234");
        loginPageObj.clickOnLoginButton();

    }


    /*
    3.userShouldLogOutSuccessfully
			* Enter valid username
			* Enter valid password
			* Click on ‘LOGIN’ button
			* Click on ‘Log Out’ link
			* Verify the text ‘Customer Login’
     */


    @Test

    public void userShouldLogoutSuccessfully(){

        userShouldLoginSuccessfullyWithValidCredentials();
        loginPageObj.clickOnLogoutButton();
      String actualMessage=  loginPageObj.isUserOnHomePageAfterSuccessfullyLogOut();

        Assert.assertEquals("Customer Login",actualMessage);
    }

}
