package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;

import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.SearchResultPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Search {

	HeaderSection headerSection = new HeaderSection();
	SearchResultPage searchResultPage = new SearchResultPage();
	
	@When("I search for a product {string}")
	public void i_search_for_a_product(String product) {
	   Elements.TypeText(HeaderSection.searchBoxField, product);
	   Elements.click(HeaderSection.searchButton);
	}

	@Then("I should see the product in the search resultsil address")
	public void i_should_see_the_product_in_the_search_resultsil_address() {
		
	    Assert.assertTrue(Elements.isDisplayed(SearchResultPage.samsungSysncMasterProduct));
	}
	
	@Then("I should see the page displaying the message {string}")
	public void i_should_see_the_page_displaying_the_message(String message) {
	   
		Assert.assertTrue(Elements.VerifyTextEquals(SearchResultPage.noResultMessage, message));
	}


	

}
