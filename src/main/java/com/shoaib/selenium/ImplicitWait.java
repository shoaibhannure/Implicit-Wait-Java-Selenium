package com.shoaib.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// dynamic wait

		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); //Page Load Timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);   //Implicit Wait for all Web Elements
		driver.get("https://www.rediff.com/");

	}

}
