import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class basics extends base {
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();

        /*
         * Xpath
         * //tagname[@attribute='value']
         */

        driver.findElementByXPath("//android.widget.ImageButton[@text='']").click();

    }
}
