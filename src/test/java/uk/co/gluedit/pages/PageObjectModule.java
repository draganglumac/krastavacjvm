package uk.co.gluedit.pages;

import dagger.Module;
import dagger.Provides;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import javax.inject.Inject;

@Module
public class PageObjectModule {

    @Inject WebDriver driver;

    @Provides public GoogleHome provideGoogleHome() {
        return PageFactory.initElements(driver, GoogleHome.class);
    }

    @Provides public GoogleResults provideGoogleResults() {
        return PageFactory.initElements(driver, GoogleResults.class);
    }
}
