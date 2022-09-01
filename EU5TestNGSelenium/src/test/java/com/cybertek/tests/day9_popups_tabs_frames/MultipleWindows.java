package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import javax.swing.*;
import java.util.Set;



public class MultipleWindows {

    WebDriver driver;

    @BeforeMethod
    public void startUp() {
        driver = new WebDriverFactory().getDriver("chrome","http://practice.cybertekschool.com/windows");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void switchWindows(){

        System.out.println(driver.getTitle());

        WebElement clickHere = driver.findElement(By.cssSelector("a[href='/windows/new']"));

        clickHere.click();

        System.out.println(driver.getTitle());



    }
}

