package com.automation.utilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver() {
    }
    private static AndroidDriver<AndroidElement> driver;

    public static AndroidDriver<AndroidElement> get(){
        if (driver==null){
            String platform = ConfigurationReader.get("platform");

            switch (platform){
                case "android":
                    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                    desiredCapabilities.setCapability("platformName", "Android");
                    desiredCapabilities.setCapability("platformVersion", "7.0");
                    desiredCapabilities.setCapability("deviceName", "Pixel_2");
                    desiredCapabilities.setCapability("automationName", "UiAutomator2");
                    desiredCapabilities.setCapability("app", System.getProperty("user.dir")+"\\src\\test\\resources\\apidemos.apk");
                    try {
                        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
                        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    }catch (MalformedURLException e){
                        e.printStackTrace();
                    }
                 break;
            }
        }
        return driver;
    }

    public static void closeDriver() {
       if (driver!=null){
           driver.quit();
           driver=null;
       }
    }
}