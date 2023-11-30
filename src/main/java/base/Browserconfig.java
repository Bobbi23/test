package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DriverCommand;

public class Browserconfig {
	
	public static WebDriver getChromeDriver() {
		WebDriver driver = new ChromeDriver();
	    return driver;
	}
	public static WebDriver getFirefoxDriver() {
		WebDriver driver = new FirefoxDriver();
	    return driver;
}
	public static WebDriver getEdgeBrower() {
		WebDriver driver= new EdgeDriver();
		return driver;
		
	}
}