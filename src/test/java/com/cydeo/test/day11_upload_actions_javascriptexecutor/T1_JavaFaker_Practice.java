package com.cydeo.test.day11_upload_actions_javascriptexecutor;

import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class T1_JavaFaker_Practice {

    @Test
    public void registration_form() {

        //1. Open browser
//2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get("https://practice.cydeo.com/registration_form");


        List<WebElement> listOfInputs = Driver.getDriver().findElements(By.xpath("//div[@class='form-group has-feedback']/div/input"));
        Faker faker = new Faker();

//3. Enter first name
        WebElement firstName = listOfInputs.get(0);
        firstName.sendKeys(faker.name().firstName());

//4. Enter last name
        WebElement lastName = listOfInputs.get(1);
        lastName.sendKeys(faker.name().lastName());

//5. Enter username
        WebElement userName = listOfInputs.get(2);
        userName.sendKeys(faker.name().username().replace(".", ""));

//6. Enter email address
        WebElement emailAddress = listOfInputs.get(3);
        emailAddress.sendKeys(faker.bothify("???????_##@yahoo.com"));

//7. Enter password
        WebElement password = listOfInputs.get(4);
        password.sendKeys(faker.bothify("???AABB##!@#"));

// 8. Enter phone number
        WebElement phoneNumber = listOfInputs.get(5);
        phoneNumber.sendKeys(faker.numerify("###-###-####"));

// 9. Select a gender from radio buttons
        Driver.getDriver().findElement(By.xpath("//input[@value='male']")).click();

        // 10. Enter date of birth
        WebElement dateOfBirth = listOfInputs.get(6);
        dateOfBirth.sendKeys(faker.numerify("10/1#/19##"));


        // 11. Select Department/Office
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        select.selectByIndex(Integer.parseInt(faker.numerify("#")));


        //12. Select Job Title
        Select select1 = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        select1.selectByIndex(Integer.parseInt(faker.numerify("#")));


//13. Select programming language from checkboxes
        Driver.getDriver().findElement(By.xpath("//input[@value='java']")).click();


// 14. Click to sign up button
        Driver.getDriver().findElement(By.id("wooden_spoon")).click();


        //15. Verify success message “You’ve successfully completed registration.” is
//        displayed.
        String actualMessage = Driver.getDriver().findElement(By.xpath("//div/p")).getText();
        Assert.assertEquals(actualMessage, "You’ve successfully completed registration.");

    }
}