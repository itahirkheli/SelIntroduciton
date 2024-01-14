package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.co.uk/");

        driver.manage().window().maximize();

        Actions a = new Actions(driver);

        WebElement signInElement = driver.findElement(By.cssSelector("a[title='My eBay']"));

        a.moveToElement(signInElement).build().perform();

        Thread.sleep(2000);

        WebElement searchAnythingElement = driver.findElement(By.xpath("(//input[@id='gh-ac'])[1]"));

        a.moveToElement(searchAnythingElement).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

        //driver.findElement(By.cssSelector("#gh-btn")).click();

        Thread.sleep(2000);

    }
}
