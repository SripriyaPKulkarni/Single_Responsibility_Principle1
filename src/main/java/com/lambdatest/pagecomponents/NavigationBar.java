package com.lambdatest.pagecomponents;

import com.lambdatest.components.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractComponent {

    public NavigationBar(WebDriver driver) {
        super(driver);

    }

    @FindBy(css = "div[id='entry_217822'] input[placeholder='Search For Products']")
    private WebElement searchfield;

    @FindBy(xpath = "//button[normalize-space()='Search']")
    private WebElement searchbutton;

    @FindBy(xpath = "//span[normalize-space()='Home']")
    private WebElement homebutton;

    @FindBy(xpath="//a[@role='button']//span[@class='title'][normalize-space()='My account']")
    private WebElement myAccountbutton;

    public void goToSearchField(String itemName ) {
        this.searchfield.sendKeys(itemName);
    }

    public void clickOnSearchButton() {
        this.searchbutton.click();
    }

    public void clickOnHomeButton() {
        this.homebutton.click();
    }

    public void MyAccountLink(){
        this.myAccountbutton.click();
    }

    @Override
    public boolean isDisplayed() {

        //expression using lambda
        return this.wait.until((d) ->this.searchfield.isDisplayed());
    }
}
