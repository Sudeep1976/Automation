package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown {


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

    public void selectExample() throws InterruptedException {

        WebElement dropDownbox = driver.findElement(By.xpath("//select[@id='carselect']"));

        Select sel = new Select(dropDownbox);

       sel.selectByIndex(0);
        Thread.sleep(5000);
        sel.selectByIndex(1);
        Thread.sleep(5000);
        sel.selectByIndex(2);


      /*  sel.selectByValue("bmw");
        sel.selectByValue("benz");
        sel.selectByValue("honda"); */

//        sel.selectByVisibleText("BMW");
      //  sel.selectByVisibleText("Benz");
   //     sel.selectByVisibleText("Honda");


    }// end of selectexample annotation

    @Test

    public void multipleSelectOptions(){

        WebElement multipleSelectbox = driver.findElement(By.xpath("//select[@id='multiple-select-example']"));

         Select sel1 = new Select(multipleSelectbox);

        sel1.selectByIndex(0);
        sel1.selectByIndex(1);
        sel1.selectByIndex(2);

        //List<WebElement> options = sel1.getAllSelectedOptions();
        List<WebElement> options =  sel1.getOptions();

        for (WebElement option : options){
            System.out.println(option.getText());
        }




    }// end of multipleselect annotation


}//end of class
