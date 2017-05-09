import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import org.openqa.selenium.WebElement;

/**
 * Simple test on Android device using sample calculator application. Capacities and URL must be adapted:
 * see README.md to find out where to find the specific values for your test on your dashboard.
 * If you want to refer to specific elements of the app (like "buttonOne" in this example),
 * you need to install Appium-Desktop (https://github.com/appium/appium-desktop)
 * and use the Appium inspector to find the element id. The parameters to specify on the Appium-Desktop are the same
 * than those you specify here.
 *
 */

public class TestCalculator {
    public AppiumDriver driver;
    WebElement buttonOne;

    @BeforeTest
    public void setup() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        /* These are the capabilities we must provide to run our test on TestObject */
        capabilities.setCapability("deviceName", "PASTE_DEVICE_NAME");
        capabilities.setCapability("testobject_api_key", "PASTE_API_KEY");



        /* Check your Basic Setup page to find the URL that corresponds to your device */
        URL appiumURL = new URL("PASTE_URL");

        driver = new AndroidDriver(appiumURL, capabilities);


        /* Use the Appium Inspector to find the resource id of the element */
        buttonOne  = driver.findElementById("PASTE_ELEMENT_ID");

    }

    /* In this test, we simply press the button "1"*/
    @Test
    public void test() {
        buttonOne.click();

    }

    /* We disable the driver after EACH test has been executed. */
    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
