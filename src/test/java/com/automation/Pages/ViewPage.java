package com.automation.Pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ViewPage extends BasePage{

    @AndroidFindBy(accessibility = "Preference")
    public WebElement preference;

    @AndroidFindBy(accessibility = "3. Preference dependencies")
    public WebElement preDependencies;

    @AndroidFindBy(accessibility = "WebView")
    public WebElement webView;

    @AndroidFindBy(accessibility = "Expandable Lists")
    public WebElement expandableLists;

}
