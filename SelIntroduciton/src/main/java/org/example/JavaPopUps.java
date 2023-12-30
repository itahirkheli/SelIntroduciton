package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaPopUps {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http:/rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();

        System.out.println(driver.switchTo().alert().getText());

        Thread.sleep(4000);

        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();

        System.out.println(driver.switchTo().alert().getText());

        Thread.sleep(4000);

        driver.switchTo().alert().dismiss();

        Thread.sleep(4000);

    }
}
