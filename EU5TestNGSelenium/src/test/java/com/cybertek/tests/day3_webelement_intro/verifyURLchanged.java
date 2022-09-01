package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Locale;

public class verifyURLchanged {

            /*Verify url changed,
            open chrome browser
            go to http://practice.cybertekschool.com/forgot_password
            enter any email
            click on Retrieve Password
            verify that url changed to http://practice.cybertekschool.com/email_sent
            */


    public static void main(String[] args) {

        Faker faker = new Faker();
        String fakeEmail = faker.name().firstName().toLowerCase(Locale.ROOT) + "_" + faker.name().lastName().toLowerCase(Locale.ROOT) + "@" + "hotmail.com";

        WebDriver driver = new WebDriverFactory().getDriver("chrome","http://practice.cybertekschool.com/forgot_password");

        String firstUrl = driver.getCurrentUrl();
        

        WebElement email = driver.findElement(By.name("email"));

        email.sendKeys(fakeEmail);

        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String expectedUrl = "http://practice.cybertekschool.com/email_sent";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }


        driver.quit();




    }




}
