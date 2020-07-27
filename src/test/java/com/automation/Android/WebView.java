package com.automation.Android;

import com.automation.Pages.ViewPage;
import com.automation.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;

public class WebView {

    @Test
    public void webView() throws InterruptedException {

        ViewPage viewPage = new ViewPage();

        viewPage.views.click();

        viewPage.scroll("WebView");

        viewPage.webView.click();

        com.automation.Pages.WebViewPage web = new com.automation.Pages.WebViewPage();

        web.link.click();

        Assert.assertEquals("I am some other page content",web.webText.getAttribute("content-desc"));

        Driver.closeDriver();

    }

}
