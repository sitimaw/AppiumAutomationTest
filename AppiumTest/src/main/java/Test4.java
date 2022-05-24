import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class Test4 extends base{
    public static void main(String[] args) throws MalformedURLException {
        AndroidDriver<AndroidElement> driver = capabilities();

        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/firstOperand").sendKeys("100");
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/secondOperand").sendKeys("1");
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/kali").click();
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/secondOperand").sendKeys("2");
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/kali").click();
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/secondOperand").sendKeys("3");
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/kali").click();
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/secondOperand").sendKeys("4");
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/kali").click();
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/secondOperand").sendKeys("5");
        driver.findElementById("com.sitimawaddah.tugas1praktikum:id/kali").click();
    }
}
