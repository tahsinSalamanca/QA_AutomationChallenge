package com.automation.Pages;

import com.automation.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    @AndroidFindBy(accessibility = "Views")
    public WebElement views;


    public void scroll(String text){
        Driver.get().findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));");
    }



  public BasePage(){
      PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
  }
}
