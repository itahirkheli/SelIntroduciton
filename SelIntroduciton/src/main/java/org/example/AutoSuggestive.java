package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class AutoSuggestive {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http:/rahulshettyacademy.com/dropdownsPractise");
        driver.manage().window().maximize();
        driver.findElement(By.id("autosuggest")).sendKeys("ind");

        Thread.sleep(3000);

        List<WebElement> Options =  driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for (WebElement option: Options)
        {
            if (option.getText().equalsIgnoreCase("India"))
            {
                option.click();
                System.out.println(option.getText());
                break;

            }
        }
        System.out.println("Out loop");
    Thread.sleep(4000);
    }
}
