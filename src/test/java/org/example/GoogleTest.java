package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleTest {

    @Test
    public void launch() throws MalformedURLException {

        DesiredCapabilities desired = new DesiredCapabilities();
        desired.setBrowserName("chrome");
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.10.189:4444"),desired);

        driver.get("https://www.google.com/");


    }
}
