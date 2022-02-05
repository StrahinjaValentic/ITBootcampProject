package ElementsTab.RadioButtons;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.Driver;
import utils.DriverSetup;

import java.io.IOException;

public class TestRadioButtons extends DriverSetup {
    private Driver wd = new Driver();

    @Test
    public void testRadioButtons() {
        wd.getDriver().get("https://demoqa.com/radio-button");

        RadioButtonsPage radioButton = new RadioButtonsPage(wd.getDriver());

        radioButton.clickButtonYes();
        Assert.assertTrue(wd.getDriver().findElement(By.className("text-success")).getText().contains("Yes"), "The element should contain text Yes");

        radioButton.clickButtonImpressive();
        Assert.assertTrue(wd.getDriver().findElement(By.className("text-success")).getText().contains("Impressive"), "The element should contain text Impressive");

        radioButton.clickButtonNo();
        Assert.assertFalse(wd.getDriver().findElement(By.xpath("//input[@id='noRadio']")).isEnabled(), "The element should not be clickable");


    }
}
