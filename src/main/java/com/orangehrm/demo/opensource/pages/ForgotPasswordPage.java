package com.orangehrm.demo.opensource.pages;

import com.aventstack.extentreports.Status;
import com.orangehrm.demo.opensource.customlisteners.CustomListeners;
import com.orangehrm.demo.opensource.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ForgotPasswordPage extends Utility {
    @CacheLookup
    @FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[4]/p[1]")
    WebElement forgotPasswordLink;
    @CacheLookup
    @FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/form[1]/h6[1]")
    WebElement verifyText;

    public void clickOnForgotPasswordLink() {
        Reporter.log("Click on Forgot Password" + forgotPasswordLink.toString());
        clickOnElement(forgotPasswordLink);
    }

    public String textVerify() {
        Reporter.log("Verify Text" + verifyText.toString());
        return getTextFromElement(verifyText);
    }

}
