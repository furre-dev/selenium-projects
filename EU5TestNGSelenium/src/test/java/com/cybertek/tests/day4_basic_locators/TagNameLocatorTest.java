package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocatorTest {

    public static void main(String[] args) {

        WebDriver driver = new WebDriverFactory().getDriver("chrome","http://practice.cybertekschool.com/sign_up");

        driver.manage().window().maximize();

        WebElement fullNameInput = driver.findElement(By.tagName("input"));
        fullNameInput.sendKeys("Mike Smith with TagName");


    }

}
