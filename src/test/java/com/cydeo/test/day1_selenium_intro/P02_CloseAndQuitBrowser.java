package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_CloseAndQuitBrowser {

    public static void main(String[] args) {
        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //navigate to practice page that open new tab
        //this practice url will open and wait 3 seconds and open new tab
        driver.get("http://practice.cydeo.com/open_new_tab");


        //closing any current tab
        driver.close();

        // close all browser window opened by driver
        driver.quit();




    }
}
