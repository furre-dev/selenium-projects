package com.cybertek.tests.day10_upload_files;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUpload {

    WebDriver driver;

    @BeforeMethod
    public void startUp() {
        driver = new WebDriverFactory().getDriver("chrome","http://practice.cybertekschool.com/upload");

    }
    @AfterMethod
    public void tearDown() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void upload(){
        WebElement uploadInput = driver.findElement(By.name("file"));
        uploadInput.sendKeys("C:\\Users\\zutti\\Desktop\\txt.txt");
        driver.findElement(By.id("file-submit")).click();

        WebElement actualFileName = driver.findElement(By.id("uploaded-files"));
        Assert.assertEquals(actualFileName.getText(),"txt.txt");


    }
}
