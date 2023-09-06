package com.lambdatest.srp;

import com.lambdatest.base.BaseTest;
import com.lambdatest.mainpagecomponents.LambdaTestHomePage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass extends BaseTest {

    private LambdaTestHomePage lambdatestHomePage;

    @BeforeTest
    public void setupPages() {
        this.lambdatestHomePage = new LambdaTestHomePage(driver);
    }

    @Test
    public void Test1(){
        lambdatestHomePage.goTo();
        lambdatestHomePage.getNavigationBar().goToSearchField("Canon EOS 5D");
        lambdatestHomePage.getNavigationBar().clickOnSearchButton();
    }

    @Test
    public void Test2() throws InterruptedException {
        lambdatestHomePage.goTo();
        lambdatestHomePage.getNavigationBar().MyAccountLink();
        lambdatestHomePage.myAccountPage().loginfunctionality();
        //search the product
        lambdatestHomePage.getNavigationBar().goToSearchField("iPod Nano");
        lambdatestHomePage.getNavigationBar().clickOnSearchButton();
    }
}
