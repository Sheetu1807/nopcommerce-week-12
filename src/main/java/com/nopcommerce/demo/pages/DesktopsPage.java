package com.nopcommerce.demo.pages;

// 4. DesktopsPage - Desktops text, Sortby, Display, selectProductList Locators and it's actions.

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;


public class DesktopsPage extends Utility {
    By DesktopsText = By.xpath("//div[@class='page-title']");
    By Sortby = By.xpath("//div[@class='product-sorting']");
    By Display = By.xpath("//div[@class='product-page-size']");
    By ProductList = By.xpath("//div[@class='product-viewmode']");


    public static class DesktopPage {
    }

    public String Desktopstext() {
        return getTextFromElement(DesktopsText);
    }

    public String Sortby() {
        return getTextFromElement(Sortby);
    }

    public String Display() {
        return getTextFromElement(Display);
    }

    public String ProductList() {
        return getTextFromElement(ProductList);
    }

}