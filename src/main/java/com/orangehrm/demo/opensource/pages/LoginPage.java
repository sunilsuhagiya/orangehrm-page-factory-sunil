package com.orangehrm.demo.opensource.pages;

import com.aventstack.extentreports.Status;
import com.orangehrm.demo.opensource.customlisteners.CustomListeners;
import com.orangehrm.demo.opensource.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(name = "username")
    WebElement userNameField;
    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement textMessage;

    public void enterUserName(String userName) {
        Reporter.log("Enter user name" + userNameField.toString());
        sendTextToElement(userNameField, userName);
        CustomListeners.test.log(Status.PASS, "Enter user name " + userName);
    }

    public void enterPassword(String password) {
        Reporter.log("Enter Password" + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter user name " + password);
    }

    public void clickOnLoginButton() {
        Reporter.log("Click on login" + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click on login ");
    }

    public String getTextMessage() {
        Reporter.log("Get Text Message" + textMessage.toString());
        CustomListeners.test.log(Status.PASS, "Get Text Message");
        return getTextFromElement(textMessage);
    }
}
