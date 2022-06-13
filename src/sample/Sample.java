package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
//
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\WeekDaysBatch224\\C1_WebDriver\\Browser\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		wd.get("https://www.google.com/");
		
	}

}
