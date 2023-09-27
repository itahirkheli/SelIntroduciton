package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {
    public static void main(String[] args) {

        //WebDriver driver = new ChromeDriver();

        //WebDriver driver = new FirefoxDriver();

        WebDriver driver = new EdgeDriver();

        driver.get("https://www.westernunionshop.com/v3/index.php");

        //driver.getTitle();

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        driver.quit();

       // driver.close();
    }
}