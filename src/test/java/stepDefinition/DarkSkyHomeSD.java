package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.testng.asserts.SoftAssert;
import runnerTest.webPages.DarkSkyHomePage;
import utils.BasePage;

public class DarkSkyHomeSD {
    public SoftAssert softAssert = new SoftAssert();
    DarkSkyHomePage darkSkyHomePage;
    @Given("^I am on Dark Sky home page$")
    public void setDarkSkyHomePage(){

darkSkyHomePage = new DarkSkyHomePage();
        softAssert.assertEquals(BasePage.get().getCurrentUrl(),"https://darksky.net/");
    }

    @When("^I click on Today button and expand it$")
    public void i_click_on_Today_button_and_expand_it()   {
        darkSkyHomePage.expandToday();

    }

    @When("^I get lowest temperature, verify displayed temperature$")
    public void i_get_lowest_temperature_verify_displayed_temperature()   {
        softAssert.assertEquals(darkSkyHomePage.getLowestDisTemp(),darkSkyHomePage.gettingLowestTemp());

    }

    @Then("^I get highest temperature, verify displayed temperature$")
    public void i_get_highest_temperature_verify_displayed_temperature()   {
        softAssert.assertEquals(darkSkyHomePage.getHighestDisTemp(),darkSkyHomePage.gettingHighestTemp());
    }
}
