package org.ecom.pages;

import io.qameta.allure.Step;
import org.ecom.Hooks.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    WebDriver driver;

    @FindBy(css = "a[title='My Account']")
    private WebElement myAccountTab;

    @FindBy(linkText = "Login")
    private WebElement loginTab;

    @FindBy(css = "input[name='email']")
    private WebElement emailTextField;

    @FindBy(css = "input[name='password']")
    private WebElement passwordTextField;

    @FindBy(css = "input[value='Login']")
    private WebElement loginButton;

    @FindBy(css = "#account-account > ul > li:nth-child(2) > a")
    private WebElement accountName;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @Step("Click my account tab")
    public LoginPage clickMyAccountTab() {
        myAccountTab.click();
        return this;
    }

    @Step("Click login tab")
    public LoginPage clickMyLoginTab() {
        loginTab.click();
        return this;
    }

    @Step("Enter user email '{0}'")
    public LoginPage enterEmail(String email) {
        emailTextField.sendKeys(email);
        return this;
    }

    @Step("Enter password '{0}'")
    public LoginPage enterPassword(String password) {
        passwordTextField.sendKeys(password);
        return this;
    }

    @Step("Click login")
    public LoginPage clickLoginButton() {
        loginButton.click();
        return this;
    }

    @Step("Return user account name")
    public String returnAccountName() {
        return accountName.getText();
    }

}
