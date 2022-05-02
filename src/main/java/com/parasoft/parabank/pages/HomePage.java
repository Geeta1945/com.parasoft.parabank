package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By welcomeMessage = By.xpath("//h2[contains(text(),'Customer Login')]");

    public String getWelcomeMessage(){
       return getTextFromElement(welcomeMessage);

    }
}
