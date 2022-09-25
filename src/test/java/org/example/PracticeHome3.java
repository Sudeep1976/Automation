package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PracticeHome3 {

    public static WebDriver driver;

    @Before

    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.iceland.co.uk/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='header-search']")).sendKeys("Biscuits");

        driver.findElement(By.xpath("//body[1]/div[2]/header[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/button[1]")).click();


    }// end of before annotation

    @Test

    public void selectProduct() throws InterruptedException {

       // driver.navigate().to("https://www.iceland.co.uk/food-cupboard/biscuits-and-crackers");

        List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));

        driver.findElement(By.id("sticky-close")).click();

        for (WebElement product : products) {

            System.out.println(product.getText());


            if (product.getText().contains("Crawford's Custard Creams Sandwich Biscuits 300g")) {

                Thread.sleep(2000);

                //Initialization of JavascriptExecutor
                JavascriptExecutor js = (JavascriptExecutor) driver;
                Thread.sleep(2000);

                // Scroll down by 1900 pixels
                js.executeScript("window.scrollBy(0,600); ");
                Thread.sleep(2000);

                product.click();

            }

        }

    }// end of test annotation



}// end of class
