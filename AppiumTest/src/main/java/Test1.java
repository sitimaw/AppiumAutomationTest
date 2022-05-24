import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class Test1 extends base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();

        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/firstOperand").sendKeys("11");
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/secondOperand").sendKeys("22");
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/tambah").click();
    }
}
