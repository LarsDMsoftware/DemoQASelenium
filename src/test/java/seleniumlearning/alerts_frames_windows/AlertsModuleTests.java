package seleniumlearning.alerts_frames_windows;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import seleniumlearning.elements.WebTablesModule;

import static org.testng.AssertJUnit.*;

public class AlertsModuleTests {

    public static AlertsModule page;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        page = new AlertsModule(driver);
    }

    @Test
    public void testBasicAlertBtn()  {

        page.navigation();
        page.basicAlertBtn();
        page.acceptAlertBtnPress();
        page.close();

    }
    @Test
    public void testDelayedAlertBtn() {
        page.navigation();
        page.delayedAlertBtn();
        page.acceptDelayedAlertBtnPress();
        page.close();
    }
    @Test
    public void testConfirmAlertBtn_Accept()  {

        page.navigation();
        page.basicAlertBtn();
        page.acceptAlertBtnPress();
        assertEquals("You Selected Ok",page.returnAlertBtnSelection());
        page.close();

    }

    @Test
    public void testConfirmAlertBtn_Dismiss()  {

        page.navigation();
        page.basicAlertBtn();
        page.dismissAlertBtnPress();
        page.close();

    }
}
