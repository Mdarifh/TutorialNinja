package com.tutorialsninja.automation.stepdef;


import org.junit.Assert;

import com.tutorialsninja.automation.framework.Browser;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.CheckoutPage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.LoginPage;
import com.tutorialsninja.automation.pages.OrderSuccessPage;
import com.tutorialsninja.automation.pages.SearchResultPage;
import com.tutorialsninja.automation.pages.ShoppingCartPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orders {
	HeaderSection headerSection = new HeaderSection();
	LoginPage loginPage = new LoginPage();
	SearchResultPage searchResultPage = new SearchResultPage();
	ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
	//CheckoutPage checkoutPage = new CheckoutPage();
	@Given("I login to the application")
	public void i_login_to_the_application() throws InterruptedException {
	   
		Browser.openApplicationURL();
	    HeaderSection.navigatetoLoginPage();
	    Thread.sleep(2000);
	    LoginPage.doLogin();
	    Thread.sleep(2000);
	}

	@When("I add any product to Bag and checkout")
	public void i_add_any_product_to_bag_and_checkout() throws InterruptedException {
		HeaderSection.searchProduct();
		
		SearchResultPage.addFirstproduct();
		
		HeaderSection.navigateToShoppingCartPage();
		
		ShoppingCartPage.navigateToCheckoutPage();
	}

	@And("I place an order")
	public void i_place_an_order() {
	   // CheckoutPage.placeOrder();
	}

	@Then("I should see that the order is placed successfully")
	public void i_should_see_that_the_order_is_placed_successfully() {
	//	Waits.waitUntilElementLocated(10,OrderSuccessPage.successBreadcrumb);
	  //  Assert.assertTrue(Elements.isDisplayed(OrderSuccessPage.successBreadcrumb));
	}
}
