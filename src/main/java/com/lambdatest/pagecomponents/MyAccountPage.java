package com.lambdatest.pagecomponents;

import com.lambdatest.components.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends AbstractComponent {


    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@id='input-email']")
    private WebElement enterEmailId;

    @FindBy(xpath = "//input[@id='input-password']")
    private WebElement enterPassword;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement clickOnLogin;





    public void loginfunctionality() {
        this.enterEmailId.sendKeys("kankanaads@gmail.com");
        this.enterPassword.sendKeys("123456");
        this.clickOnLogin.click();

    }

    @Override
    public boolean isDisplayed() {
        //expression using lambda
        return this.wait.until((d) ->this.enterEmailId.isDisplayed());
    }
}
