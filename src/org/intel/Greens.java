package org.intel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Greens {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\aravi\\eclipse-workspace\\Greens\\driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		WebElement search=driver.findElement(By.id("email"));
        search.sendKeys("Aravinth");
        WebElement pass=driver.findElement(By.id("pass"));
        pass.sendKeys("7339185184");
        WebElement click=driver.findElement(By.name("login"));
        click.click();
		
	}

}
