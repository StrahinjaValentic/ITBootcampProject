package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

import java.io.IOException;
import java.time.Duration;

public class Driver {
    public  static WebDriver wd;

    public  void initDriver() throws IOException {

        System.setProperty("webdriver.chrome.driver",
                PropReader.fetchProperty("WEBDRIVER.CHROME.PATH"));
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wd.manage().window().maximize();
    }

    public Driver(WebDriver driver) {
        Driver.wd =driver;
    }
    public Driver() {
    }
    public WebDriver getDriver() {
        return wd;
    }
}
