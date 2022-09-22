package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CydeoTitleVerification {

    public static void main(String[] args) {

        //1. Open Chrome Browser
        //1. set up web driver manager
        WebDriverManager.chromedriver().setup();

        //2.Opening an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();
        //session id = 72ABYHUKH86


        // making window full screen/maximizing
        driver.manage().window().maximize();

        //2.Go to
        driver.get("https://www.cydeo.com");

//3. Verify title: Expected Title
        String expectedTitle = "Cydeo";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification is PASSED");

        }else{
            System.out.println("Title verification is failed");
        }

        driver.quit();







    }
}
