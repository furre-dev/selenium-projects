package com.cybertek.tests.day8_list_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {

    WebDriver driver;

    @BeforeMethod
    public void startUp() {
        driver = new WebDriverFactory().getDriver("chrome","http://practice.cybertekschool.com/multiple_buttons");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


    @Test
    public void test() throws InterruptedException {
        List<WebElement> buttons = driver.findElements(By.cssSelector("button.btn"));

        System.out.println(buttons.size());

        Assert.assertEquals(buttons.size(),6,"Verify that there are 6 buttons");

        for (WebElement button : buttons ) {
            System.out.println(button.getText());
        }

        buttons.get(1).click();

    }

}
