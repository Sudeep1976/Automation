package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWait {

    public WebDriver driver;

    @Before

    public void setup() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

     //   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("https://letskodeit.teachable.com/");
       // driver.get("https://courses.letskodeit.com/practice");


        driver.manage().window().maximize();



    } // end of before annotation

    @Test

    public void explicitDemo(){

        WebElement loginbutton = driver.findElement(By.linkText("Login"));
        loginbutton.click();

       // WebElement username = driver.findElement(By.id("email"));
      //  username.sendKeys("test@test.com");


        WebDriverWait wait = new WebDriverWait(driver,3);

       WebElement username =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        username.sendKeys("test@test.com");


    }// end of test annotation




}// end of class
