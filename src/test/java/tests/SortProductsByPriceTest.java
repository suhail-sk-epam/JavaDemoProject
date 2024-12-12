import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.stream.Collectors;

public class SortProductsByPriceTest {
    private WebDriver driver = new ChromeDriver();

    @Test
    public void testSortProductsByPrice() {
        driver.get("https://www.saucedemo.com/v1/inventory.html");
        SortingDropdownPage sortingPage = new SortingDropdownPage(driver);
        sortingPage.selectSortingOption("Price");

        ProductPricePage productPricePage = new ProductPricePage(driver);
        List<Double> prices = driver.findElements(productPricePage.productPrice).stream()
            .map(e -> Double.parseDouble(e.getText().replace("$", "")))
            .collect(Collectors.toList());

        List<Double> sortedPrices = new ArrayList<>(prices);
        Collections.sort(sortedPrices);
        assertEquals(sortedPrices, prices);

        driver.quit();
    }
}