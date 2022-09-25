package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AutoComplete {

    public static WebDriver driver;

    @Before

    public void setup() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // driver.get("https://letskodeit.teachable.com/");
        driver.get("https://www.southalltravel.co.uk/?gclid=CjwKCAjw4JWZBhApEiwAtJUN0ABcR9DjOUWOI9WvZFcmdjVa6TKkxEARXnYLrx1jQPtgQNmrHyQRNhoC0R0QAvD_BwE");


        driver.manage().window().maximize();



    } // end of before annotation

    @Test

    public void autoCompleteDemo() throws InterruptedException {


        WebElement leavingfrombox = driver.findElement(By.xpath("//input[@id='DestinationFrom1']"));

       // System.out.println(leavingfrombox.isEnabled());

        Assert.assertTrue(leavingfrombox.isEnabled());
        leavingfrombox.sendKeys("Lon");


        Thread.sleep(5000);

        List<WebElement> destinations = driver.findElements(By.cssSelector(".ui-menu-item"));

        for (WebElement destination : destinations){

            System.out.println(destination.getText());

            if (destination.getText().contains("London Stansted (STN), UK")){

                destination.click();


            }// end of if loop

        }// end of for loop



    }// end of test annotation



}// end of class
