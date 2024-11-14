package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGParallelTesting {

    WebDriver driver;

    @Test
    public void firstTest() {
        driver = new ChromeDriver();

        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();

        driver.get("http://www.google.com");
    }

    @Test
    public void secondTest() {

        driver = new ChromeDriver();

        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();

        driver.get("http://www.youtube.com");
    }

}
