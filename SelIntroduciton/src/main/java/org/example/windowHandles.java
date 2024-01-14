package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandles {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.manage().window().maximize();

        Thread.sleep(5000);


        driver.findElement(By.cssSelector(".blinkingText")).click();


        Set<String> windows = driver.getWindowHandles();

        Iterator<String> it = windows.iterator();

        String parent = it.next();

        String child = it.next();

        driver.switchTo().window(child);

        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0]);
        String emailaddress = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];

        driver.switchTo().window(parent);

        driver.findElement(By.id("username")).sendKeys(emailaddress);


        Thread.sleep(5000);



    }
}

