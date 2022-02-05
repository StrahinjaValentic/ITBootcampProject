package ElementsTab.Buttons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonsPage {
    private WebDriver wd;

    @FindBy(xpath = "//button[@id='doubleClickBtn']")
    WebElement doubleClickButton;
    @FindBy(xpath = "//button[@id='rightClickBtn']")
    WebElement rightClickMeButton;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/button[1]")
    WebElement clickMeButton;

    public ButtonsPage(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(this.wd, this);
    }

    public void doubleClick() {
        Actions action = new Actions(wd);
        action.doubleClick(doubleClickButton).perform();
    }

    public void rightClick() {
        Actions action = new Actions(wd);
        action.contextClick(rightClickMeButton).perform();
    }

    public void click() {
        clickMeButton.click();
    }
}
