package tests;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverProvider;
import utils.Properties;

public class AddressBookCheckMultipleAddressBookTest {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		driver = DriverProvider.getInstance().getDriver();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(Properties.app_url);
	}

	@Test
	public void testAddressBookCheckMultipleAddressBook() throws Exception {
		driver.findElement(By.name("user")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("secret");
		driver.findElement(By.xpath(".//*[@id='content']/form/input[3]")).click();
		driver.findElement(By.linkText("print phones")).click();
		assertTrue(driver.findElement(By.xpath(".//*[@id='view']/tbody/tr/td[1]")).getText()
				.matches("^[\\s\\S]*firstname1[\\s\\S]*$"));
		assertTrue(driver.findElement(By.xpath(".//*[@id='view']/tbody/tr/td[1]")).getText()
				.matches("^[\\s\\S]*lastname1[\\s\\S]*$"));
		assertTrue(driver.findElement(By.xpath(".//*[@id='view']/tbody/tr/td[1]")).getText()
				.matches("^[\\s\\S]*01056321[\\s\\S]*$"));
		assertTrue(driver.findElement(By.xpath(".//*[@id='view']/tbody/tr/td[2]")).getText()
				.matches("^[\\s\\S]*firstname2[\\s\\S]*$"));
		assertTrue(driver.findElement(By.xpath(".//*[@id='view']/tbody/tr/td[2]")).getText()
				.matches("^[\\s\\S]*lastname2[\\s\\S]*$"));
		assertTrue(driver.findElement(By.xpath(".//*[@id='view']/tbody/tr/td[2]")).getText()
				.matches("^[\\s\\S]*01056322[\\s\\S]*$"));
		assertTrue(driver.findElement(By.xpath(".//*[@id='view']/tbody/tr/td[3]")).getText()
				.matches("^[\\s\\S]*firstname3[\\s\\S]*$"));
		assertTrue(driver.findElement(By.xpath(".//*[@id='view']/tbody/tr/td[3]")).getText()
				.matches("^[\\s\\S]*lastname3[\\s\\S]*$"));
		assertTrue(driver.findElement(By.xpath(".//*[@id='view']/tbody/tr/td[3]")).getText()
				.matches("^[\\s\\S]*01056323[\\s\\S]*$"));
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
