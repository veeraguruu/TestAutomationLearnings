package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

    public static void main(String[] args) throws InterruptedException {

//        System.setProperty("webdriver.chrome.driver", "D:\\seleniumdrivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        WebDriverManager.chromedriver().setup();

        driver.get("http://www.google.co.in");
        driver.findElement(By.name("q")).sendKeys("Veeraguru\n");

    }

}
