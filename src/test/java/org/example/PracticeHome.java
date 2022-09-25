package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PracticeHome {

    public WebDriver driver;

    @Before

    public  void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        driver.get("https://www.southalltravel.co.uk/");
        driver.manage().window().maximize();



    }// end of before annotations

    @Test

    public void navigatePages() throws InterruptedException {

        // String CurrentURL = driver.getCurrentUrl();
        //  System.out.println(CurrentURL);

        String CurrentTitle = driver.getTitle();
        System.out.println(CurrentTitle);

        Thread.sleep(5000);

        // driver.navigate().to("https://www.southalltravel.co.uk/flights/");
        //  Thread.sleep(5000);

        //  driver.navigate().back();
        // Thread.sleep(5000);

        //  driver.navigate().forward();
        //  Thread.sleep(5000);

    } // end of test annotation

        @Test

        public void radioButtons() {
        List<WebElement> radiobuttons = driver.findElements(By.cssSelector("input[type=radio]"));

        for (WebElement radiobutton : radiobuttons) {

            System.out.println(radiobutton.getAttribute("value"));

            if (radiobutton.getAttribute("value").contains("returnWay")) ;
            radiobutton.click();
        }
        }

    }// end of test annotation


  //  @After

  //  public void TearDown(){

     //   driver.quit();


 //  }// end of after annotation




