package seleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticaSelenium {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Obtener objetos/WebElements de la página web
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement passwordTxt = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		
		//hacer login
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		passwordTxt.sendKeys("secret_sauce");
		Thread.sleep(2000);
		loginBtn.click();
		Thread.sleep(2000);
		
		//Metodos del explorador
		//obtener el título de la página
		String title = driver.getTitle();
		System.out.println("El título de la página es: " + title);
		
		
		//Obtener la URL
		String url = driver.getCurrentUrl();
		System.out.println("La URL actual es: " + url);
		
		//Métodos de navegación
		
		/*
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		*/
		
		//Verificar elemento desplegado en la página
		boolean product = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		if(product) {
			System.out.println("El artículo es desplegado");
		}
		
		//Obtener el texto de un WebElement
		String prodText = driver.findElement(By.className("inventory_item_name")).getText();
		boolean textCorrect = prodText.contains("Sauce Labs Backpack"); //Contains es un método de JAVA que evalua 2 string
		
		if (textCorrect) {
			System.out.println("El nombre del producto es correcto");
		}else {
			System.out.println("ERROR: El producto no es correcto");
		}
		
		Thread.sleep(2000);				
		//Dropdown
		Select dropdown = new Select(driver.findElement(By.className("product_sort_container")));
		dropdown.selectByValue("lohi");
		
		//driver.close(); //cierra la ventana actual
		//driver.quit(); //cierra todas las ventanas creadas
	}

}
