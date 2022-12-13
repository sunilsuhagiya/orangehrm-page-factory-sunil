package com.orangehrm.demo.opensource.testsuite;

import com.orangehrm.demo.opensource.pages.ForgotPasswordPage;
import com.orangehrm.demo.opensource.pages.LoginPage;
import com.orangehrm.demo.opensource.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {

    ForgotPasswordPage forgotPasswordPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        forgotPasswordPage = new ForgotPasswordPage();

    }
    @Test(groups = {"sanity","regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        forgotPasswordPage.clickOnForgotPasswordLink();
        String expectedMessage = "Reset Password";
        Assert.assertEquals(forgotPasswordPage.textVerify(), expectedMessage, "No Reset Password text found");
    }
}
