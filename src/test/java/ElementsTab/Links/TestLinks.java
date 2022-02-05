package ElementsTab.Links;

import org.testng.Assert;
import org.testng.annotations.*;
import utils.Driver;
import utils.DriverSetup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestLinks extends DriverSetup {
    private Driver wd = new Driver();

    @Test
    public void testHomeLink() {
        wd.getDriver().get("https://demoqa.com/links");

        LinksPage link = new LinksPage(wd.getDriver());
        link.clickHomeLink();
        List<String> browserTabs = new ArrayList<String>(wd.getDriver().getWindowHandles());
        wd.getDriver().switchTo().window(browserTabs.get(1));

        Assert.assertEquals(wd.getDriver().getCurrentUrl(), "https://demoqa.com/", "The current URL should be equal to https://demoqa.com/");

        wd.getDriver().close();
        wd.getDriver().switchTo().window(browserTabs.get(0));
    }

    @Test(priority = 1)
    public void testHomePaBwRLink() {
        wd.getDriver().get("https://demoqa.com/links");

        LinksPage link = new LinksPage(wd.getDriver());
        link.clickHomePaBwRLing();
        List<String> browserTabs = new ArrayList<String>(wd.getDriver().getWindowHandles());
        wd.getDriver().switchTo().window(browserTabs.get(1));

        Assert.assertEquals(wd.getDriver().getCurrentUrl(), "https://demoqa.com/", "The current URL should be equal to https://demoqa.com/");

        wd.getDriver().close();
        wd.getDriver().switchTo().window(browserTabs.get(0));
    }

    @Test(priority = 2)
    public void testCreatedLink() {
        wd.getDriver().get("https://demoqa.com/links");

        LinksPage link = new LinksPage(wd.getDriver());
        link.clickCreatedLink();

        Assert.assertTrue(link.responseMessage().getText().contains("Link has responded with staus 201 and status text Created"));
    }

    @Test(priority = 2)
    public void testNoContentLink() {
        wd.getDriver().get("https://demoqa.com/links");

        LinksPage link = new LinksPage(wd.getDriver());
        link.clickNoContentLink();

        Assert.assertTrue(link.responseMessage().getText().contains("Link has responded with staus 204 and status text No Content"));
    }

    @Test(priority = 2)
    public void testMovedLink() {
        wd.getDriver().get("https://demoqa.com/links");

        LinksPage link = new LinksPage(wd.getDriver());
        link.clickMovedLink();

        Assert.assertTrue(link.responseMessage().getText().contains("Link has responded with staus 301 and status text Moved Permanently"));
    }

    @Test(priority = 2)
    public void testBadRequest() {
        wd.getDriver().get("https://demoqa.com/links");

        LinksPage link = new LinksPage(wd.getDriver());
        link.clickBadRequest();

        Assert.assertTrue(link.responseMessage().getText().contains("Link has responded with staus 400 and status text Bad Request"));
    }

    @Test(priority = 2)
    public void testUnauthorizedLink() {
        wd.getDriver().get("https://demoqa.com/links");

        LinksPage link = new LinksPage(wd.getDriver());
        link.clickUnauthorizedLink();

        Assert.assertTrue(link.responseMessage().getText().contains("Link has responded with staus 401 and status text Unauthorized"));
    }

    @Test(priority = 2)
    public void testForbiddenLink() {
        wd.getDriver().get("https://demoqa.com/links");

        LinksPage link = new LinksPage(wd.getDriver());
        link.clickForbiddenLink();

        Assert.assertTrue(link.responseMessage().getText().contains("Link has responded with staus 403 and status text Forbidden"));
    }

    @Test(priority = 2)
    public void testNotFoundLink() {
        wd.getDriver().get("https://demoqa.com/links");

        LinksPage link = new LinksPage(wd.getDriver());
        link.clickNotFoundLink();

        Assert.assertTrue(link.responseMessage().getText().contains("Link has responded with staus 404 and status text Not Found"));
    }
}
