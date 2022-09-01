package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Locale;

public class verifyConfirmationMessage {

            /*Verify confirmation message,
            open chrome browser
            go to http://practice.cybertekschool.com/forgot_password
            enter any email
            verify that email is displayed in the input box
            click on Retrieve Password
            verify that confirmation message says "Your email's been sent"
            */

        public static void main(String[] args) {

            Faker faker = new Faker();
            String fakeEmail = faker.name().firstName().toLowerCase(Locale.ROOT) + "_" + faker.name().lastName().toLowerCase(Locale.ROOT) + "@" + "hotmail.com";


            WebDriver driver = new WebDriverFactory().getDriver("chrome","http://practice.cybertekschool.com/forgot_password");

            WebElement email = driver.findElement(By.name("email"));

            email.sendKeys(fakeEmail);


            String actualEmail = email.getAttribute("value");
            String emailUrl = "http://practice.cybertekschool.com/email_sent";

            String expectedMessage = "Your e-mail\'s been sent!";


            if (actualEmail.equals(fakeEmail)) {
                System.out.println("VERIFIED EMAIL: PASS");

                WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
                retrievePasswordButton.click();


                if(driver.getCurrentUrl().equals(emailUrl)) {

                    WebElement confirmationMessage = driver.findElement(By.name("confirmation_message"));

                    String actualMessage = confirmationMessage.getText();

                   if(actualMessage.equals("Your e-mail's been sent!")) {
                       System.out.println("VERIFIED MESSAGE : PASS");
                   }else{
                       System.out.println("VERIFIED MESSAGE :FAIL");
                       System.out.println(actualMessage);
                       System.out.println(expectedMessage);

                   }

                }


            }else {
                System.out.println("VERIFIED EMAIL: FAIL");
                System.out.println("Expected email = "+fakeEmail);
                System.out.println("Actual email = " + actualEmail);
            }


            driver.quit();


        }

}
