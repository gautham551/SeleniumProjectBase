package com.edureka.project.genericLib;


import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.edureka.project.ObjectRepo.WelcomeMecuryToursLoginPage;

/**
 * Author: Gautham Raju
 *
 */
public class BaseClass {
        
    public static WebDriver driver;
    public static ExtentTest test;
    public static ExtentReports extent;
    public static ExtentTest logger;
    public static Logger APP_LOGS = Logger.getLogger(BaseClass.class);
    FileLib flib = new FileLib();
    public static WebDriverCommonLib comm = new WebDriverCommonLib();
    Logger log = Logger.getLogger(BaseClass.class);
    
    @BeforeClass
    public void launchSelectBrowser() throws Throwable {
        String Browser = flib.getCommonData("browser");
        if (Browser.equals("firefox")) {
            driver = new FirefoxDriver();
        } else {
            driver = new ChromeDriver();
        }

    }

    @BeforeMethod
    public void loginTo() throws Throwable {
        log.info("*****************Test Case Started***********************");
        WelcomeMecuryToursLoginPage log = PageFactory.initElements(driver, WelcomeMecuryToursLoginPage.class);
        FileLib flib = new FileLib();
        String URL = flib.getCommonData("url");
        String USER = flib.getCommonData("user");
        String PASSWORD = flib.getCommonData("password");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(URL);
             
        log.getUsernameEdit().sendKeys(USER);
        log.getPasswordEdit().sendKeys(PASSWORD);
        log.getLoginClk().click();
        

    }

    @AfterMethod

    public void logout(){
    }

    @AfterClass
    public void closeBrowser() {
        driver.close();
        log.info("*****************Test Case Executed***********************");
    }
    
    


   

}
