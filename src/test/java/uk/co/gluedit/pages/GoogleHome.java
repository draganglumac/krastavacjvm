package uk.co.gluedit.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.inject.Inject;

public class GoogleHome {

    @FindBy(name = "q")
    WebElement searchBox;

    public void doSearch(String term) {
        searchBox.sendKeys(term);
        searchBox.sendKeys(Keys.RETURN);
    }
}
