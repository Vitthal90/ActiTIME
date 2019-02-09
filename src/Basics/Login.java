package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login 
{
	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	 
	 System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
	 FirefoxDriver driver=new FirefoxDriver();
	 driver.get("file:///C:/Users/Vykharee/Desktop/Html%20Weekend/sample1.html");
	 WebElement A=driver.findElement(By.xpath("./html/body/div[1]/input[1]"));
	 A.sendKeys("Vitthal");
	 WebElement B=driver.findElement(By.xpath("./html/body/div[2]/input[2]"));
	 B.sendKeys("Vitthal");
	 WebElement C=driver.findElement(By.xpath("./html/body/div[2]/input[1]"));
	 C.sendKeys("Vitthal");
	 WebElement D=driver.findElement(By.xpath("./html/body/div[1]/input[2]"));
	 D.sendKeys("Vitthal");
	 
    }
 }