package serenitybdd.appiumtest.steps.serenity;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import serenitybdd.appiumtest.pages.HybridAndroidAppPage;

public class HybridAppSteps extends ScenarioSteps {

    HybridAndroidAppPage hybridAndroidAppPage;

    @Step
    public void add_list_item(String item) {
        hybridAndroidAppPage.addItem(item);
    }

    @Step
    public void list_should_be_visible() {
        hybridAndroidAppPage.list_should_be_visible();
    }
}
