package com.lambdatest.pagecomponents;

import com.lambdatest.components.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SpecialLinkBar extends AbstractComponent {



    @FindBy(xpath = "//ul[@class='navbar-nav horizontal']//span[@class='title'][normalize-space()='Special']")
    private WebElement specialbutton;

    public SpecialLinkBar(final WebDriver driver){
       super(driver);
    }
    public void clickOnSpecialButton() {
        this.specialbutton.click();
    }
    @Override
    public boolean isDisplayed() {
        this.wait.until(ExpectedConditions.visibilityOf(this.specialbutton));

        return this.specialbutton.isDisplayed();
    }
}
