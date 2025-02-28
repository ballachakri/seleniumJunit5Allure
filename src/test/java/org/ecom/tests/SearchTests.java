package org.ecom.tests;

import io.qameta.allure.Feature;
import org.assertj.core.api.Assertions;
import org.ecom.Hooks.Hooks;
import org.ecom.pages.SearchPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SearchTests extends Hooks {

    SearchPage searchPage;

    @Test
    @Feature("Search item")
    @DisplayName("User search iphone")
    public void search() {
        searchPage = new SearchPage(driver);

        searchPage.searchItem("Iphone").pressEnter();

        Assertions.assertThat(searchPage.getSearchItemName()).isEqualToIgnoringCase("iphone");
    }

}
