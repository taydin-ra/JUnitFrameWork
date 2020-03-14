package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageObjectModel.AbstractClass;
import pageObjectModel.homePage;
import pageObjectModel.itemPage;
import pageObjectModel.searchPage;
import utilities.Driver;
import utilities.readProperties;

public class addToCartSteps {
    WebDriver driver = Driver.getDriver();
    homePage hp = new homePage();
    searchPage sp = new searchPage();
    itemPage itemPage = new itemPage();

    @Given("^Navigate to website$")
    public void navigate_to_website() {
        driver.get(readProperties.getData("URL"));
        driver.manage().window().maximize();

    }

    @Given("^Search or \"([^\"]*)\"$")
    public void search_or(String arg1) {
        hp.writeInSearchButton(arg1);

    }

    @Given("^Click on search button$")
    public void click_on_search_button() {
        hp.clickOnButtonSearch();

    }

    @Given("^Click on any item$")
    public void click_on_any_item() {
        sp.clickAnyProducts();

    }

    @Given("^Fill all the required fields$")
    public void fill_all_the_required_fields() {
        itemPage.chooseRandomInDropdownList();
        itemPage.typeInputList();

    }

    @Given("^Click on Add to cart button$")
    public void click_on_Add_to_cart_button() {
        itemPage.clickOnAddToCart();

    }

    @Then("^Verify I am int the cart page$")
    public void verify_I_am_int_the_cart_page() {
        itemPage.verifyURL("cart");

    }


}
