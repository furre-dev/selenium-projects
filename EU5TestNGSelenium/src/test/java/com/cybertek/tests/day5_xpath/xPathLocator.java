package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class xPathLocator {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome","http://practice.cybertekschool.com/multiple_buttons");

        WebElement buttonTwo = driver.findElement(By.xpath("//button[@name=\"button2\"]"));

        buttonTwo.click();

        /*
            Relative xPath = "//button[@name="button2"]"
            Absolute xPath = "/body/div/div/ln/a"

            attribute = "//button[@name="button2"]"
            getText = "//button[.="button2"]"
            getPartialText = "//button[containst(text(),"Button 2)"]"

 */


    }

}
