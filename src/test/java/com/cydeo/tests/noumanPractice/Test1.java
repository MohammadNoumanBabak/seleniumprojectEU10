package com.cydeo.tests.noumanPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Test1 {
    public static void main(String[] args) throws InterruptedException {
       // WebDriver driver ;

        // basic configuration
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Util.webDriver();


        driver.get("https://www.google.com");
        WebElement acceptAll = driver.findElement(By.xpath("//button[@class='tHlp8d'][2]"));
        acceptAll.click();

        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        String expectedTitle = "Google";
        System.out.println("expectedTitle = " + expectedTitle);

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        String actualUrl=driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        String expectedUrl = "https://www.google.com/";
        System.out.println("expectedUrl = " + expectedUrl);

        if (actualUrl.equals(expectedUrl)){
            System.out.println("url test passed");
        }else {
            System.out.println("url test failed");
        }

        WebElement searchBox = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        searchBox.sendKeys(("amazon"));
        // searchBox.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();


        //Thread.sleep(3000);

        driver.close();


    }
}
