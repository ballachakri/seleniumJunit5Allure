package org.ecom.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    WebDriver driver;

    @FindBy(css = "input[name='search']")
    private WebElement searchTextFiled;

    @FindBy(css = "div[class='product-thumb'] h4 a")
    private WebElement searchItemName;


    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @Step("Search item '{0}'")
    public SearchPage searchItem(String item) {
        searchTextFiled.sendKeys(item);
        return this;
    }

    @Step("Press enter")
    public SearchPage pressEnter() {
        searchTextFiled.sendKeys(Keys.ENTER);
        return this;
    }

    @Step("Return search item")
    public String getSearchItemName() {
        return searchItemName.getText();
    }
}
