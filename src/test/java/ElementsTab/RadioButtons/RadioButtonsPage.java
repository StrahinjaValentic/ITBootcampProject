package ElementsTab.RadioButtons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonsPage {
    private WebDriver wd;

    @FindBy(xpath = "//label[contains(text(),'Yes')]")
    WebElement buttonYes;
    @FindBy(xpath = "//label[contains(text(),'Impressive')]")
    WebElement buttonImpressive;
    @FindBy(xpath = "//label[contains(text(),'No')]")
    WebElement buttonNo;

    public RadioButtonsPage(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(this.wd, this);
    }

    public void clickButtonYes() {
        buttonYes.click();
    }

    public void clickButtonImpressive() {
        buttonImpressive.click();
    }

    public void clickButtonNo() {
        buttonNo.click();
    }
}
