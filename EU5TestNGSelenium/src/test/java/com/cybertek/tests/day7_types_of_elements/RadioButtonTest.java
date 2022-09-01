package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTest {

    WebDriver driver;

    @BeforeMethod
    public void startUp(){
        driver = new WebDriverFactory().getDriver("chrome","http://practice.cybertekschool.com/radio_buttons");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void Test1() {



        WebElement blueBtn = driver.findElement(By.cssSelector("#blue"));
        WebElement redBtn = driver.findElement(By.cssSelector("#red"));

        Assert.assertTrue(blueBtn.isSelected(),"Verify that blue button is selected.");
        Assert.assertFalse(redBtn.isSelected(),"Verify that red button is NOT selected.");
        System.out.println("Test Confirmation Message: Blue is selected and Red is not selected.");
    }


}
