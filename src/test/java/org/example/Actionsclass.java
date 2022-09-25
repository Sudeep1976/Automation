package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Actionsclass {

    public static WebDriver driver;


    @Before

    public void setup() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // driver.get("https://letskodeit.teachable.com/");
        driver.get("https://courses.letskodeit.com/practice");


        driver.manage().window().maximize();


    } // end of before annotation

    @Test

    public void actionsDemo() throws InterruptedException {

        //Initialization of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);

        // Scroll down by 1900 pixels
        js.executeScript("window.scrollBy(0,600); ");
        Thread.sleep(2000);

        WebElement mousehover = driver.findElement(By.id("mousehover"));

        Actions actions = new Actions(driver);
        actions.moveToElement(mousehover).perform();

        WebElement top = driver.findElement(By.linkText("Top"));
        Thread.sleep(5000);

        actions.moveToElement(top).click().perform();



    }// end of test annotation



}// end of class
