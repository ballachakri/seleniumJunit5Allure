package org.ecom.tests;

import io.qameta.allure.Feature;
import org.assertj.core.api.Assertions;
import org.ecom.Hooks.Hooks;
import org.ecom.pages.LoginPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("login")
public class LoginTests extends Hooks {

   LoginPage loginPage;

    @Test
    @Feature("User Login")
    @DisplayName("User login with valid credentials")
    public void userLogin() {
        loginPage = new LoginPage(driver);

        loginPage.clickMyAccountTab().clickMyLoginTab()
        .enterEmail("email123@email.com").enterPassword("Auto123@")
        .clickLoginButton();

        Assertions.assertThat(loginPage.returnAccountName()).isEqualToIgnoringCase("account");
    }
}
