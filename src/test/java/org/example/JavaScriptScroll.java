package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class JavaScriptScroll {

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

    public void pageDown() throws InterruptedException {

        //Initialization of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);

       // Scroll down by 1900 pixels
        js.executeScript("window.scrollBy(0,1900); ");
        Thread.sleep(2000);

        // Scroll up by 1900 pixels
        js.executeScript("window.scrollBy(0,-1700); ");
        Thread.sleep(2000);




    }// end of test annotation





}// end of class
