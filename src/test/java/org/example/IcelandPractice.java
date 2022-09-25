package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class IcelandPractice {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

         driver.get("https://www.iceland.co.uk/");

         driver.findElement(By.xpath("//input[@id='header-search']")).sendKeys("Biscuits");

         driver.findElement(By.xpath("//body[1]/div[2]/header[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/button[1]")).click();

    }
}
