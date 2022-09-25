package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserInvoke {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

       driver.get("https://www.argos.co.uk/");


        driver.manage().window().maximize();

        driver.findElement(By.id("consent_prompt_submit")).click();

       // driver.findElement(By.id("searchTerm")).sendKeys("Nike");

        //driver.findElement(By.xpath("//header/div[3]/div[1]/div[2]/div[1]/form[1]/button[1]")).click();

        //driver.findElement(By.className("_2mKaC")).click();

       // driver.findElement(By.xpath("//span[contains(text(),'Account')]")).click();
    }

}
