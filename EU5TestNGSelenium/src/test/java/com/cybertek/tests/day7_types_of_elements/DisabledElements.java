package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DisabledElements {

    WebDriver driver;

    @BeforeMethod
    public void startUp(){
        driver = WebDriverFactory.getDriver("chrome","http://practice.cybertekschool.com/radio_buttons");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void greenIsDisabled(){

        WebElement greenBtn = driver.findElement(By.cssSelector("#green"));

        Assert.assertFalse(greenBtn.isEnabled(),"Verify that Green Button is disabled.");

    }

    @Test
    public void textBoxEnabled(){
        driver.navigate().to("http://practice.cybertekschool.com/dynamic_controls");

        WebElement inputBox = driver.findElement(By.cssSelector("input[type='text']"));

        inputBox.sendKeys("Furkan");


    }



}

