package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class ValidatingIFUIElementIsDisabled {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http:/rahulshettyacademy.com/dropdownsPractise");
        driver.manage().window().maximize();

        System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));

        driver.findElement(By.cssSelector("label[for='ctl00_mainContent_rbtnl_Trip_1']")).click();

        System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));

        if (driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("1"))
        {
            System.out.println("It is enabled");
            Assert.assertTrue(true);
        }
        else
        {
            System.out.println("It is not enabled");
            Assert.assertTrue(false);
        }

        Thread.sleep(4000);

    }
}
