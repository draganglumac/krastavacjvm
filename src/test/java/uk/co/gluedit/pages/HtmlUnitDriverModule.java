package uk.co.gluedit.pages;

import dagger.Module;
import dagger.Provides;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

@Module
public class HtmlUnitDriverModule {

    @Provides
    HtmlUnitDriver provideDriver() {
        new HtmlUnitDriver();
    }
}
