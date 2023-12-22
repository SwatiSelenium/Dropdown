package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//program to print amazon drop down count and names

public class PrintDDoptions {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s1 = new Select(dropdown);
	
		s1.selectByVisibleText("Books"); // using visible text
	
		
		// below steps to count no of options in dropdown
		List<WebElement> countofdd1 =	s1.getOptions();
		int count = countofdd1.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++)
		{
			WebElement ddnames = countofdd1.get(i);
			String dropnames = ddnames.getText();
			System.out.println(dropnames);
		}
	}

}
