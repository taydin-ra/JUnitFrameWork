package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjectModel.searchPage;

public class searchPriceFilterSteps {

    searchPage sp=new searchPage();

    @Given("^Click on price filter seventy five to hundred$")
    public void click_on_price_filter_seventy_five_to_hundred() {
        sp.clickOnRadioButton74to100();

    }

    @Then("^Verify all prices are between seventy five and hundred$")
    public void verify_all_prices_are_between_seventy_five_and_hundred() {
        sp.verifyBetween();

    }


}
