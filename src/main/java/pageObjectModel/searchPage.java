package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class searchPage extends AbstractClass {
    WebDriver driver = Driver.getDriver();

    public searchPage() {
        PageFactory.initElements(driver, this);
    }

    @FindAll({
            @FindBy(xpath = "//img[contains(@class,'width-full wt-height-full display-block position-absolute ')]")
    })
    private List<WebElement> products;

    public void clickAnyProducts() {
        clickRandomNum(products);
        switchWindow();
    }

    @FindBy(xpath = "//span[contains(text(),'$75 to $100')]")
    private WebElement radioButton75to100;

    public void clickOnRadioButton74to100(){
        clickFunctionality(radioButton75to100);
    }



    @FindAll({
            @FindBy(xpath = "//span[contains(@class,'text-body-larger')]/span[@class='currency-value']")
    })
    private List<WebElement> products75To100;

    public void verifyBetween(){
        betweenNumbers(75,100,products75To100);
    }
}
