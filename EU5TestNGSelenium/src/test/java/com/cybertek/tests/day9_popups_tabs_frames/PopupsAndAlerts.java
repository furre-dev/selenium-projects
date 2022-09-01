package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupsAndAlerts {

    WebDriver driver;

    @BeforeMethod
    public void startUp() {
        driver = new WebDriverFactory().getDriver("chrome","https://www.primefaces.org/showcase-v8/ui/overlay/confirmDialog.xhtml");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test(){

        WebElement destroyTheWorldBtn = driver.findElement(By.xpath("//button[.='Destroy the World']"));

        destroyTheWorldBtn.click();

        WebElement destroyNo = driver.findElement(By.xpath("//span[.='No']"));

        destroyNo.click();


    }
    @Test
    public void test2(){

        driver.navigate().to("http://practice.cybertekschool.com/javascript_alerts");

        WebElement alertBtn = driver.findElement(By.xpath("//button[1]"));
        alertBtn.click();
        //switch to Javascript Alert enviroment to be able to handle alerts.
        Alert jsAlert = driver.switchTo().alert();



    }
}


