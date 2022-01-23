package tests;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.DriverProvider;
import utils.Properties;

public class SearchProjectTest {

	private WebDriver driver;

	@Before
	public void setUp() {
		driver = DriverProvider.getInstance().getDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.get(Properties.app_url);
	}

	@Test
	public void testCollabtiveSearchProject() throws Exception {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.cssSelector("button.loginbutn")).click();
		driver.findElement(By.id("query")).clear();
		driver.findElement(By.id("query")).sendKeys("Project001");
		driver.findElement(By.cssSelector("fieldset > button[type=\"submit\"]")).click();
		assertEquals("Results (1)",
				driver.findElement(By.xpath("html/body/div[1]/div[2]/div[2]/div/div/div[1]/h2")).getText());
		assertEquals("Project001", driver.findElement(By.xpath(
				"html/body/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div/div/ul/li/div/table/tbody/tr[2]/td/span/a"))
				.getText());
		driver.findElement(By.xpath(".//*[@id='mainmenue']/li[4]/a")).click();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
