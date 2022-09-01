package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DisplayedDemo {

    WebDriver driver;

    @BeforeMethod
    public void startUp(){
        driver = WebDriverFactory.getDriver("chrome","http://practice.cybertekschool.com/dynamic_loading/1");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void isDisplayed() throws InterruptedException {

        WebElement usernameInput = driver.findElement(By.cssSelector("#username"));

        WebElement startButton = driver.findElement(By.cssSelector("[id='start']>button"));

        Assert.assertFalse(usernameInput.isDisplayed(),"Verify that usernameInput is NOT displayed.");
        System.out.println("usernameInput is not displayed.");

        startButton.click();
        System.out.println("startButton is clicked.");
        Thread.sleep(6000);

        Assert.assertTrue(usernameInput.isDisplayed(),"Verify that usernameInput is displayed.");
        System.out.println("usernameInput is displayed.");



    }
}
