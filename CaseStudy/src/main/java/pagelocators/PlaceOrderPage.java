package pagelocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class PlaceOrderPage {

    WebDriver driver;
	String pageTitle ="Your Store";
	WebElement searchBox;  
	WebElement searchButton;
	WebElement buttonSearch;
	List<WebElement> itemsList;		
	
	public PlaceOrderPage(WebDriver driver1) {
		this.driver=driver1;
	}
	public void openApp() {
		driver.get("https://tutorialsninja.com/demo/");
		System.out.println("Page Title from app is " +driver.getTitle());
		Assert.assertEquals(pageTitle, (driver.getTitle()));
		}
  
  public void typeSearchText(String textToSearch) {
	  searchBox =driver.findElement(By.xpath("//div[@id='search']/input"));
	  searchButton = driver.findElement(By.xpath("//span[@class='input-group-btn']/button"));
	  searchBox.sendKeys(textToSearch);
	  searchButton.click();
	  
  }
  public boolean verifyItemsListed() {
	itemsList= driver.findElements(By.xpath("//div[@class='caption']/h4/a"));
	for(WebElement item: itemsList)
	{
		String expectedItem = "MacBook Air";
		if(item.getText().equalsIgnoreCase(expectedItem)) {
			System.out.println("Searched item is listed as expected");
	return true;
		}
	
}  return false;
  }  

  
	  
	  
	  
	  
  
}