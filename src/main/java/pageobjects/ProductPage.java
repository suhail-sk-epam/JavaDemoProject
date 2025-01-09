package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    private By pdfButtonLocator = By.xpath("//button[contains(text(), 'Generate PDF')]");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToProductPage(String url) {
        driver.get(url);
    }

    public void generatePDF() {
        driver.findElement(pdfButtonLocator).click();
    }
}