package com.cydeo.tests.noumanPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CyberProject {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.google.com");
        WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf']"));
        Thread.sleep(5000);

        String title = driver.getTitle();
        System.out.println("title = " + title);

        driver.get("https://etsy.com");

        Thread.sleep(5000);
        String title2 = driver.getTitle();
        System.out.println("title2 = " + title2);

        Thread.sleep(3000);

        driver.navigate().back();

        String title3 = driver.getTitle();
        System.out.println("title3 = " + title3);

        if (title.equals(title3)){
            System.out.println("its correct");
        }else {
            System.out.println("its incorrect");
        }

        driver.navigate().forward();

        String title4 =driver.getTitle();
        System.out.println("title4 = " + title4);


        if (title2.equals(title4)){
            System.out.println("its correct");
        }else {
            System.out.println("its incorrect");

        }
    }
}
