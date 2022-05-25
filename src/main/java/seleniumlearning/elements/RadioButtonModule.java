package seleniumlearning.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonModule {
    WebDriver driver;

    public RadioButtonModule(WebDriver driver){

        this.driver = driver;

    }

    public void navigation(){
        this.driver.get("https://demoqa.com/radio-button");
    }

    public void yesRadioBtn(){
        this.driver.findElement(By.xpath("//label[@for='yesRadio']")).click();

    }

    public void impressiveRadioBtn(){
        this.driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();

    }

    public void noRadioBtn(){
        this.driver.findElement(By.id("noRadio")).click();
    }

    public String returnRadioValue(){
        return this.driver.findElement(By.className("text-success")).getText();
    }
}
