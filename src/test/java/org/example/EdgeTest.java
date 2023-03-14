package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class EdgeTest {
    @Test
    public void edgeTest() throws MalformedURLException {
        DesiredCapabilities d = new DesiredCapabilities();
        d.setBrowserName("MicrosoftEdge");
        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.10.189:4444"),d);

        driver.get("https://www.google.com/");
    }
}
