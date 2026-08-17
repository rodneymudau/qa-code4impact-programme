package com.code4impact.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This is the test used throughout the Week 5 Student Guides.
 * The line-by-line walkthrough in the Week 5, Day 2 guide matches
 * the validLoginSucceeds() method below, exactly.
 *
 * What it does: logs into saucedemo.com with a valid username and
 * password, then checks that the Products page actually loaded.
 */
public class LoginTest {

    WebDriver driver;

    // Runs automatically before every test — opens a fresh browser window
    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void validLoginSucceeds() {
        String username = "standard_user";
        String password = "secret_sauce";

        driver.get("https://www.saucedemo.com");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        String pageTitle = driver.findElement(By.className("title")).getText();
        assertEquals("Products", pageTitle);
    }

    // Runs automatically after every test — closes the browser window
    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
