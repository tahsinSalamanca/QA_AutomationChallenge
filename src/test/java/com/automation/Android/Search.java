package com.automation.Android;

import com.automation.Pages.SearchPage;
import com.automation.Pages.ViewPage;
import com.automation.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import java.net.MalformedURLException;

public class Search  {

    @Test
    public void search() throws MalformedURLException, InterruptedException {
        ViewPage viewPage = new ViewPage();
        viewPage.views.click();

        viewPage.scroll("Search View");


        SearchPage searchPage = new SearchPage();
        searchPage.search.click();

        searchPage.filter.click();

        searchPage.srcText.sendKeys("Colby");

        Assert.assertEquals("Colby",searchPage.text1.getText());

        Driver.closeDriver();

    }
}
