package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_BasicNavigation {
    public static void main(String[] args) throws InterruptedException {


        //set up chrome and create WebDriver instance
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // navigate.to(url)
      //  driver.navigate().to("https://www.google.com");
       driver.get("https://www.tesla.com");
      driver.manage().window().maximize();
        //driver.get url()
       driver.get("https://www.google.com");

          //navigate.back()
        driver.navigate().back();

//Stops execution of code for 3 sec
        Thread.sleep(3000);
        //navigate.forward()
        driver.navigate().forward();

        //navigate.refresh()
       driver.navigate().refresh();


       driver.navigate().to("https://www.google.com");
       String currentTitle = driver.getTitle();
        System.out.println("title = " + currentTitle);


        //System.out.println("driver.getTitle()= " + driver.getTitle());
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentTitle = " + currentURL);



        //close()method will close current opened page
      //  driver.close();
       // Thread.sleep(3000);


        //quit()method will close all opened pages
        driver.quit();



    }
}