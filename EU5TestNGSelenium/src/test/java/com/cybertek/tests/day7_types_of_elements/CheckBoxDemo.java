package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxDemo {

    WebDriver driver;

    @BeforeMethod
    public void startUp(){
        driver = WebDriverFactory.getDriver("chrome","http://practice.cybertekschool.com/checkboxes");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void checkBoxes(){

        WebElement boxOne = driver.findElement(By.cssSelector("#box1"));
        WebElement boxTwo = driver.findElement(By.cssSelector("#box2"));

        System.out.println("boxTwo.isSelected() = " + boxTwo.isSelected());
        System.out.println("boxOne.isSelected() = " + boxOne.isSelected());

        Assert.assertFalse(boxOne.isSelected());
        Assert.assertTrue(boxTwo.isSelected());

        boxOne.click();

        Assert.assertTrue(boxOne.isSelected());


    }
}
