package org.autom.petStoreSimpleTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PetStore {
	
	@Test
	public void test() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\FORMATION\\SeleniumWebDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		System.out.println(System.getProperty("Navigateur"));
		driver.get("http://localhost:8087/jpetstore/");
		WebElement link = driver.findElement(By.xpath("//div[@id='Content']/p[1]/a[1]"));

		link.click();
		
		WebElement logo = driver.findElement(By.xpath("//div[@id='LogoContent']/a/img"));
		
		Assert.assertTrue(logo.isDisplayed());
		
		/*List<WebElement> sideLinks;
		WebElement sideCatsLink = null;
		List<WebElement> lines;
		WebElement rowToCheck = null;
		
		driver.get("http://localhost:8087/jpetstore/actions/Catalog.action");
		
<<<<<<< HEAD
		// Récupération et click sur le lien vers la section chats depuis la sidebar -> il va falloir corriger cette portion
=======
		// Récupération et click sur le lien vers la section chats depuis la sidebar ceci refuse de fonctionner
>>>>>>> refs/heads/Maintenance
		sideLinks = driver.findElements(By.xpath("//div[@id='SidebarContent']/a"));
		*/
		/*for (WebElement curlink : sideLinks) {
			if (curlink.getText().equals("Cats"))
				sideCatsLink = curlink;
		}
		sideCatsLink = sideLinks.get(2);
		sideCatsLink.click();
		
		//Récupération de l'élément de la colonne name du Tableau pour la ligne dont le ProductID vaut FL-DLH-02 et s'assurer que la valeur
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
			throw new Exception("pas trouvé le productID recherché.");
		}*/
	}

}
