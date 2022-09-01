package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssLocator {

    public static void main(String[] args) {

        WebDriver driver = new WebDriverFactory().getDriver("chrome","http://practice.cybertekschool.com/multiple_buttons");


        WebElement dontClickButton = driver.findElement(By.cssSelector("#disappearing_button"));

        System.out.println(dontClickButton.getText());

        driver.quit();

    }



    /*
    CSS____________
    Class = "."
    id = "#"
    any attribute = tag[onclick="Go"]

    starts with = "^" tag[onclick^="Go"]
    ends with = "$" tag[onclick$="Go"]
    contains = "*" tag[onclick*="Go"]

    PARENT & CHILD RELATION
    xpath: /ul/li/a
    CSS: ul>li>a

    GRANDPARENT & GRANDCHILD RELATION
    xpath: /ul/a
    CSS: ul a

     */

}


