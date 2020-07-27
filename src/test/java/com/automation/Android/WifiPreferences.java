package com.automation.Android;


import com.automation.Pages.PrefenecesPage;
import com.automation.Pages.ViewPage;
import com.automation.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;

import java.net.MalformedURLException;


public class WifiPreferences {


    @Test
    public void wifiPrefences() throws MalformedURLException, InterruptedException {

        ViewPage viewPage = new ViewPage();
        viewPage.preference.click();


        viewPage.preDependencies.click();

        PrefenecesPage prefenecesPage = new PrefenecesPage();
        prefenecesPage.wifi.click();

        prefenecesPage.wifiSettings.click();


        String text = "text";
        prefenecesPage.settingText.sendKeys(text);



        prefenecesPage.okButton.click();
        Thread.sleep(1000);

        Assert.assertEquals("true",prefenecesPage.wifi.getAttribute("checked"));

        prefenecesPage.wifiSettings.click();
        Thread.sleep(1000);



        Assert.assertEquals(text,prefenecesPage.input.getText());

        Driver.closeDriver();


    }



}
