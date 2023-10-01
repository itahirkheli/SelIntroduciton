package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Locators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        driver.findElement(By.linkText("Forgot your password?")).click();

        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul");

        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("password123");

        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("07802639715");

        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();

    }
}
