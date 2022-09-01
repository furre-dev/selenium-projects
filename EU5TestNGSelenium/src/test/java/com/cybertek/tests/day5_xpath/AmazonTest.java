package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {

    public static void main(String[] args) throws InterruptedException {

        String searchText = "java";
        String expectedResult = "1–48 av mer än 10 000 resultat för \"java\"";

        //Open Amazon
        WebDriver driver = new WebDriverFactory().getDriver("chrome","https://www.amazon.se/");

        //Search for "selenium"

        WebElement searchBox = driver.findElement(By.name("field-keywords"));
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchBox.sendKeys(searchText);
        searchButton.click();

        //Get text from website
        WebElement searchResultText = driver.findElement(By.xpath("//span[contains(text(),\"resultat för\")]"));
        String getSearchResultText = searchResultText.getText();


        if(getSearchResultText.equals(expectedResult)) {
            System.out.println(getSearchResultText + " " + searchText);
            System.out.println("PASS");
        }else {
            System.out.println(getSearchResultText + " " + searchText + " | " + expectedResult);
            System.out.println("FAIL");
        }





        //wait 2 seconds and quit the webDriver
        Thread.sleep(2000);
        driver.quit();


    }


}
