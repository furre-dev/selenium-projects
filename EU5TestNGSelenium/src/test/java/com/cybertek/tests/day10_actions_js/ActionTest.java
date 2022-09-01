package com.cybertek.tests.day10_actions_js;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionTest {

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
    public void hoverTest(){
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement img1 = driver.findElement(By.tagName("img"));

        Actions action = new Actions(driver);

        action.moveToElement(img1).perform();

        WebElement linkText = driver.findElement(By.cssSelector("a[href='/users/1']"));

        Assert.assertTrue(linkText.isDisplayed(),"linkText is displayed");

      }

    @Test
    public void dragDRop() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#onetrust-accept-btn-handler")).click();
        Thread.sleep(2000);


        Actions actions = new Actions(driver);

        WebElement dropTarget = driver.findElement(By.id("droptarget"));
        WebElement dropObject = driver.findElement(By.id("draggable"));

        actions.dragAndDrop(dropObject,dropTarget).perform();

        Assert.assertEquals(dropTarget.getText(),"You did great!");


    }
}
