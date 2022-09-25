package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork {

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://www.iceland.co.uk/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='header-search']")).sendKeys("Biscuits");

        driver.findElement(By.xpath("//body[1]/div[2]/header[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/button[1]")).click();

        //driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='main']/div[2]/div[5]/div[2]/div[1]/ul[1]/li[5]/div[1]/div[3]/div[1]/a[1]")).click();

        driver.findElement(By.cssSelector("//span[contains(text(),'Cadbury Brunch Bar Raisin 5 Pack 160g')]\n")).click();


    }
}
class HomeWork1{

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.get("https://www.waitrose.com/");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/div[1]/section[1]/div[2]/button[1]")).click();


        driver.findElement(By.cssSelector("#searchTerm")).sendKeys("coffee");


        driver.findElement(By.xpath("//span[contains(text(),'Waitrose Italian Style Coffee Beans')]")).click();


    }

}
class HomeWork2{

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[2]/nav[1]/div[2]/ul[1]/li[3]/a[1]")).click();

        driver.findElement(By.xpath("//thead/tr[1]/th[2]/button[1]")).click();

        driver.findElement(By.xpath("//a[@id='enroll-button-top']")).click();

       driver.findElement(By.xpath("//body/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]/form[1]/div[1]/label[1]/div[1]/div[1]")).click();

        driver.findElement(By.xpath("//body/div[1]/div[1]/div[6]/div[2]/div[1]/div[1]/form[1]/div[1]/label[1]/div[3]/button[1]")).click();

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sudeep@gmail.com");

        driver.findElement(By.xpath("//input[@id='emailReceive']")).click();

        driver.findElement(By.xpath("//input[@id='cardName']")).sendKeys("Sudeep Kumar Jha");

        driver.findElement(By.xpath("//input[@id='cardName']")).sendKeys("4562 3456 7654 9876");

    }

}
class HomeWork3{

    public static void main(String[] args){

        WebDriverManager.chromedriver().setup();

        WebDriver driver =  new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

        driver.get("https://www.airvistara.com/gb/en");

        driver.manage().window().maximize();

       driver.findElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[1]/div[1]/button[1]/img[1]")).click();
      driver.findElement(By.xpath("//div[@id='header-dropdown']")).sendKeys("France");

      driver.findElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[2]/span[1]")).click();
     driver.findElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[2]/span[1]")).click();
      // driver.findElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]")).click();
       // driver.findElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]")).sendKeys("UK");
        //driver.findElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[1]")).click();
       // driver.findElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/span[2]/span[1]/img[1]")).click();

       // driver.findElement(By.xpath("//body/div[@id='page-wrapper']/div[@id='page']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/section[1]/div[1]/div[1]/div[1]/button[1]")).click();
       // driver.findElement(By.xpath("        driver.findElement(By.).getTagName();\n")).click();

       // driver.findElement(By.xpath("//div[@id='']")).click();
       // driver.findElement(By.xpath("//div[@id='modal-list-country']")).getText();
     //   driver.findElement(By.xpath("//input[@id='modal-sel-country']")).click();
       // driver.findElement(By.xpath("//button[@id='select-country-dropdown']")).click();
      //  driver.findElement(By.xpath("//button[@id='domain-done']")).click();
    }
}

