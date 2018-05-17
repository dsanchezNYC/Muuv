package PageBlocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpModal {

    private static WebElement element = null;

    public static WebElement SignUpButton(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@class='signup-submit-button']"));

        return element;
    }
}
