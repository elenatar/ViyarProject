package smokeTests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class ServicesTests extends BaseTest{

    private static final long TIME_TO_WAIT = 30;
    private static final int AMOUNT_OF_ELEMENTS = 12;

    @Test(priority = 1)
    public void checkElementsAmountOnServicesPage() {
        getHomePage().clickServicesButton();
        List<WebElement> elements = getServicePage().getServicesList();
        assertEquals(elements.size(), AMOUNT_OF_ELEMENTS);
    }

    @Test(priority = 2)
    public void checkElementsAmountOnOCuttingServicesPage() {
        getHomePage().clickServicesButton();
        getServicePage().clickServiceCuttingButton();
        List<WebElement> elements = getServicePage().getCuttingServiceElementsList();
        assertEquals(elements.size(), AMOUNT_OF_ELEMENTS);
    }

}
