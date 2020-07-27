package com.automation.Pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class WebViewPage extends BasePage{

    @AndroidFindBy(accessibility = "i am a link")
    public WebElement link;

    @AndroidFindBy(accessibility = "I am some other page content")
    public WebElement webText;
}
