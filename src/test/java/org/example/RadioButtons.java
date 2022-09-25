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

public class RadioButtons {

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

    public void clickingRadioButton(){

       // List<WebElement> radiobuttons = driver.findElements(By.cssSelector("input[type=radio]"));

        List<WebElement> radiobuttons = driver.findElements(By.cssSelector("input[type=radio]"));

        for (WebElement radiobutton : radiobuttons){

            System.out.println(radiobutton.getAttribute("value"));

            if(radiobutton.getAttribute("value").contains("benz")){

               radiobutton.click();

              // System.out.println(radiobutton.isSelected());

               Assert.assertTrue(radiobutton.isSelected());

            }// end of if block

        }// for each loop ends

    }// end of test annotation of clickingRadioButtons

    @Test

    public void clickingMultipleCheckBoxes(){

        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type=checkbox]"));

        for (WebElement checkbox : checkboxes){

            System.out.println(checkbox.getAttribute("value"));

            if(checkbox.getAttribute("value").contains("benz")){

                checkbox.click();

            }// end of if block


        }// end of for each loop


    }// end of test clicking multiplecheckboxes







    }// End of class
