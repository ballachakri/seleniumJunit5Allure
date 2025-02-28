package org.ecom.Hooks;

import io.qameta.allure.Allure;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.time.Duration;
import java.util.Base64;
import java.util.Properties;

public class Hooks {

    public static WebDriver driver;
    static Properties properties=new Properties();
    private static String DEV_URL;

    @BeforeAll
    public static void setUpBrowser() throws IOException {
        properties.load(new FileInputStream("src/test/resources/test.properties"));
        DEV_URL= properties.getProperty("dev.url");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeEach
    public void openHomePage() {
        driver.get(DEV_URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @AfterEach
    public void tearDown() {
        String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
        byte[] img = Base64.getDecoder().decode(screenshotBase64);
        InputStream is = new ByteArrayInputStream(img);
        Allure.attachment("Screenshot", is);
        driver.quit();
    }
}
