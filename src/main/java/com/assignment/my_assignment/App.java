package com.assignment.my_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class App 
{
    public static void main( String[] args )
    {
    	// Set the path to chromedriver.exe
       // System.setProperty("webdriver.chrome.driver", "C:/Users/rama4/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
options.addArguments("--headless");
        
        // Initialize WebDriver
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        // Open Facebook login page
        driver.get("https://www.facebook.com/");
        
     // Explicit wait for email field to be visible
        WebDriverWait wait = new WebDriverWait(driver, 60);
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        
        // Find email and password fields and login button
        WebElement passwordField = driver.findElement(By.id("pass"));
        WebElement loginButton = driver.findElement(By.name("login"));
        
        // Enter email and password
        emailField.sendKeys("rama48.akula@gmail.com");
        passwordField.sendKeys("Ammanana789#");
        
        // Click on the login button
        loginButton.click();
        
        // Wait for the user to verify login
        // You can add your verification steps here
        
        try {
            Thread.sleep(30000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        // Close the browser
        driver.quit();
    }
}
