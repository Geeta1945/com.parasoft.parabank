package com.parasoft.parabank.testsuite;

import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    // checking user is on homepage
    @Test
    public void IsWelcomeMessageDisplayed(){
        HomePage homePageObj = new HomePage();

       String actualMessage= homePageObj.getWelcomeMessage();
       String expectedMessage = "Customer Login";
        Assert.assertEquals(actualMessage,expectedMessage);


    }
}
