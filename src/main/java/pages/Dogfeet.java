package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Dogfeet {


    private WebDriver driver;
    private WebDriverWait wait;


    public Dogfeet(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='button-cart']")
    WebElement buttonkoshuk;


    @FindBy(xpath = "//*[@id='product']//button[contains(@aria-label, 'Plus')]")
    WebElement plusmeal;

    @FindBy(xpath = "//*[@id='cart']")
    WebElement koshuk;

    @FindBy(xpath = "//button[@class='ocf-btn ocf-search-btn-popover']")
    WebElement submitFilter;




    public void buttOnKoshuk() {
        buttonkoshuk.click();

    }

    public void buttonInKoshuk() {
        plusmeal.click();
        koshuk.click();

    }

    public void buttonInKoshuK(){
        wait.until(ExpectedConditions.elementToBeClickable(submitFilter));
        submitFilter.click();
    }

}