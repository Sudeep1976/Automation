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

public class PracticeHome1 {

    public static WebDriver driver;

    @Before

    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.southalltravel.co.uk/");
        driver.manage().window().maximize();

    }// end of before annotation

    @Test

    public void radioButtons(){

        List<WebElement> radiobuttons = driver.findElements(By.cssSelector("input[type=radio]"));

        for (WebElement radiobutton: radiobuttons) {

            System.out.println(radiobutton.getAttribute("value"));

            if (radiobutton.getAttribute("value").contains("multiway**")){

                radiobutton.click();

                Assert.assertTrue(radiobutton.isSelected());


            }// end of if block


        }// end of for block


    }// end of test annotation


}// end of class
