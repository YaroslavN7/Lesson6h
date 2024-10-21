package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage {

    private WebDriver driver;


    public MainPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='menu_toggle_button']" )
    WebElement category;

    @FindBy(xpath = "//a[@ title = 'Сухий корм для собак']")
    WebElement select;



    @FindBy(xpath = "//*[@id='input_search']" )
    WebElement search;
    @FindBy(xpath = "//*[@id='rm-search-button']" )
    WebElement searchclick;



    @FindBy(xpath = "//*[@id='menu_toggle_button']")
    WebElement caTegory;

    @FindBy(xpath = "//a[@title='Сухий корм для собак']" )
    WebElement selecT;




    public void showcategory(){

        category.click();
        select.click();


    }

    public void showCategory(){

        search.sendKeys("optimeal");
        searchclick.click();
    }

    public void shoWCategory(){
        caTegory.click();
        selecT.click();
    }
}
