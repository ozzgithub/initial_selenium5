package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    // Singleton method only accept one instance variable create a one object

    private static WebDriver driver;

    private Driver() {}

    public static WebDriver getDriver() {
    if (driver == null) {
        System.setProperty("webdriver.chromedriver", "/Users/ozanatc/IdeaProjects/initial_selenium_project_5/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
        return driver;
    }


    public static void quitDriver() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }



}
