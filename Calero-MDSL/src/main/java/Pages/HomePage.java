package Pages;

import Base.Base;
import Utils.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends Base {
    WebDriverWait wait = new WebDriverWait(driver, TestUtil.EXPLICIT_WAIT);

    @FindBy(xpath = "//a[.='Laptops']")
    public WebElement laptopBtn;

    @FindBy(xpath = "//a[.='Monitors']")
    public WebElement monitorsBtn;

    @FindBy(xpath = "//a[@id='nava']")
    public WebElement logo;

    @FindBy(xpath = "//a[normalize-space()='Sony vaio i7']")
    public WebElement sonyVaio;

    @FindBy(xpath = "//a[contains(text(),'ASUS Full HD')]")
    public WebElement asusFullHd;

    @FindBy(xpath = "//a[@class='btn btn-success btn-lg']")
    public WebElement addToCartBtn;

    @FindBy(xpath = "//a[contains(.,'Home')]")
    public WebElement homeBtn;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnLaptopBtn() {
        wait.until(ExpectedConditions.visibilityOf(laptopBtn));
        laptopBtn.click();
    }

    public void clickOnMonitorBtn() {
        wait.until(ExpectedConditions.visibilityOf(monitorsBtn));
        monitorsBtn.click();
    }

    public boolean validateLogo() {
        return logo.isDisplayed();
    }

    public void clickOnSonyVaio() {
        wait.until(ExpectedConditions.visibilityOf(sonyVaio));
        sonyVaio.click();
    }

    public void clickOnAsus() {
        wait.until(ExpectedConditions.visibilityOf(asusFullHd));
        asusFullHd.click();
    }

    public void setAddToCartBtn() {
        wait.until(ExpectedConditions.visibilityOf(addToCartBtn));
        addToCartBtn.click();
    }

    public void homeBtn() {
        wait.until(ExpectedConditions.visibilityOf(homeBtn));
        homeBtn.click();
    }
}
