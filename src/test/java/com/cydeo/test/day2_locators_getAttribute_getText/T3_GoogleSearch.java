package com.cydeo.test.day2_locators_getAttribute_getText;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {


        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2- Go to: https://google.com/
        driver.get("https://google.com");

        // 3- Write “apple” in search box
        //use Key.ENTER to search
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple" + Keys.ENTER);


        //5- Verify title: Expected: Title shoul
        String actualTitle = driver.getTitle();
        String expectedTitle =driver.getTitle();
        if (actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification passed!");
    }else{
            System.out.println("Title verification failed!");
        }


    }
}