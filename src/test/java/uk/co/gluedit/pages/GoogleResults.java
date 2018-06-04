package uk.co.gluedit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class GoogleResults {

    @FindBy(partialLinkText = "Tesla")
    List<WebElement> results;

    public List<String> resultHeadings() {
        return results.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

    }
}
