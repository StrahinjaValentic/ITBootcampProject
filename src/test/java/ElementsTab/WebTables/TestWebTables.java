package ElementsTab.WebTables;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.Driver;
import utils.DriverSetup;

import java.io.IOException;

public class TestWebTables extends DriverSetup {
    private Driver wd = new Driver();
    Faker faker;

    @Test
    public void testWebTables() {
        wd.getDriver().get("https://demoqa.com/webtables");

        WebTablesPage webtable = new WebTablesPage(wd.getDriver());
        webtable.deleteAllFromTable();
        Assert.assertTrue(webtable.noRows().isDisplayed());

        faker = new Faker();
        String fakeFirstName = faker.name().firstName();
        String fakeLastName = faker.name().lastName();
        String fakeEmail = faker.internet().emailAddress();
        int fakeAge = faker.number().numberBetween(18,65);
        int fakeSalary = faker.number().numberBetween(15000, 30000);

        webtable.clickAddToTable();
        webtable.inputInformation(fakeFirstName, fakeLastName,fakeEmail,String.valueOf(fakeAge), String.valueOf(fakeSalary), "IT");
        webtable.clickSubmit();
        Assert.assertTrue(webtable.tableBody().getText().contains(fakeFirstName));

    }
}
