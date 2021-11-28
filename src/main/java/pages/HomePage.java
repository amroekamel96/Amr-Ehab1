package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.PrimitiveIterator;

public class HomePage {

    private WebDriver driver;
    private By signIn = By.xpath("//div[@class='gb_Me']/a");
    private By Images = By.xpath("//div[@class='gb_g gb_h']/a[@data-pid='2']");
    private By Gmail = By.xpath("//div[@class='gb_g gb_h']/a[@data-pid='23']");
    private By GoogleSearch = By.name("btnK");
    private By FeelingLucky = By.name("btnI");
    private By Searchbox = By.name("q");
    public String searchText = "java";

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public WebElement SearchTextbox(){
        return driver.findElement(Searchbox);
    }

    public WebElement SignInButton(){
        return driver.findElement(signIn);
    }

    public WebElement ImagesButton(){
        return driver.findElement(Images);
    }

    public WebElement GmailButton(){
        return driver.findElement(Gmail);
    }

    public WebElement GoogleSearchButton(){
        return driver.findElement(GoogleSearch);
    }

    public WebElement FeelingLuckyButton(){
        return driver.findElement(FeelingLucky);
    }

    public List SearchSuggestionsList() throws InterruptedException {
        driver.findElement(Searchbox).sendKeys(searchText);
        Thread.sleep(5000);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='wM6W7d']"));
        return list;
    }
}
