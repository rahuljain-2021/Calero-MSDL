package Pages;

import Base.Base;
import Utils.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Objects;

public class CartPage extends Base {
    WebDriverWait wait = new WebDriverWait(driver, TestUtil.EXPLICIT_WAIT);

    @FindBy(id = "cartur")
    public WebElement cartBtn;

    @FindBy(xpath = "//button[contains(.,'Place Order')]")
    public WebElement placeOrderBtn;

    @FindBy(xpath = "//input[@id='name']")
    public WebElement customerName;

    @FindBy(xpath = "//input[@id='country']")
    public WebElement customerCountry;

    @FindBy(xpath = "//input[@id='city']")
    public WebElement customerCity;

    @FindBy(xpath = "//input[@id='card']")
    public WebElement customerCard;

    @FindBy(xpath = "//input[@id='month']")
    public WebElement cardMonth;

    @FindBy(xpath = "//input[@id='year']")
    public WebElement cardYear;

    @FindBy(xpath = "//button[.='Purchase']")
    public WebElement purchaseBtn;


    String winHandleBefore = driver.getWindowHandle();
    String msgExpected = "Thank you for your purchase!";
    String cartItem1 = "Sony vaio i7";
    String cartItem2 = "ASUS Full Hd";

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickOnCartBtn() {
        wait.until(ExpectedConditions.visibilityOf(cartBtn));
        cartBtn.click();
    }

    public void clickOnPlaceOrderBtn() {
        // Store the current window handle
        wait.until(ExpectedConditions.visibilityOf(placeOrderBtn));
        placeOrderBtn.click();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }

    }

    public void setCustomerName() {
        wait.until(ExpectedConditions.visibilityOf(customerName));
        customerName.sendKeys(prop.getProperty("Name"));
    }

    public void setCustomerCountry() {
        wait.until(ExpectedConditions.visibilityOf(customerCountry));
        customerCountry.sendKeys(prop.getProperty("Country"));
    }

    public void setCustomerCity() {
        wait.until(ExpectedConditions.visibilityOf(customerCity));
        customerCity.sendKeys(prop.getProperty("City"));
    }

    public void inputCustomerCard() {
        wait.until(ExpectedConditions.visibilityOf(customerCard));
        customerCard.sendKeys(prop.getProperty("card"));
    }

    public void inputCardMonth() {
        wait.until(ExpectedConditions.visibilityOf(cardMonth));
        cardMonth.sendKeys(prop.getProperty("Month"));
    }

    public void inputCardYear() {
        wait.until(ExpectedConditions.visibilityOf(cardYear));
        cardYear.sendKeys(prop.getProperty("Year"));
    }

    public void clickOnPurchaseBtn() {
        wait.until(ExpectedConditions.visibilityOf(purchaseBtn));
        purchaseBtn.click();
    }

    public boolean isPurchaseConfirmed() {
        String confirmMsg = driver.findElement(By.xpath("//h2[normalize-space()='Thank you for your purchase!']")).getText();

        if (Objects.equals(confirmMsg, msgExpected)) {
            System.out.println(" Purchase Confirmed");
            driver.switchTo().window(winHandleBefore);
            return true;
        } else {
            System.out.println(" Purchase not confirmed");
            return false;
        }
    }

    public boolean verifyCartItems() {
        String item1 = driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2)")).getText();
        String item2 = driver.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(2)")).getText();

        if (Objects.equals(item1, cartItem1)) {
            return true;
        } else if (Objects.equals(item1, cartItem2)) {
            return true;
        } else if (Objects.equals(item2, cartItem1)) {
            return true;
        } else if (Objects.equals(item2, cartItem2)) {
            return true;
        } else {
            return false;
        }


    }


}
