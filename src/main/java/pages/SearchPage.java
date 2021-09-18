package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(xpath = "//main[@id='site_panel']/section/h2")
    private WebElement searchPageTitle;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public String getSearchPageTitle() {
        return searchPageTitle.getText();
    }
}
