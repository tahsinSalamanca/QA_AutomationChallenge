package com.automation.Android;

import com.automation.Pages.ExpandableListPage;
import com.automation.Pages.ViewPage;
import com.automation.utilities.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;
import java.time.Duration;


public class Contextual {



    @Test
    public void contextual() throws MalformedURLException, InterruptedException {

        ViewPage viewPage = new ViewPage();
         viewPage.views.click();

        viewPage.expandableLists.click();

        ExpandableListPage expandableListPage = new ExpandableListPage();
        expandableListPage.customAdapter.click();

        TouchAction touchAction = new TouchAction(Driver.get());

        WebElement peopleNames =expandableListPage.peopleNames;
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(peopleNames)).withDuration(Duration.ofSeconds(2))).perform();

        Thread.sleep(1000);

        expandableListPage.sampleMenu.click();

        Assert.assertEquals("People Names: Group 0 clicked",expandableListPage.ToastMessage.getText());

        Driver.closeDriver();
    }


}
