package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Iframe {

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

    public void iframeDemo() throws InterruptedException {

        Thread.sleep(5000);
        //Initialization of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);

        // Scroll down by 1900 pixels
        js.executeScript("window.scrollBy(0,600); ");
        Thread.sleep(2000);

        driver.switchTo().frame(0);
        Thread.sleep(2000);

        WebElement signinbutton = driver.findElement(By.xpath("//a[contains(text(),'Sign In')]"));
        signinbutton.click();
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        Thread.sleep(2000);


        WebElement bmw = driver.findElement(By.id("bmwcheck"));
        bmw.click();

    }// end of test annotation


}// end of class
