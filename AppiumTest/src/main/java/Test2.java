import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class Test2 extends base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();

        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/firstOperand").sendKeys("33");
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/secondOperand").sendKeys("77");
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/tambah").click();
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/kurang").click();
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/kali").click();
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/bagi").click();
    }
}
