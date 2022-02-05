package ElementsTab.TextBox;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.DriverSetup;
import utils.Driver;

public class TestTextBox extends DriverSetup {
    private Driver wd = new Driver();
    Faker faker;

    @DataProvider(name = "textBox")
    public Object[][] textBox() {
        faker = new Faker();

        return new Object[][] {
                {faker.name().firstName()+ " " +faker.name().lastName(), faker.internet().emailAddress(), faker.address().fullAddress(), faker.address().fullAddress()},
                {faker.name().firstName()+ " " +faker.name().lastName(), faker.internet().emailAddress(),faker.address().fullAddress(), faker.address().fullAddress()},
                {faker.name().firstName()+ " " +faker.name().lastName(), faker.internet().emailAddress(),faker.address().fullAddress(), faker.address().fullAddress()},
                {faker.name().firstName()+ " " +faker.name().lastName(), faker.internet().emailAddress(),faker.address().fullAddress(), faker.address().fullAddress()}
        };
    }

    @Test(dataProvider = "textBox")
    public void testTextBox(String name, String email, String currAddress, String permAddress) {
        wd.getDriver().get("https://demoqa.com/text-box");

        TextBoxPage textForm = new TextBoxPage(wd.getDriver());
        textForm.inputFullName(name);
        textForm.inputEmail(email);
        textForm.inputCurrentAddress(currAddress);
        textForm.inputPermAddress(permAddress);
        textForm.clickSubmit();

        Assert.assertTrue(textForm.result().isDisplayed());
    }
}
