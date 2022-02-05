package ElementsTab.BrokenLinksAndImages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrokenLinksAndImagesPage {
    private WebDriver wd;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/img[1]")
    WebElement validImage;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/img[2]")
    WebElement brokenImage;
    @FindBy(xpath = "//a[contains(text(),'Click Here for Valid Link')]")
    WebElement validLink;
    @FindBy(xpath = "//a[contains(text(),'Click Here for Broken Link')]")
    WebElement brokenLink;

    public BrokenLinksAndImagesPage(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(this.wd, this);
    }

    public WebElement validImageElement() {
        return validImage;
    }

    public WebElement invalidImageElement() {
        return brokenImage;
    }

    public boolean isImgPresent(WebElement img) {
        Object result = ((JavascriptExecutor) wd).executeScript(
                "return arguments[0].complete && "+
                        "typeof arguments[0].naturalWidth != \"undefined\" && "+
                        "arguments[0].naturalWidth > 0", img);

        boolean loaded = false;
        if (result instanceof Boolean) {
            loaded = (Boolean) result;
            System.out.println(loaded);
            return loaded;
        } return loaded;
    }

    public void clickValidLink() {
        validLink.click();
    }

    public void clickInvalidLink() {
        brokenLink.click();
    }
}
