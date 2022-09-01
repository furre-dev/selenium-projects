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

public class NoSelectDropdown {

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
    public void test() throws InterruptedException{

        WebElement linkDropdown = driver.findElement(By.id("dropdownMenuLink"));

        linkDropdown.click();

        List<WebElement> linkDropdownOptions = driver.findElements(By.cssSelector("*[class='dropdown-item']"));
        Assert.assertEquals(linkDropdownOptions.size(),5);

        for (WebElement linkDropdownOption : linkDropdownOptions) {
            System.out.println("linkDropdownOption.getText()" + linkDropdownOption.getText());

        }

        linkDropdownOptions.get(2).click();


    }


}
