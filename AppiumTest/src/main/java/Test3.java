import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class Test3 extends base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();

        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/firstOperand").sendKeys("9999");
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/secondOperand").sendKeys("0");
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/bagi").click();
    }
}
