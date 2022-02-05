package ElementsTab.BrokenLinksAndImages;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.Driver;
import utils.DriverSetup;

import java.io.IOException;

public class TestBrokenLinksAndImages extends DriverSetup {
    private Driver wd = new Driver();

    @Test
    public void testValidImage() {
        wd.getDriver().get("https://demoqa.com/broken");

        BrokenLinksAndImagesPage brokenOrNot = new BrokenLinksAndImagesPage(wd.getDriver());

        Assert.assertEquals(brokenOrNot.isImgPresent(brokenOrNot.validImageElement()), true, "The image is loaded");


    }

    @Test
    public void testInvalidImage() {
        wd.getDriver().get("https://demoqa.com/broken");

        BrokenLinksAndImagesPage brokenOrNot = new BrokenLinksAndImagesPage(wd.getDriver());

        Assert.assertEquals(brokenOrNot.isImgPresent(brokenOrNot.invalidImageElement()), false, "The image is not loaded");
    }

    @Test
    public void testValidLink() {
        wd.getDriver().get("https://demoqa.com/broken");

        BrokenLinksAndImagesPage brokenOrNot = new BrokenLinksAndImagesPage(wd.getDriver());
        brokenOrNot.clickValidLink();

        Assert.assertEquals(wd.getDriver().getCurrentUrl(), "https://demoqa.com/", "The current URL should be equal to https://demoqa.com/");
    }

    @Test
    public void testInvalidLink() {
        wd.getDriver().get("https://demoqa.com/broken");

        BrokenLinksAndImagesPage brokenOrNot = new BrokenLinksAndImagesPage(wd.getDriver());
        brokenOrNot.clickInvalidLink();

        Assert.assertTrue(wd.getDriver().findElement(By.xpath("//div[@id='content']")).getText().contains("This page returned a 500 status code."));
    }
}
