package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PO5_LocateElementsById {
    public static void main(String[] args) {
        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // making window full screen/maximizing
        driver.manage().window().maximize();

        driver.navigate().to("https://www.google.com");

        //identify "I'm feeling Lucky" element and save the element



        // find the value of attribut


        //verify if the value is I'm feeling lucky


    }
}
