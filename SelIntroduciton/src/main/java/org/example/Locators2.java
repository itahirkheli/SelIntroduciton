package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;
public class Locators2 {
    @Test
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String password= getPassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        //driver.findElement(By.cssSelector(".go-to-login-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement((By.tagName("p"))).getText());
        Assert.assertEquals(driver.findElement((By.tagName("p"))).getText(),"You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello rahul,");
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();

        driver.quit();
        System.out.println("Program has succeffully completed ");
    }

    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        driver.findElement(By.cssSelector("form p")).getText();
        String passwordText = driver.findElement(By.cssSelector("form p")).getText();

        String[] passwordArray = passwordText.split("'");
        String password = passwordArray[1].split("'")[0];

        return password;

    }
}
