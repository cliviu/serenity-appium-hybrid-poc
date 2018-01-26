package serenitybdd.appiumtest.pages;

import io.appium.java_client.pagefactory.*;
import net.serenitybdd.core.pages.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

public class HybridAndroidAppPage extends PageObject {

    @AndroidFindBy(id="android:id/list")
    @iOSFindBy(id="android:id/list")
    private WebElementFacade list;

    @FindBy(id="btnAdd")
    private WebElementFacade btnAdd;

    @FindBy(id="btnToast")
    private WebElementFacade btnToast;

    @FindBy(id="btnDeviceInfo")
    private WebElementFacade btnDeviceInfo;

    @FindBy(id="btnUrl")
    private WebElementFacade btnUrl;

    @FindBy(id="bookmark")
    private WebElementFacade textField;


    public void addItem(String text){
        waitFor(textField);
        textField.sendKeys(text);
        btnAdd.click();
    }

    public HybridAndroidAppPage(WebDriver driver) {
        super(driver);
    }

    public void list_should_be_visible() {
        waitFor(list);
    }
}