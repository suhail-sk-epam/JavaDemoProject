import org.junit.Test;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ProductSortPage;

public class ProductSortTest {

    private WebDriver driver = new ChromeDriver();
    private ProductSortPage sortPage = new ProductSortPage(driver);

    @Test
    public void testSortProductsByPrice() {
        driver.get("https://www.saucedemo.com/v1/inventory.html");
        sortPage.select_sort_by_price();
        assertTrue("Products are not sorted by price", sortPage.verify_products_sorted_by_price());
    }

}