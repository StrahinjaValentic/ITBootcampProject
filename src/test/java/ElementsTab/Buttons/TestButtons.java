package ElementsTab.Buttons;

import org.testng.Assert;
import org.testng.annotations.*;
import utils.Driver;
import utils.DriverSetup;

import java.io.IOException;

public class TestButtons extends DriverSetup {
    private Driver wd = new Driver();

    @Test
    public void testDoubleClick() {
        wd.getDriver().get("https://demoqa.com/buttons");

        ButtonsPage buttons = new ButtonsPage(wd.getDriver());
        buttons.doubleClick();

        Assert.assertTrue(wd.getDriver().getPageSource().contains("You have done a double click"));
    }

    @Test
    public void testRightClick() {
        wd.getDriver().get("https://demoqa.com/buttons");

        ButtonsPage buttons = new ButtonsPage(wd.getDriver());
        buttons.rightClick();

        Assert.assertTrue(wd.getDriver().getPageSource().contains("You have done a right click"));
    }

    @Test
    public void testClick() {
        wd.getDriver().get("https://demoqa.com/buttons");

        ButtonsPage buttons = new ButtonsPage(wd.getDriver());
        buttons.click();

        Assert.assertTrue(wd.getDriver().getPageSource().contains("You have done a dynamic click"));
    }
}
