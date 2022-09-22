package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeCydeo {
    public static void main(String[] args) {

        //1. Open Chrome Browser
        //1. set up web driver manager
        WebDriverManager.chromedriver().setup();
        //2.Opening an empty browser with creating instance driver

        WebDriver driver = new ChromeDriver();
        //session id = 72ABYHUKH86
        //2.Go to
        driver.get("https://www.cydeo.com");

        //System.out.println("driver.getTitle()= " + driver.getTitle());
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentTitle = " + currentURL);

       //3. Verify title: Expected Title
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification is PASSED");

        }else{
            System.out.println("Title verification is failed");
        }

     //   driver.quit();

    }
}
