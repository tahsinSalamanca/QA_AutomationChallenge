package com.automation.Android;

import com.automation.Pages.AppPage;
import com.automation.Pages.DragAndDropPage;
import org.junit.Test;

public class AddNewLanguage {

    @Test
    public void addTurkishLanguage() throws InterruptedException {
        AppPage appPage = new AppPage();

        appPage.app.click();

        appPage.actionBar.click();

        appPage.actionBProvider.click();

        appPage.settingActionProvider.click();

        appPage.setting.click();

        Thread.sleep(2000);

        appPage.scroll("Accessibility");

        appPage.languagesInput.click();

        appPage.languages.click();

        appPage.addLanguage.click();

        appPage.scroll("Türkçe");

        appPage.turkish.click();

        appPage.Turkey.click();

        Thread.sleep(1000);

        DragAndDropPage dragDrop = new DragAndDropPage();

        dragDrop.dragAndDrop(appPage.turkceCilick,appPage.moreOptions);




    }
}
