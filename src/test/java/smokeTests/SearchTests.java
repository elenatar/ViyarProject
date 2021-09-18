package smokeTests;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class SearchTests extends BaseTest {
    private static final long TIME_TO_WAIT = 30;
    private static final String SEARCH_KEYWORD = "EGGER";

    @Test(priority = 1)
    public void checkThatSearchPageTitleContainsSearchWord() {
        getHomePage().searchByKeyword(SEARCH_KEYWORD);
        getHomePage().implicitWait(TIME_TO_WAIT);
        assertTrue(getSearchPage().getSearchPageTitle().contains(SEARCH_KEYWORD));
    }
}
