package Basics;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1
{
 public static void main(String[] args) throws InterruptedException
 {
 System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
 ChromeDriver Driver=new ChromeDriver();
 Driver.get("https://www.google.com/");
 Thread.sleep(2000);
 Driver.quit();
}
}
