package com.motorola.selenium.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.motorola.selenium.common.Base;
import com.motorola.selenium.pageobject.HomePage;
import com.motorola.selenium.pageobject.SearchResultPage;

public class SearchTest extends Base {

    @Test
    public void searchDressAndValidateResults() {
        HomePage homePage = new HomePage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        homePage.loadHomePage();
        homePage.search("dress");

        boolean isDressDisplayed = searchResultPage.isResultItemDisplayed("Printed Chiffon Dress");
        assertTrue(isDressDisplayed);
    }
}
