package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        goHome();
        TranslatetoEnglish();
    }

    @BeforeMethod
    public void goHome() throws InterruptedException {
        driver.get("https://www.google.com/");
        homePage = new HomePage(driver);
        Thread.sleep(2000);
    }

    public void TranslatetoEnglish(){
        driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a")).click();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }



}
