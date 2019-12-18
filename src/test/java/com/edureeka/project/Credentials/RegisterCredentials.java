package com.edureeka.project.Credentials;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.edureka.project.ObjectRepo.RegisterPage;
import com.edureka.project.genericLib.BaseClass;
import com.edureka.project.genericLib.WebDriverCommonLib;

public class RegisterCredentials extends BaseClass {
    Logger log = Logger.getLogger(RegisterCredentials.class);
    WebDriverCommonLib comm = new WebDriverCommonLib();

    @Test
    public void registerUser() {

        RegisterPage reg = PageFactory.initElements(driver, RegisterPage.class);
        // Logging Out
        reg.getSignOffLnk().click();
        // Step 1: Click on Register Link
        reg.getRegisterLink().click();
        // Register a new user (method from POM is called)
        reg.registerNewUser();

        String expText = "Thank you for registering. You may now sign-in using the user name and password you've just entered.";
        String actText = reg.getConfirmRegisteredUser().getText();
        Assert.assertEquals(expText, actText);
        String Note = reg.getNoteToUsetText().getText();
        log.info(Note);

    }
}
