package ElementsTab.TextBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TextBoxPage {
    private WebDriver wd;

    @FindBy(xpath = "//input[@id='userName']")
    WebElement name;
    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement email;
    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement currentAddress;
    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    WebElement permAddress;
    @FindBy(xpath = "//button[@id='submit']")
    WebElement submit;

    public TextBoxPage(WebDriver wd) {
        this.wd = wd;
        PageFactory.initElements(this.wd, this);
    }

    public void inputFullName(String name) {
        this.name.sendKeys(name);
    }

    public void inputEmail(String email) {
        this.email.sendKeys(email);
    }

    public void inputCurrentAddress(String currentAddress) {
        this.currentAddress.sendKeys(currentAddress);
    }

    public void inputPermAddress(String permAddress) {
        this.permAddress.sendKeys(permAddress);
    }

    public void clickSubmit() {
        submit.click();
    }

//    public List<WebElement> result() {
//        return this.wd.findElements(By.className("border col-md-12 col-sm-12"));
//    }

    public WebElement result() {
        return this.wd.findElement(By.xpath("//div[@id='output']"));
    }
}
