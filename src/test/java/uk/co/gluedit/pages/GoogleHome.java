package uk.co.gluedit.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHome {

    @FindBy(name = "q")
    WebElement searchBox;

    public void doSearch(String term) {
        searchBox.sendKeys(term);
        searchBox.sendKeys(Keys.RETURN);
    }
}
