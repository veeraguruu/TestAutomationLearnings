package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGLearning {

    WebDriver driver;

    @BeforeSuite
    public void setUp() {

        //        System.setProperty("webdriver.chrome.driver", "D:\\seleniumdrivers\\chromedriver.exe");

        driver = new ChromeDriver();

        WebDriverManager.chromedriver().setup();

        driver.manage().window().maximize();
    }

    @Test(priority = -1)
    public void firstTest() {

        driver.get("http://www.google.com");
    }

    @Test(priority = 0, enabled = true)
    public void secondTest() {
        driver.get("http://www.youtube.com");
    }

    @Test(priority = 1, dependsOnMethods = {"firstTest", "secondTest"})
    public void thirdTest() {

        driver.get("http://www.facebook.com");
    }

    //    @Ignore
    @Test(priority = 2)
    public void fourthTest() {

        driver.get("http://www.instagram.com");
    }

    @AfterSuite
    public void tearDown() {

        driver.quit();
    }

}
