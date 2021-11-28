package homepage;

import base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchSuggestionsTest extends BaseTests {

    @Test
    public void SuggestionsCount() throws InterruptedException {
        List list = homePage.SearchSuggestionsList();
        Assert.assertEquals(list.size(), 10);
    }

    @Test
    public void suggestionValidation() throws InterruptedException {
        List<WebElement> list = homePage.SearchSuggestionsList();
        for (int i = 0; i < list.size(); i++) {
            String listItem = list.get(i).getText();
            if (listItem.contains(homePage.searchText)) {
                Assert.assertTrue(true);
            } else {
                System.out.println(list.get(i).getText());
                System.out.println(homePage.searchText);
                Assert.assertTrue(false);
            }
        }
    }
}
