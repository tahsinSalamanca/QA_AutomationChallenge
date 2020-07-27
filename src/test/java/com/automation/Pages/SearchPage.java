package com.automation.Pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {

    @AndroidFindBy(accessibility = "Search View")
    public WebElement search;

    @AndroidFindBy(accessibility = "Filter")
    public WebElement filter;

    @AndroidFindBy(id = "android:id/search_src_text")
    public WebElement srcText;

    @AndroidFindBy(id = "android:id/text1")
    public WebElement text1;

}
