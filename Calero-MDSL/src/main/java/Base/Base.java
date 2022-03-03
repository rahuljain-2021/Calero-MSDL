package Base;

import Pages.CartPage;
import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class Base {
    public static Properties prop;
    public static WebDriver driver;
    public static HomePage homePage;
    public static CartPage cartPage;

    public Base() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("./src/main/java/config/config.properties");
            prop.load(ip);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @BeforeEach
    public static void initialization() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);

    }

    @AfterEach
    public static void teardown() {
        driver.quit();
    }


}















