import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class SortProductsByPriceTests {

    @Test
    public void testSortProductsByPrice() {
        PageClasses page = new PageClasses();
        page.sortByPrice();
        assertTrue(page.verifyPricesInAscendingOrder());
    }
}