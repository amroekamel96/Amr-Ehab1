package homepage;

import base.BaseTests;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsVisibilityTest extends BaseTests {

    @Test
    public void isSignInVisible(){
        Assert.assertTrue(homePage.SignInButton().isDisplayed());
    }

    @Test
    public void isImagesVisible(){
        Assert.assertTrue(homePage.ImagesButton().isDisplayed());
    }

    @Test
    public void isGmailVisible(){
        Assert.assertTrue(homePage.GmailButton().isDisplayed());
    }

    /*@Test
    public void isGoogleSearchVisible(){
        Assert.assertTrue(homePage.GoogleSearchButton().isDisplayed());
    }

    @Test
    public void isFeelingLuckyVisible(){
        Assert.assertTrue(homePage.FeelingLuckyButton().isDisplayed());
    }*/
}
