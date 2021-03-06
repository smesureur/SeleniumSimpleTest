package org.autom.petStoreSimpleTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class PetStoreTest {
	
	@Test
	public void test() throws Exception {
		FirefoxOptions options = new FirefoxOptions().setProfile(new FirefoxProfile());
		options.addPreference("browser.tabs.remote.autostart", false);
		System.setProperty("webdriver.gecko.driver", "C:\\FORMATION\\SeleniumWebDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver(options);
		
		String peon = System.getProperty("Navigateur");
		
		System.out.println(peon);
		driver.get("http://localhost:8087/jpetstore/");
		WebElement link = driver.findElement(By.xpath("//div[@id='Content']/p[1]/a[1]"));

		link.click();
		
		WebElement logo = driver.findElement(By.xpath("//div[@id='LogoContent']/a/img"));
		
		Assert.assertTrue(logo.isDisplayed());
		
		driver.close();
		/*List<WebElement> sideLinks;
		WebElement sideCatsLink = null;
		List<WebElement> lines;
		WebElement rowToCheck = null;
		
		driver.get("http://localhost:8087/jpetstore/actions/Catalog.action");
		
		// R�cup�ration et click sur le lien vers la section chats depuis la sidebar -> il va falloir corriger cette portion
		sideLinks = driver.findElements(By.xpath("//div[@id='SidebarContent']/a"));
		*/
		/*for (WebElement curlink : sideLinks) {
			if (curlink.getText().equals("Cats"))
				sideCatsLink = curlink;
		}
		sideCatsLink = sideLinks.get(2);
		sideCatsLink.click();
		
		//R�cup�ration de l'�l�ment de la colonne name du Tableau pour la ligne dont le ProductID vaut FL-DLH-02 et s'assurer que la valeur
		// est bien Persian
		lines = driver.findElements(By.xpath("//table/tbody/tr"));

		for (WebElement line : lines) {
			List<WebElement> rows = line.findElements(By.xpath("./td"));
			if (rows.get(0).getText().contains("FL-DHL-02")) {
				//System.out.println(rows.get(0).getText());
				rowToCheck = rows.get(1);
			}
		}
		
		if (rowToCheck != null) {
			Assert.assertEquals("Persian", rowToCheck.getText());
		}
		else {
			throw new Exception("pas trouv� le productID recherch�.");
		}*/
	}

}
