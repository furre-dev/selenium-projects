package com.cybertek.reviews.Day7_SeleniumTestNG;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumEasy {



    WebDriver driver;
    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome","http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        //Minimize Driver : driver.manage().window().setPosition(new Point(-2000, 0));
    }
    @AfterClass
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    /*
    SeleniumEasy Checkbox Verification – Section 1
            1.Open Chrome browser
            2.Go to http://www.seleniumeasy.com/test/basic-checkbox-demo.html
            3.Verify “Success – Check box is checked” message is NOT displayed.
            4.Click to checkbox under “Single Checkbox Demo” section
            5.Verify “Success – Check box is checked” message is displayed.

     */

    @Test
    public void test1() {

        WebElement singleCheckBox = driver.findElement(By.cssSelector("input#isAgeSelected"));

        WebElement txtAge = driver.findElement(By.cssSelector("div#txtAge"));

        Assert.assertFalse(txtAge.isDisplayed(),"Success Message verification failed!");
        singleCheckBox.click();
        Assert.assertTrue(txtAge.isDisplayed());

    }
    /*
    SeleniumEasy Checkbox Verification –Section 2
    1.Open Chrome browser
    2.Go to http://www.seleniumeasy.com/test/basic-checkbox-demo.html
    3.Verify “Check All” button text is “Check All”
    4.Click to “Check All” button
    5.Verify all check boxes are checked
    6.Verify button text changed to “Uncheck All”
     */


    @Test
    public void test2(){

        driver.navigate().to("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkAll = driver.findElement(By.cssSelector("#check1"));

        String checkAllTxt = checkAll.getAttribute("value");

        Assert.assertEquals(checkAllTxt,"Check All");
        checkAll.click();

        for (int i = 0; i < 4; i++){
            WebElement checkBoxes = driver.findElement(By.xpath("(//input[@class='cb1-element'])["+(i+1)+"]"));
            Assert.assertTrue(checkBoxes.isSelected());
            System.out.println("Checkbox " + (i+1) +  " is selected? " + checkBoxes.isSelected());
        }

        Assert.assertEquals(checkAll.getAttribute("value"),"Uncheck All");



    }



}
