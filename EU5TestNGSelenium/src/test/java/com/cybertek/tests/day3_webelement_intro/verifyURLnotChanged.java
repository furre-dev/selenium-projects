package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import com.sun.javafx.font.directwrite.DWFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class verifyURLnotChanged {

    public static void main(String[] args) throws InterruptedException {

        //open browser
        WebDriver driver = new WebDriverFactory().getDriver("chrome","http://practice.cybertekschool.com/forgot_password");

        //get firstUrl
        String firstUrl = driver.getCurrentUrl();

        //locate and click button
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //get secondUrl for comparison purposes
        String secondUrl = driver.getCurrentUrl();

        //compare firstUrl and secondUrl and print result.
        if(secondUrl.equals(firstUrl)) {
            System.out.println("PASS");

        }else {
            System.out.println("FAIL");
        }

        driver.quit();


    }

}
