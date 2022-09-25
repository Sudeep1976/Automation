package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class PracticeHome2 {

    public static WebDriver driver;

    @Before

    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.airvistara.com/gb/en");
        driver.manage().window().maximize();

    }// end of before annotation

    @Test

    public void dropDown(){

        WebElement dropDown1 = driver.findElement(By.name("country"));

        Select sel = new Select(dropDown1);

        sel.selectByIndex(5);


    }// end of test annotation




}// end of class
