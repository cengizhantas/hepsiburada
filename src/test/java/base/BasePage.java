package base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class BasePage
{
    protected AppiumDriver<?> driver;
    protected WebDriverWait wait;

    public BasePage(AppiumDriver<MobileElement> driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }

    protected WebElement findElement(By by)
    {
        return driver.findElement(by);
    }

    protected void clickElement(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).click();
    }


    protected void sendKeys(By by, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        findElement(by).clear();
        findElement(by).sendKeys(text);
    }

    protected void waitElementToBeClickable(By by)
    {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public String getText(By by, int... index)
    {
        return findElement(by).getText();
    }

    protected void assertText(By by, String text) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        System.out.println("Aranılan değer :" + text + " - Bulanan değer :" + getText(by));
        assertTrue("Verdiğiniz değer bulunan değeri içermiyor.", StringUtils.containsIgnoreCase(getText(by), (text)));
    }
}
