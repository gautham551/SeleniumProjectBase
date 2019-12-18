package assignments;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
 
public class FirefoxDownload {
 
    public static void main(String[] args) throws IOException {
 
        // Setting Firefox driver path
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
 
        // Creating firefox profile
        FirefoxProfile profile = new FirefoxProfile();
 
        // Instructing firefox to use custom download location
        profile.setPreference("browser.download.folderList", 2);
 
        // Setting custom download directory
        profile.setPreference("browser.download.dir", "‪C:\\Music Assignment");
 
        // Skipping Save As dialog box for types of files with their MIME
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
                "text/csv,application/java-archive, application/x-msexcel,application/excel,application/vnd.openxmlformats-officedocument.wordprocessingml.document,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml,application/vnd.microsoft.portable-executable");
 
        // Creating FirefoxOptions to set profile
        FirefoxOptions option = new FirefoxOptions();
        option.setProfile(profile);
        // Launching browser with desired capabilities
        FirefoxDriver driver = new FirefoxDriver(option);
 
        // URL loading
        driver.get("https://www.seleniumhq.org/download/");
 
        // Click on download selenium server jar file
        driver.findElement(By.xpath("//p[text()='Download version ']/a")).click();
 
    }
}