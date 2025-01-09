package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.CheckoutPage;

public class CompletePurchaseSteps {
    private WebDriver driver;
    private CheckoutPage checkoutPage;

    @Given("the user is on the checkout page")
    public void the_user_is_on_the_checkout_page() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/checkout-step-one.html");
        checkoutPage = new CheckoutPage(driver);
    }

    @When("user asked to enters their first name, last name, and zip code")
    public void user_enters_their_first_name_last_name_and_zip_code() {
        checkoutPage.enterFirstName("John");
        checkoutPage.enterLastName("Doe");
        checkoutPage.enterZipCode("12345");
        checkoutPage.clickContinue();
    }

    @When("the user reviews and confirms the order details")
    public void the_user_reviews_and_confirms_the_order_details() {
        checkoutPage.clickFinish();
    }

    @Then("a successful order submission should show a confirmation page")
    public void a_successful_order_submission_should_show_a_confirmation_page() {
        // Add assertions to verify the confirmation page
        driver.quit();
    }
}
