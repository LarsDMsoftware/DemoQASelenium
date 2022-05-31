package seleniumlearning.alerts_frames_windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsModule {

    WebDriver driver;

    public AlertsModule(WebDriver driver){

        this.driver = driver;

    }

    public void basicAlertBtn(){
        this.driver.findElement(By.id("alertButton")).click();
    }

    public void delayedAlertBtn(){
        this.driver.findElement(By.id("timerAlertButton")).click();
    }

    public void confirmAlertBtn(){
        this.driver.findElement(By.id("confirmButton")).click();
    }

    public void promptAlertBtn(){
        this.driver.findElement(By.id("confirmButton")).click();
    }

    public void acceptAlertBtnPress(){
        this.driver.findElement(By.xpath("//*[text()='Ok']"));
    }

    public void declineAlertBtnPress(){

    }




}
