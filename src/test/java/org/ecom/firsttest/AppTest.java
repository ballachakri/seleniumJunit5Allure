package org.ecom.firsttest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AppTest {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25000));
        driver.quit();
    }
}