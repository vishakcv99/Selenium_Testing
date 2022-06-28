package com.quest.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTest {
	
	@Test
	public void LoginTest() {
		
		System.out.println("Starting LoginTest");
		
		//create driver
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
				
			sleep(2000);
			
//			open test page
			String url = "https://the-internet.herokuapp.com/login";
			driver.get(url);
			System.out.println("Page is opened");
			
//			maximize browser window
			driver.manage().window().maximize();
			
		//  sleep for 3 seconds
			sleep(3000);
			
//			enter username
			/*
			 * WebElement username = driver.findElement(By.id("username"));
			 * username.sendKeys("tomsmith"); sleep(2000);
			 */
			
			
			//
//			enter password
			/*
			 * WebElement password = driver.findElement(By.name("password"));
			 * password.sendKeys("SuperSecretPassword!"); sleep(2000);
			 */
			
//			click login button
			/*
			 * WebElement logInButton = driver.findElement(By.tagName("button"));
			 * logInButton.click();
			 */
			
//			verification:
			
//			new url
			/*
			 * String expectedUrl = "http://the-internet.herokuapp.com/secure"; String
			 * actualUrl = driver.getCurrentUrl(); Assert.assertEquals(actualUrl,
			 * expectedUrl, "Actual page is not same as expected page");
			 */
			
			
//			logout button is visible
			/*
			 * WebElement logOutButton =
			 * driver.findElement(By.xpath("//a[@class='button seconday radius']"));
			 * Assert.assertTrue(logOutButton.isDisplayed(),
			 * "Log Out button is not visible");
			 */
			
//			successful login message
			/*
			 * WebElement successMessage =
			 * driver.findElement(By.xpath("//div[@id='flash']")); String expectedMessage =
			 * "You logged into a secure area!"; String actualMessage =
			 * successMessage.getText();
			 * Assert.assertTrue(actualMessage.contains(expectedMessage),
			 * "Actual message does not contain expected message.\nActual Message: " +
			 * actualMessage + "\nExpected Message: " + expectedMessage);
			 */
			
//			close browser
			driver.quit();
				
			}

			private void sleep(long m) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}

}
