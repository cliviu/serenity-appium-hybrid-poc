package serenitybdd.appiumtest.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HybridAndroidAppPage extends PageObject {

    @AndroidFindBy(id="android:id/list")
    @iOSFindBy(id="android:id/list")
    private WebElement list;

    @FindBy(id="btnAdd")
    private WebElement btnAdd;

    @FindBy(id="btnToast")
    private WebElement btnToast;

    @FindBy(id="btnDeviceInfo")
    private WebElement btnDeviceInfo;

    @FindBy(id="btnUrl")
    private WebElement btnUrl;

    @FindBy(id="bookmark")
    private WebElement textField;


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