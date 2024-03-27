package stepDefs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagelocators.PlaceOrderPage;
import stepDefs.Hooks;

public class PlaceOrder{
	
	WebDriver driver ;
	PlaceOrderPage placeorderpage;
	
	
@Given("User is on home page")
public void user_is_on_home_page() {
//	TestBase.initDriver("chrome");
    driver=TestBase.getDriver();
    placeorderpage = new PlaceOrderPage(driver);
	placeorderpage.openApp();
}
@When("User search an item {string}")
public void user_search_an_item(String string) {
	placeorderpage.typeSearchText(string);
	Assert.assertTrue(driver.getPageSource().contains("Products meeting the search criteria"));

}
@Then("Item must be listed")
public void item_must_be_listed() {
	boolean itempresent = placeorderpage.verifyItemsListed();
	Assert.assertTrue(itempresent);
}

@Given("User should be on Search Result page")
public void user_should_be_on_search_result_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@When("User add item to cart")
public void user_add_item_to_cart() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("Item must be added")
public void item_must_be_added() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}

@When("User do checkout")
public void user_do_checkout() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
@Then("User should navigate to checkout page")
public void user_should_navigate_to_checkout_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
}
}