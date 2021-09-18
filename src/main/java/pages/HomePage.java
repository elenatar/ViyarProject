package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='title-search-input']")
    private WebElement inputSearch;

    @FindBy(xpath = "//span[@class='search-button']//input[@type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//li[@class='item7']")
    private WebElement servicesButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchByKeyword(final String keyword) {
        inputSearch.sendKeys(keyword);
        searchButton.click();
    }

    public void clickServicesButton() {
        servicesButton.click();
    }
}
