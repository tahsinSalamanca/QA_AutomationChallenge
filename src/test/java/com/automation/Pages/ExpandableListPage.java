package com.automation.Pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ExpandableListPage extends BasePage {

    @AndroidFindBy(accessibility = "1. Custom Adapter")
     public WebElement customAdapter;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='People Names']")
    public WebElement peopleNames;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Sample action']")
    public WebElement sampleMenu;

    @AndroidFindBy(xpath = "//android.widget.Toast[1]")
    public WebElement ToastMessage;

}
