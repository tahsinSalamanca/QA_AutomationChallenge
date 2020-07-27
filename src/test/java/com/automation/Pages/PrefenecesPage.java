package com.automation.Pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class PrefenecesPage extends BasePage {

    @AndroidFindBy(id = "android:id/checkbox")
    public WebElement wifi;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.TextView\n")
    public WebElement wifiSettings;

    @AndroidFindBy(id = "android:id/edit")
    public WebElement settingText;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement okButton;

    @AndroidFindBy(id = "android:id/edit")
    public WebElement input;
}
