package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class NavigatePages {

    public  static WebDriver driver;

    @Before

    public void setup(){

        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // driver.get("https://letskodeit.teachable.com/");
        driver.get("https://courses.letskodeit.com/practice");


        driver.manage().window().maximize();

    }//Before annotation end

    @Test

    public void navigatePages() throws InterruptedException {


       // String CurrentTitle = driver.getTitle();
       // System.out.println(CurrentTitle);

       String CurrentURL = driver.getCurrentUrl();
       System.out.println(CurrentURL);
        // Assert.assertThat(CurrentURL, Matchers.containsString("https://letskodeit.teachable.com/"));
       // Assert.assertEquals(CurrentURL, "https://letskodeit.teachable.com/");
        Thread.sleep(5000);

        driver.navigate().to("https://letskodeit.teachable.com/p/practice");

        Thread.sleep(5000);

        driver.navigate().back();
        Thread.sleep(5000);

        driver.navigate().forward();


    }// test annotation end

    @After

    public void tearDown(){

        driver.quit();

    }






} //end of class




