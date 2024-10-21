package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopCategory {

    private WebDriver driver;

    public ShopCategory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='oct-policy-btn']")
    WebElement button;

    @FindBy(xpath = "//*[@id='product12902']/div[1]")
    WebElement royalcanin;


    @FindBy(xpath = "//*[@id='content']//a[contains(@href,'https://101dalmatin.ua/tovary-dlya-kotiv/korm-dlya-kotiv/vologij-korm-dlya-kotiv/vologij-korm-dlja-kishok-optimeal-teljatina-z-jagnjatkom-ta-krolikom-63815-ua')]/img")
    WebElement choice;

    @FindBy(xpath = "//*[@id='oct-policy-btn']")
    WebElement buttonpolicy;


    @FindBy(xpath = "//button[@data-value-id='17'] ")
    WebElement filter;



    public void clickOnCategory() {
        button.click();
        royalcanin.click();
    }

    public void clickkorm() {
        buttonpolicy.click();
        choice.click();

    }

    public void clicKkorm() {
        filter.click();

    }
}