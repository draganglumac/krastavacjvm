package uk.co.gluedit.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class GoogleResults {

    @FindBy(tagName = "a")
    List<WebElement> results;

    public List<String> resultHeadings() {
        return results.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

    }
}
