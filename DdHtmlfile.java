package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DdHtmlfile {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("file:///C:/Users/DELL/Downloads/learningHTML1%20(1).html");
		driver.manage().window().maximize();
		WebElement religion = driver.findElement(By.tagName("select"));
		Select s1 = new Select(religion);
		// s1.selectByIndex(3);
		
		List<WebElement> countofdd = s1.getOptions();
		System.out.println(countofdd.size());
	}

}
