package utils;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class DriverSetup {
    private Driver wd = new Driver();
    @BeforeClass
    public void init() throws IOException {
        wd.initDriver();
    }

    @AfterClass
    public void closeWebDriver() throws IOException {
        wd.getDriver().close();
        System.out.println("Web driver closed");
    }

    @AfterSuite
    public void endChromeDriverProcesses() throws IOException {
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }
}
