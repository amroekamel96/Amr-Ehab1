package homepage;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class ButtonsTextTest extends BaseTests {

    @Test
    public void testSignInButton(){
        String signintext = homePage.SignInButton().getText();
        Assert.assertEquals(signintext, "Sign in");
    }

    @Test
    public void testImagesButton(){
        String Imagestext = homePage.ImagesButton().getText();
        Assert.assertEquals(Imagestext, "Images");
    }

    @Test
    public void testGmailButton(){
        String Gmailtext = homePage.GmailButton().getText();
        Assert.assertEquals(Gmailtext, "Gmail");
    }

    @Test
    public void testGoogleSearchButton(){
        String GoogleSearchText = homePage.GoogleSearchButton().getAttribute("value");
        Assert.assertEquals(GoogleSearchText, "Google Search");
    }

    @Test
    public void FeelingLuckyButton(){
        String FeelingLuckyText = homePage.FeelingLuckyButton().getAttribute("value");
        Assert.assertEquals(FeelingLuckyText, "I'm Feeling Lucky");
    }

}
