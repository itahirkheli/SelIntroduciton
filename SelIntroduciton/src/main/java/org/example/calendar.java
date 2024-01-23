package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class calendar {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companion/");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        WebElement element = driver.findElement(By.cssSelector("#form-field-travel_comp_date"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        driver.findElement(By.cssSelector("#form-field-travel_comp_date")).click();

        Thread.sleep(3000);

        String monthName = driver.findElement(By.cssSelector("[class='flatpickr-current-month']")).getText();


         while (!driver.findElement(By.cssSelector("[class='flatpickr-current-month']")).getText().contains("April"))
         {
             System.out.println(driver.findElement(By.cssSelector("[class='flatpickr-current-month']")).getText());

             driver.findElement(By.cssSelector("[class='flatpickr-month'] [class='flatpickr-next-month']")).click();

             Thread.sleep(3000);
         }

        List<WebElement> days =  driver.findElements(By.cssSelector("[class='dayContainer'] [class='flatpickr-day ']"));

        for (int i = 0; i < driver.findElements(By.cssSelector("[class='dayContainer'] [class='flatpickr-day ']")).size(); i++) {

            if (driver.findElements(By.cssSelector("[class='dayContainer'] [class='flatpickr-day ']")).get(i).getText().contains("1")) {
                driver.findElements(By.cssSelector("[class='dayContainer'] [class='flatpickr-day ']")).get(i).click();
                break;
            }
        }

        //[class='flatpickr-month'] [class='flatpickr-next-month']

        Thread.sleep(3000);
        driver.quit();
    }
}
