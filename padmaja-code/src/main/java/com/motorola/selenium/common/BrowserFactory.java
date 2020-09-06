package com.motorola.selenium.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

class BrowserFactory {
    static WebDriver getBrowser(String browserName) {
        WebDriver driver;
        if (browserName != null && browserName.equals("chrome")) {
            ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
            driver = new ChromeDriver();
        } else {
            FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }
}

