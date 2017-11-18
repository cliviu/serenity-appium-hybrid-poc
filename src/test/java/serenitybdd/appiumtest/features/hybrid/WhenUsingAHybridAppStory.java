package serenitybdd.appiumtest.features.hybrid;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenitybdd.appiumtest.steps.serenity.HybridAppSteps;

@RunWith(SerenityRunner.class)
public class WhenUsingAHybridAppStory {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public HybridAppSteps appSteps;

    @Test
    public void adding_an_item_in_the_list_should_show_the_list() {
        appSteps.add_list_item("Item1");
        appSteps.list_should_be_visible();
    }
} 