package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.ProductPage;

public class ValidateProductInfoInPDFSteps {
    private WebDriver driver;
    private ProductPage productPage;

    @Given("the user is on the product page")
    public void the_user_is_on_the_product_page() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/inventory.html");
        productPage = new ProductPage(driver);
    }

    @When("a PDF has been generated from the Products page")
    public void a_pdf_has_been_generated_from_the_products_page() {
        productPage.generatePDF();
    }

    @Then("the PDF should contain the expected product names and prices")
    public void the_pdf_should_contain_the_expected_product_names_and_prices() {
        // PDF validation logic here
        driver.quit();
    }
}