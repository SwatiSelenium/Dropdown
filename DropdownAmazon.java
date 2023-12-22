package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownAmazon 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(dropdown);
		//s1.selectByValue("search-alias=stripbooks"); // using by value
		s1.selectByVisibleText("Books"); // using visible text
	//	s1.selectByIndex(4); 			// using id
		
		// below steps to count no of options in dropdown
		List<WebElement> countofdd1 =	s1.getOptions();
		System.out.println(countofdd1.size());
	}

}
