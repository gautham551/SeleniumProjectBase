package com.edureka.project.ObjectRepo;

import java.awt.print.Book;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.edureka.project.genericLib.BaseClass;

public class BookAFlight extends BaseClass {

    Logger log = Logger.getLogger(BookAFlight.class);
            
    @FindBy(name = "passFirst0")
    @CacheLookup
    private WebElement FirstNameEdit;

    @FindBy(name = "passLast0")
    @CacheLookup
    private WebElement LastNameEdit;

    @FindBy(name = "pass.0.meal")
    @CacheLookup
    private WebElement SelectMeal;

    @FindBy(name = "creditnumber")
    @CacheLookup
    private WebElement creditnumberEdit;

    @FindBy(name = "buyFlights")
    @CacheLookup
    private WebElement SecurePurchseBtn;

   

    public WebElement getFirstNameEdit() {
        return FirstNameEdit;
    }

    public WebElement getLastNameEdit() {
        return LastNameEdit;
    }

    public WebElement getSelectMeal() {
        return SelectMeal;
    }

    public WebElement getCreditnumberEdit() {
        return creditnumberEdit;
    }

    public WebElement getSecurePurchseBtn() {
        return SecurePurchseBtn;
    }

public void addBookAFlightdata(){
    BookAFlight book = PageFactory.initElements(BaseClass.driver, BookAFlight.class);
    log.info("Enter First Name");
    // Enter First Name
    book.getFirstNameEdit().sendKeys("Gautham");
    log.info("Enter Last Name");
    // Enter Last Name
    book.getLastNameEdit().sendKeys("Raju");
    log.info("Enter Card Number");
    // Enter Card Number
    book.getCreditnumberEdit().sendKeys("52112675218567");
    log.info("Click on Secure Purchase");
    // Click on Secure Purchase
    book.getSecurePurchseBtn().click();
}
}
