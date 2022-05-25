package seleniumlearning.elements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class RadioButtonModuleTests {

    public ChromeDriver setup() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        return driver;

    }

    @Test
    public void yesRadioButtonCheck() {

        ChromeDriver testDriver = setup();
        RadioButtonModule page = new RadioButtonModule(testDriver);

        page.navigation();
        page.yesRadioBtn();
        assertEquals("Yes",page.returnRadioValue());
        testDriver.quit();
    }

    @Test
    public void impressiveRadioButtonCheck() {

        ChromeDriver testDriver = setup();
        RadioButtonModule page = new RadioButtonModule(testDriver);

        page.navigation();
        page.impressiveRadioBtn();
        assertEquals("Impressive", page.returnRadioValue());
        testDriver.quit();
    }


}
