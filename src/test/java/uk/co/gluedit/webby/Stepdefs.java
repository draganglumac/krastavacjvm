package uk.co.gluedit.webby;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import uk.co.gluedit.pages.GoogleHome;
import uk.co.gluedit.pages.GoogleResults;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class Stepdefs {

    private WebDriver driver;
    private GoogleHome googleHome;

    @Before("@web")
    public void beforeScenario() {
//        driver = new HtmlUnitDriver();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    @After("@web")
    public void afterScenario() {
        driver.close();
    }

    @Given("^I open Google search$")
    public void i_open_Google_search() throws Exception {
        driver.get("http://www.google.com");
        googleHome = PageFactory.initElements(driver, GoogleHome.class);
    }

    @When("^I search for (.*)$")
    public void i_search_for(String term) throws Exception {
        googleHome.doSearch(term);
    }

    @Then("^results will contain (.*)$")
    public void results_will_contain(String text) throws Exception {
        GoogleResults searchResults = PageFactory.initElements(driver, GoogleResults.class);
        assertTrue(resultsContain(searchResults.resultHeadings(), text));
    }

    private boolean resultsContain(List<String> results, String substring) {
        for (String r : results)
            if (r.contains(substring))
                return true;
        return false;
    }

}