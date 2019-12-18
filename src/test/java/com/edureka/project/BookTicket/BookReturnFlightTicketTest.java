package com.edureka.project.BookTicket;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.edureka.project.ObjectRepo.BookAFlight;
import com.edureka.project.ObjectRepo.FindAFlightPage;
import com.edureka.project.ObjectRepo.FlightConfirmationPage;
import com.edureka.project.ObjectRepo.SelectAFlight;
import com.edureka.project.genericLib.BaseClass;

@Listeners(com.edureka.project.genericLib.ListenerImpClass.class)
public class BookReturnFlightTicketTest extends BaseClass {
    Logger log = Logger.getLogger(BookReturnFlightTicketTest.class);

    @Test
    public void BookReturnTicketTest() {

        FindAFlightPage find = PageFactory.initElements(BaseClass.driver, FindAFlightPage.class);
        SelectAFlight select = PageFactory.initElements(BaseClass.driver, SelectAFlight.class);
        BookAFlight book = PageFactory.initElements(BaseClass.driver, BookAFlight.class);
        FlightConfirmationPage confirm = PageFactory.initElements(driver, FlightConfirmationPage.class);
        log.info("Step 1 - Assert if opened pageTitle is correct");

        // Assert if opened page is correct
        String actfindtitle = BaseClass.driver.getTitle();
        String expfindTitle = "Find a Flight: Mercury Tours:";
        Assert.assertEquals(actfindtitle, expfindTitle);
        if (actfindtitle.equals(expfindTitle)) {
            log.info(actfindtitle + " page is dispayed");
        } else {
            log.error("Page is not opened - Check errors in report");
        }

        log.info("Check of the RoundTrip Radio button is selected");
        // Check of the RoundTrip Radio button is selected
        Boolean actual = find.getRoundTripRdio().isSelected();
        Assert.assertTrue(actual);
        // Add Flight details
        find.addFlightDetails();

        // Add Preferences
        find.addPreferences();
     // Click on Continue in Find a Flight page
        find.clickFindFlightContinue();
        log.info("Clicking on Continue in Select a Flight page");
        
        String actSelectTitle = BaseClass.driver.getTitle();
        String expSelectTitle = "Select a Flight: Mercury Tours";
        Assert.assertEquals(actSelectTitle, expSelectTitle);
        select.clickSelectFlightContinue();
        log.info("Asserting Book a Flight Title");
        // Assert Book a Flight Title
        String actBookTitle = BaseClass.driver.getTitle();
        String expBookTitle = "Book a Flight: Mercury Tours";
        Assert.assertEquals(actBookTitle, expBookTitle);
        log.info(actBookTitle + "is matching");
        book.addBookAFlightdata();
        log.info("Confirm if ticket is booked");
        // Confirm if ticket is booked
        String actConfirmText = confirm.getConfirmBookingtxt().getText();
        String expConfirmText = "Your itinerary has been booked!";
        Assert.assertEquals(actConfirmText, expConfirmText);
        log.info(actConfirmText);
        

    }
}
