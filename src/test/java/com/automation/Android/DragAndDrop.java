package com.automation.Android;

import com.automation.Pages.DragAndDropPage;
import com.automation.Pages.ViewPage;
import com.automation.utilities.Driver;
import io.appium.java_client.TouchAction;

import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.junit.Test;


import java.net.MalformedURLException;


public class DragAndDrop  {

    @Test
    public void dragDrop() throws MalformedURLException, InterruptedException {

        ViewPage viewPage = new ViewPage();
        viewPage.views.click();

        DragAndDropPage drag= new DragAndDropPage();
        drag.dragAndDrop.click();


        drag.dragAndDrop(drag.leftCircle,drag.rightCircle);

        Assert.assertEquals("Dropped!",drag.message.getText());

        Driver.closeDriver();
    }
}
