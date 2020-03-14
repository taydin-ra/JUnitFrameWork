package pageObjectModel;

import com.google.gson.internal.$Gson$Preconditions;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.List;
import java.util.Random;
import java.util.Set;

public abstract class AbstractClass {

    // Create a reusable method for clicking functionality
    private WebDriver driver = Driver.getDriver();

    WebDriverWait wait = new WebDriverWait(driver, 10);

    public void clickFunctionality(WebElement clickButton) {

        wait.until(ExpectedConditions.elementToBeClickable(clickButton));
        clickButton.click();

    }

    // Create a reusable method for sendkeys functionality
    public void sendKeysFunctionality(WebElement element, String input) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(input);

    }

    public int randomNum(int max) {
        Random rnd = new Random();
        int myRandom = rnd.nextInt(max);
        return myRandom;
    }

    public void clickRandomNum(List<WebElement> listOfElements) {
        int rnd = randomNum(listOfElements.size());
        clickFunctionality(listOfElements.get(rnd));


    }

    public void switchWindow() {
        Set<String> windows = driver.getWindowHandles();

        for (String myWin : windows) {
            driver.switchTo().window(myWin);
        }
    }

    public void sleep(int num) {

        try {
            Thread.sleep(num * 1000);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void selectInTheDropdown(WebElement dropdown) {
        Select select = new Select(dropdown);
        List<WebElement> max = select.getOptions();
        int random = randomNum(max.size() - 1);
        select.selectByIndex(random + 1);
        sleep(1);


    }

    public void typeInTheInputs(WebElement inputs, String value) {
        sendKeysFunctionality(inputs, value);
    }

    public void verifyURL(String expectedResult) {
        String URL = driver.getCurrentUrl();
        Assert.assertTrue(URL.contains(expectedResult));

    }

    public void betweenNumbers(int min,int max,List<WebElement> priceList ){
        for (int i=0; i<priceList.size();i++){
            String priceStr=priceList.get(i).getText();
            double priceDouble=Double.parseDouble(priceStr);
            if(min<=priceDouble && priceDouble<=max){
                Assert.assertTrue( "number is between the range" , true );
            }else{
                Assert.fail();
            }
            }
        }
    }

