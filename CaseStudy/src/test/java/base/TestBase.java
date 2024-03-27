
package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	private static TestBase testBase;
	private static WebDriver driver;

	public static TestBase getTestBase() {
		return testBase;
	}

	public static void setTestBase(TestBase testBase) {
		TestBase.testBase = testBase;
	}
	/*
	 * private TestBase() { String strBrowser = "chrome";
	 * 
	 * if(strBrowser.equalsIgnoreCase("chrome")) { driver = new ChromeDriver(); }
	 * else if(strBrowser.equalsIgnoreCase("edge")) { driver = new EdgeDriver(); }
	 * 
	 * driver.manage().window().maximize();
	 * 
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 * driver.manage().deleteAllCookies();
	 * 
	 * System.out.println("Driver obj...." + driver); }
	 */

	public TestBase(String browserName2) {
		if (browserName2.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName2.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		/*
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.manage().deleteAllCookies();
		 */
		System.out.println("Driver object from parameterized...." + driver);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void initDriver(String browserName) {
		// if(testBase == null) {
		// setTestBase(new TestBase());
		setTestBase(new TestBase(browserName));

		// }
	}

	public static void tearDown() {
		if (driver != null) {
			driver.close();
			driver.quit();
		}
		setTestBase(null);
	}

}
