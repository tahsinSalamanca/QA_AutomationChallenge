package com.automation.Pages;

import com.automation.utilities.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;

public class DragAndDropPage extends BasePage {

    @AndroidFindBy(accessibility = "Drag and Drop")
    public WebElement dragAndDrop;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_1")
    public WebElement leftCircle;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_2")
    public WebElement rightCircle;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_result_text")
    public WebElement message;




    public void dragAndDrop(WebElement source, WebElement target) throws InterruptedException {

        TouchAction touchAction = new TouchAction(Driver.get());

        touchAction.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(source))).moveTo(ElementOption.element(target)).release().perform();
    }
}
