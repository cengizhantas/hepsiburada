package test;

import base.BaseTest;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Test;
import page.MainPage;

public class HbDemoTest extends BaseTest
{
    @Test
    public void HepsiburadaTest() throws InterruptedException {
        MainPage mainPage = new MainPage((AppiumDriver<MobileElement>) driver);
        mainPage.deleteTask();
        mainPage.deleteTask();
        mainPage.addTask("Unit Test", "Unit Test Description");
        mainPage.addTask("Integration Test", "Integration Test Description");
        mainPage.addTask("Functional Test", "Functional Test Description");
        mainPage.addTask("Acceptance Test", "Acceptance Test Description");
        mainPage.seeTaskDescriptionAndDelete();
        mainPage.showIstatistics();
    }
}
