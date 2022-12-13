package com.orangehrm.demo.opensource.testsuite;

import com.orangehrm.demo.opensource.pages.LoginPage;
import com.orangehrm.demo.opensource.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {

    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginPage = new LoginPage();
    }

    @Test(groups = {"sanity","regression"})
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Dashboard";
        Assert.assertEquals(loginPage.getTextMessage(), expectedMessage, "No Dashboard text found");

    }
}
