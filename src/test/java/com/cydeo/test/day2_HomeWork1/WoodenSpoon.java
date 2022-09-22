package com.cydeo.test.day2_HomeWork1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WoodenSpoon {
    public static void main(String[] args) {

        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com ");

        //  3. Search for “wooden spoon”
        WebElement searchBox = driver.findElement(By.name("global-enhancements-search-query"));
        searchBox.sendKeys("wooden spoon" + Keys.ENTER);

        //  4. Verify title:    Expected: “Wooden spoon | Etsy”
        String expectedTitle = "Wooden spoon";
        String actualTitle = driver.getTitle();
        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("Etsy Title verification passed!");
        } else {
            System.out.println("Etsy Title verification failed!");

        }
    }
}
