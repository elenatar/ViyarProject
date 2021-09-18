package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ServicePage extends BasePage {

    @FindBy(xpath = "//li[@class='item7']//div[@class='menu-box-col-title']")
    private List<WebElement> servicesList;

    @FindBy(xpath = "//div[@class='menu-box-col-title']/a[@href='/catalog/porezka/']")
    private WebElement serviceCuttingButton;

    @FindBy(xpath = "//li[@class='item7']//div[@class='menu-box-col-title']")
    private List<WebElement> cuttingServiceElementsList;

    public ServicePage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getServicesList() {
        return servicesList;
    }

    public void clickServiceCuttingButton() {
        serviceCuttingButton.click();
    }

    public List<WebElement> getCuttingServiceElementsList() {
        return cuttingServiceElementsList;
    }
}
