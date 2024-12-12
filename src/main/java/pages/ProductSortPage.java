public class ProductSortPage {
    private WebDriver driver;
    private By sortDropdown = By.cssSelector("select.sort-products");

    public ProductSortPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectSortByPriceAscending() {
        WebElement dropdown = driver.findElement(sortDropdown);
        Select select = new Select(dropdown);
        select.selectByVisibleText("Price (low to high)");
    }
}