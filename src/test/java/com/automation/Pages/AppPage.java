package com.automation.Pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class AppPage extends BasePage{

    @AndroidFindBy(accessibility = "App")
    public WebElement app;

    @AndroidFindBy(accessibility = "Action Bar")
    public WebElement actionBar;

    @AndroidFindBy(accessibility = "Action Provider")
    public WebElement actionBProvider;

    @AndroidFindBy(accessibility = "Settings Action Provider")
    public WebElement settingActionProvider;

    @AndroidFindBy(id = "io.appium.android.apis:id/button")
    public WebElement setting;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout")
    public WebElement languagesInput;

    @AndroidFindBy(className = "android.widget.RelativeLayout")
    public WebElement languages;

    @AndroidFindBy(id = "com.android.settings:id/add_language")
    public WebElement addLanguage;

    @AndroidFindBy(accessibility = "Turkish")
    public WebElement turkish;

    @AndroidFindBy(accessibility = "Turkey")
    public WebElement Turkey;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"2, Turkish (Turkey)\"]/android.widget.ImageView")
    public WebElement turkceCilick;


    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[@content-desc=\"1, English (United States)\"]/android.widget.ImageView\n")
    public WebElement englishCilick;

    @AndroidFindBy(accessibility = "More options")
    public WebElement moreOptions;











}
