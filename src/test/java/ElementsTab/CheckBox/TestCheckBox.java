package ElementsTab.CheckBox;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.Driver;
import utils.DriverSetup;

import java.io.IOException;

public class TestCheckBox extends DriverSetup {
    private Driver wd = new Driver();

    @Test
    public void testCheckBox() {
        wd.getDriver().get("https://demoqa.com/checkbox");

        CheckBoxPage checkBox = new CheckBoxPage(wd.getDriver());

        checkBox.clickArrows();
        checkBox.clickCheckBox();

        Assert.assertTrue(wd.getDriver().findElement(By.id("result")).getText().contains("home\n" +
                "desktop\n" +
                "notes\n" +
                "commands\n" +
                "documents\n" +
                "workspace\n" +
                "react\n" +
                "angular\n" +
                "veu\n" +
                "office\n" +
                "public\n" +
                "private\n" +
                "classified\n" +
                "general\n" +
                "downloads\n" +
                "wordFile\n" +
                "excelFile"),
                "The results should contain all the text");
    }
}
