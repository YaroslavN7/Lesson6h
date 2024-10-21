import io.qameta.allure.testng.AllureTestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.Dogfeet;
import pages.MainPage;
import pages.ShopCategory;

import java.time.Duration;

@Listeners({AllureTestNg.class})
public class fourHome5 {

    WebDriver driver;
    WebDriverWait wait;
    MainPage mainPage;
    ShopCategory shopCategory;
    Dogfeet dogfeet;

    @BeforeMethod
    public void beforeTest(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://101dalmatin.ua/");
        driver.manage().window().maximize();
        mainPage = new MainPage(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        shopCategory = new ShopCategory(driver);
        dogfeet = new Dogfeet(driver);



    }

    @Test
    public void form(){

        mainPage.showcategory();
        shopCategory.clickOnCategory();
        dogfeet.buttOnKoshuk();
        Assert.assertEquals(driver.getCurrentUrl(), "https://101dalmatin.ua/tovary-dlya-sobak/korm-dlya-sobak/suhij-korm/suhij-korm-dlja-sobak-royal-canin-mini-adult-akcija-8kg-30010080-ua");


    }


    @Test
    public void secondtest(){

        mainPage.showCategory();
        shopCategory.clickkorm();
        dogfeet.buttonInKoshuk();
        Assert.assertEquals(driver.getCurrentUrl(),"https://101dalmatin.ua/tovary-dlya-kotiv/korm-dlya-kotiv/vologij-korm-dlya-kotiv/vologij-korm-dlja-kishok-optimeal-teljatina-z-jagnjatkom-ta-krolikom-63815-ua");

    }



    @Test
    public void searchInputTest() {

        mainPage.shoWCategory();
        shopCategory.clicKkorm();
        dogfeet.buttonInKoshuK();
        Assert.assertEquals(driver.getCurrentUrl(),"https://101dalmatin.ua/tovary-dlya-sobak/korm-dlya-sobak/suhij-korm/hills");

    }



    @AfterMethod
    public void closeTest(){
        driver.quit();


    }

}
