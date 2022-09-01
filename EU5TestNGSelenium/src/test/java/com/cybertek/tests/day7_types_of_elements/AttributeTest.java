package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AttributeTest {
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
    public void attributeTest(){

        WebElement blueBtn = driver.findElement(By.cssSelector("#blue"));

        System.out.println("blueBtn.getAttribute(type) = " + blueBtn.getAttribute("type"));



    }



}
