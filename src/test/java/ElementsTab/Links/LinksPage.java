package ElementsTab.Links;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinksPage {
    private WebDriver wd;

    @FindBy(xpath = "//a[@id='simpleLink']")
    WebElement homeLink;
    @FindBy(xpath = "//a[@id='dynamicLink']")
    WebElement homePaBwRLing;
    @FindBy(xpath = "//a[@id='created']")
    WebElement createdLink;
    @FindBy(xpath = "//a[@id='no-content']")
    WebElement noContentLink;
    @FindBy(xpath = "//a[@id='moved']")
    WebElement movedLink;
    @FindBy(xpath = "//a[@id='bad-request']")
    WebElement badRequest;
    @FindBy(xpath = "//a[@id='unauthorized']")
    WebElement unauthorizedLink;
    @FindBy(xpath = "//a[@id='forbidden']")
    WebElement forbiddenLink;
    @FindBy(xpath = "//a[@id='invalid-url']")
    WebElement notFoundLink;
    @FindBy(xpath = "//p[@id='linkResponse']")
    WebElement response;


    public LinksPage(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(this.wd, this);
    }

    public void clickHomeLink() {
        homeLink.click();
    }

    public void clickHomePaBwRLing() {
        homePaBwRLing.click();
    }

    public void clickCreatedLink() {
        createdLink.click();
    }

    public void clickNoContentLink() {
        noContentLink.click();
    }

    public void clickMovedLink() {
        movedLink.click();
    }

    public void clickBadRequest() {
        badRequest.click();
    }

    public void clickUnauthorizedLink() {
        unauthorizedLink.click();
    }

    public void clickForbiddenLink() {
        forbiddenLink.click();
    }

    public void clickNotFoundLink() {
        notFoundLink.click();
    }

    public WebElement responseMessage() {
        return response;
    }

}
