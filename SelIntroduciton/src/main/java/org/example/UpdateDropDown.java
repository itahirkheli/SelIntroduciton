package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDropDown
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http:/rahulshettyacademy.com/dropdownsPractise");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000L);

        for (int i = 0; i < 4; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();//5 adults
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(2000L);
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
        driver.quit();
    }
}
