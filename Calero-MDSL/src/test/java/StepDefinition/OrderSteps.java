package StepDefinition;

import Base.Base;
import Utils.TestUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderSteps extends Base {
    @Given("I am on homepage")
    public void i_am_on_homepage() {
        initialization();
    }

    @When("I click on laptop button")
    public void i_click_on_laptop_button() {
        homePage.validateLogo();
        homePage.clickOnLaptopBtn();
    }

    @When("I select and add a laptop to cart")
    public void i_select_and_add_a_laptop_to_cart() {
        homePage.clickOnSonyVaio();
        homePage.setAddToCartBtn();
        TestUtil.waitForSeconds(2);
        driver.switchTo().alert().accept();
        homePage.homeBtn();

    }

    @When("I click on Monitors button")
    public void i_click_on_monitors_button() {
        homePage.clickOnMonitorBtn();
    }

    @When("I select and add a monitor to cart")
    public void i_select_and_add_a_monitor_to_cart() {
        homePage.clickOnAsus();
        homePage.setAddToCartBtn();
        TestUtil.waitForSeconds(2);
        driver.switchTo().alert().accept();
    }

    @When("I go to cart and verify the order")
    public void i_go_to_cart_and_verify_the_order() {
        cartPage.clickOnCartBtn();
        TestUtil.waitForSeconds(3);
        cartPage.verifyCartItems();
    }

    @When("I press the place order button")
    public void i_press_the_place_order_button() {
        cartPage.clickOnPlaceOrderBtn();
    }

    @When("I fill the place order form")
    public void i_fill_the_place_order_form() {
        cartPage.setCustomerName();
        cartPage.setCustomerCountry();
        cartPage.setCustomerCity();
        cartPage.inputCustomerCard();
        cartPage.inputCardMonth();
        cartPage.inputCardYear();
    }

    @When("I press Purchase button")
    public void i_press_purchase_button() {
        cartPage.clickOnPurchaseBtn();
    }

    @Then("Order is place successfully")
    public void order_is_place_successfully() {
        cartPage.isPurchaseConfirmed();
        teardown();

    }
}
