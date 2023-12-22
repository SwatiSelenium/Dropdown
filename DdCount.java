package Dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DdCount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("file:///C:/Users/DELL/Downloads/learningHTML1%20(1).html");
		driver.manage().window().maximize();
		WebElement religion = driver.findElement(By.tagName("select"));
		Select s1 = new Select(religion); 	// step 1 and 2
		
		List<WebElement> countofdd = s1.getOptions(); // step 3, return type of getoptions is list<WebElement>
		
		System.out.println(countofdd.size()); //any List<WebElement> will always have size method in it

	}

}
