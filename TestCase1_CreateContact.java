package week5.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase1_CreateContact extends BaseClassForLeafTaps {
	@Test
	public void Createcontact() {
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("nelson");
		driver.findElement(By.id("lastNameField")).sendKeys("mano");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("arun");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("kumar");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("This is my sample program");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("nelson08mn@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select ss = new Select(state);
		ss.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("(//textarea[@class ='inputBox'])[1]")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("This contact has been edited");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}