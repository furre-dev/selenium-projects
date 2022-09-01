package com.cybertek.tests.day10_actions_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavaScriptExectuterDemo {

    WebDriver driver;

    @BeforeMethod
    public void startUp() {
        driver = new WebDriverFactory().getDriver("chrome");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }


    @Test
    public void clickWithJs(){
        driver.get("http://practice.cybertekschool.com");

        WebElement dropdownLink = driver.findElement(By.cssSelector("a[href='/dropdown']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].click();",dropdownLink);


    }
    @Test
    public void textWithJs(){
        driver.get("http://practice.cybertekschool.com/");

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement dropdownLink = driver.findElement(By.cssSelector("a[href='/dynamic_controls']"));

        js.executeScript("arguments[0].click();",dropdownLink);

        WebElement textField = driver.findElement(By.cssSelector("input[type='text']"));


        js.executeScript("arguments[0].setAttribute('value', '" + "hello world" +"')", textField);
    }
    @Test
    public void scrollUpAndDown() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/infinite_scroll");

        JavascriptExecutor js = (JavascriptExecutor) driver;


        js.executeScript("window.scrollBy(0,500)");

        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0,-250)");



    }
}
