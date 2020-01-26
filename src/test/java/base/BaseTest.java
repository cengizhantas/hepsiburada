package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest
{
    public static RemoteWebDriver driver;

    private DesiredCapabilities capabilities;
    public String samsungJ7_UDID = "5203f159b2aec401";

    @Before
    public void setUp() throws MalformedURLException {
        URL localhub = new URL("http://127.0.0.1:4723/wd/hub");
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator");
        capabilities.setCapability("appPackage", "com.example.android.architecture.blueprints.master");
        capabilities.setCapability("appActivity", "com.example.android.architecture.blueprints.todoapp.tasks.TasksActivity");
        capabilities.setCapability("udid", samsungJ7_UDID);
        capabilities.setCapability("unicodeKeyboard", true);
        capabilities.setCapability("resetKeyboard", true);
        driver = new AndroidDriver(localhub, capabilities);
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}
