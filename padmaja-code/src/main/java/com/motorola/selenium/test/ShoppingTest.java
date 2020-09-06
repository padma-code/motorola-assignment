package com.motorola.selenium.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.motorola.selenium.common.Base;
import com.motorola.selenium.pageobject.CategoryPage;
import com.motorola.selenium.pageobject.CheckoutPage;
import com.motorola.selenium.pageobject.HomePage;
import com.motorola.selenium.pageobject.ProductDetailPage;
import com.motorola.selenium.pageobject.SubCategoryPage;

public class ShoppingTest extends Base {

    @Test
    public void addShortsToCartValidatePriceAndCleanCart() throws Exception {
        HomePage homePage = new HomePage(driver);
        CategoryPage categoryPage = new CategoryPage(driver);
        SubCategoryPage subCategoryPage = new SubCategoryPage(driver);
        ProductDetailPage productDetailPage = new ProductDetailPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        homePage.loadHomePage();
        homePage.goToWomenSubcategory();

        categoryPage.goToTopSubCategory();

        String productName = "Faded Short Sleeve T-shirts";
        subCategoryPage.goToProductDetails(productName);

        productDetailPage.addProductToCart();
        String totalPrice = checkoutPage.getTotalPrice();
        assertEquals("$18.51", totalPrice);

        checkoutPage.cleanShoppingCart();
        boolean isCartEmpty = checkoutPage.isShoppingCartEmpty();
        assertTrue(isCartEmpty);
    }
}
