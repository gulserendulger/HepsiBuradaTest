package org.example;

import driver.Driver;
import org.junit.jupiter.api.Test;
import pages.GuestPage;
import pages.LoginPage;
import pages.MainPage;
import pages.ProductsPage;

public class HepsiBuradaTest extends Driver {

    GuestPage guestPage;
    LoginPage loginPage;
    MainPage  mainPage;
    ProductsPage productsPage;


    @Test
    public void test() throws InterruptedException {
        init();
        guestPage.controlGuestPage();
        guestPage.controlHover();
        loginPage.controlEmailPage();
        loginPage.loginGoogle();
        loginPage.controlGooglePage();
        loginPage.loginGooglePage();
        loginPage.loginPassword();
        loginPage.controlLoginPassword();
        mainPage.controlMainPage();
        mainPage.searchBoxClick();
        mainPage.controlSelectFilter();
        productsPage.controlSelectProducts();
        productsPage.controlAddToCart();
        productsPage.controlShoppingCart();
        productsPage.controlProductIncrease();
        productsPage.controlShoppingDone();

    }
    public void init(){

        guestPage=new GuestPage();
        loginPage=new LoginPage();
        mainPage =new MainPage();
        productsPage=new ProductsPage();
    }

}
