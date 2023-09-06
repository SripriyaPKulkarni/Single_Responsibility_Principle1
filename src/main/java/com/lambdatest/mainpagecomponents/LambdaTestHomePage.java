package com.lambdatest.mainpagecomponents;

import com.lambdatest.pagecomponents.MyAccountPage;
import com.lambdatest.pagecomponents.NavigationBar;
import com.lambdatest.pagecomponents.SearchProduct;
import com.lambdatest.pagecomponents.SpecialLinkBar;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LambdaTestHomePage {

    private WebDriver driver;
    private SearchProduct searchProduct;
    private SpecialLinkBar specialLinkBar;
    private NavigationBar navigationBar;
    private MyAccountPage myAccountPage;


    public LambdaTestHomePage(final WebDriver driver){

        this.driver=driver;
        this.searchProduct= PageFactory.initElements(driver,SearchProduct.class);
        this.specialLinkBar= PageFactory.initElements(driver,SpecialLinkBar.class);
        this.navigationBar= PageFactory.initElements(driver,NavigationBar.class);
        this.myAccountPage=PageFactory.initElements(driver,MyAccountPage.class);


    }

    public void goTo() {
        this.driver.get("https://ecommerce-playground.lambdatest.io/");
    }

    public SearchProduct getSearchProduct() {
        return searchProduct;
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }

    public SpecialLinkBar getSpecialLinkBar() {
        return specialLinkBar;
    }

    public MyAccountPage myAccountPage(){
        return myAccountPage;
    }


}
