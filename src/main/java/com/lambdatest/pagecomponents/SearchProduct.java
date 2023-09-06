package com.lambdatest.pagecomponents;


import com.lambdatest.components.AbstractComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchProduct extends AbstractComponent {




    @FindBy(css ="div[id='entry_217822'] input[placeholder='Search For Products']")
    private WebElement searchField;

    public SearchProduct(final WebDriver driver){
        super(driver);
    }

    public void searchField(String product_Name){

        this.searchField.sendKeys("Canon EOS 5D");
    }



    @Override
    public boolean isDisplayed() {
        this.wait.until(ExpectedConditions.visibilityOf(this.searchField));

        return this.searchField.isDisplayed();
    }
}
