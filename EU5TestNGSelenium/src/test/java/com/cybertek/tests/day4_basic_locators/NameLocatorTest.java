package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) {



        WebDriver driver = new WebDriverFactory().getDriver("chrome","http://practice.cybertekschool.com/sign_up");

        driver.manage().window().maximize();

        WebElement signUpButton = driver.findElement(By.name("wooden_spoon"));
        WebElement fullName = driver.findElement(By.name("full_name"));
        WebElement email = driver.findElement(By.name("email"));

        fullName.sendKeys("Mike Smith");
        email.sendKeys("mike@smith.com");
        signUpButton.click();







    }
}
