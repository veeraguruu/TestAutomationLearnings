package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HyperLinks {

    WebDriver driver;

//    @BeforeTest
    @BeforeMethod
    public void setUp() {
        //        System.setProperty("webdriver.chrome.driver", "D:\\seleniumdrivers\\chromedriver.exe");

        driver = new ChromeDriver();

        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();
    }

    @Test
    public void hyperLinks() {


        String leafGround = TestEnvironment.getUrl("leafground");
        driver.get(leafGround);
        driver.findElement(By.linkText("Go to Dashboard")).click();
        driver.quit();
    }

    @Test
    public void hyperLinks2() {

        driver.get("http://www.google.com");

    }

}
