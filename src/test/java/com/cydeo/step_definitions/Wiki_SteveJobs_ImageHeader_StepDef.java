package com.cydeo.step_definitions;

import com.cydeo.pages.Wiki_SteveJobs_ImageHeader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Wiki_SteveJobs_ImageHeader_StepDef {

        Wiki_SteveJobs_ImageHeader wiki_steveJobs = new Wiki_SteveJobs_ImageHeader();


    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://en.wikipedia.org/");
    }
    @When("User types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
    }
    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {

    }
    @Then("User sees Steve Jobs is in the image header")
    public void user_sees_steve_jobs_is_in_the_image_header() {

    }

}
