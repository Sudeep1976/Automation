package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calender {

    public static WebDriver driver;


    @Before

    public void setup() {

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // driver.get("https://letskodeit.teachable.com/");
        driver.get("https://www.southalltravel.co.uk/");


        driver.manage().window().maximize();


    } // end of before annotation

    @Test

    public void southallTravel() throws InterruptedException {

        WebElement Departingbox = driver.findElement(By.xpath("//input[@id='depdateit']"));
        Departingbox.click();
        Thread.sleep(5000);

        List<WebElement> dates = driver.findElements(By.cssSelector(".ui-state-default"));

        for (WebElement date : dates){


        System.out.println(date.getText());

            if(date.getText().contains("27")){
                date.click();
                break;

            }// end of if block

        }// end of foreach loop




    }// end of southhall test annotation



}// end of class
