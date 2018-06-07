package uk.co.gluedit.pmux;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import uk.co.gluedit.PrimeMux;

import static org.junit.Assert.assertEquals;

public class Stepdefs {
    private String input;

    @Given("^I pass (.*) to PrimeMux$")
    public void i_pass_to_PrimeMux(String input) {
        this.input = input;
    }

    @Then("^the result will be (.*)")
    public void result_will_be(String result) {
        assertEquals(result, PrimeMux.generate(input, new Factoriser()));
    }

}
