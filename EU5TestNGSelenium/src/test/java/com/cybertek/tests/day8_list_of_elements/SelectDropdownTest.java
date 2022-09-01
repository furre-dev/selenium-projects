package com.cybertek.tests.day8_list_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SelectDropdownTest {

    WebDriver driver;

    @BeforeMethod
    public void startUp() {
        driver = new WebDriverFactory().getDriver("chrome","http://practice.cybertekschool.com/dropdown");
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test(){
        WebElement stateSelection = driver.findElement(By.id("state"));

        Select stateDropdown = new Select(stateSelection);

        List<WebElement> options = stateDropdown.getOptions();

        System.out.println("options.size() = " + options.size());

        for (WebElement option : options) {

            System.out.println("option.getText() = " + option.getText());

        }

    }

    @Test
    public void test2(){

        WebElement stateSelection = driver.findElement(By.id("state"));

        Select stateDropdown = new Select(stateSelection);

        Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(),"Select a State","Verify that the default selecotr is select a state");

        stateDropdown.selectByVisibleText("Virginia");
        Assert.assertEquals(stateDropdown.getFirstSelectedOption().getText(),"Virginia");




    }

}
