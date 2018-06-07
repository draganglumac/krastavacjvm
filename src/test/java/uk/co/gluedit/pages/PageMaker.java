package uk.co.gluedit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageMaker {

    private final WebDriver driver;

    public PageMaker(WebDriver driver) {
        this.driver = driver;
    }

    public <T> T make(Class<T> pageClass) {
        return PageFactory.initElements(driver, pageClass);
    }

}
