package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class ShoppingBasket {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();

        List<WebElement> marketProducts = driver.findElements(By.cssSelector("h4.product-name"));

        String[] shoppingBasket = {"Cucumber", "Beetroot","Carrot", "Tomato"};

        List<String> shoppingBasketList = Arrays.stream(shoppingBasket).toList();

        for (int i = 0; i < marketProducts.size(); i++) {

           // System.out.println(marketProducts.get(i).getText());

            String[] simpleProductName = marketProducts.get(i).getText().split("-");

           // System.out.println(shoppingBasketList.contains(simpleProductName[0].trim()));

            if (shoppingBasketList.contains(simpleProductName[0].trim()))
            {
                //System.out.println(marketProducts.contains(marketProducts.get(i).getText()));
                System.out.println(simpleProductName[0].trim() + " have found item from Market, addig it");
                Thread.sleep(2000);
                driver.findElements(By.xpath("(//div[@class='product-action']/button)")).get(i).click();
            }

        }

        Thread.sleep(2000);
    }
}
