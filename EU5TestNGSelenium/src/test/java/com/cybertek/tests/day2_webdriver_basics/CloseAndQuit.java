package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {

    public static void main(String[] args) throws InterruptedException {

         WebDriverManager.chromedriver().setup();

         WebDriver driver = new ChromeDriver();

         driver.get("https://practice.cybertekschool.com");

         Thread.sleep(3000);

         driver.close();




    }


    public static void chromeStartup(String url) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get(url);

    }


}
