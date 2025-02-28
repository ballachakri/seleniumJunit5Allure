//package org.example.helpers;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.time.Duration;
//
//public class Helpers {
//
//    private static WebDriver driver = null;
//    private static Helpers helpers;
//
//    private Helpers() {
//        driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//    }
//
//    public static void openHomePage(String url) {
//        driver.get(url);
//    }
//
//    public static WebDriver getDriver() {
//        return driver;
//
//    }
//
//    public static void SetUpDriver() {
//        if (helpers == null) {
//            helpers = new Helpers();
//        }
//    }
//
//    public static void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//        helpers = null;
//    }
//
//}
