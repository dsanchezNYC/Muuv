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

    public static WebElement SignUpUsername(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@class='signup-input'][1]"));

        return element;
    }

    public static WebElement SignUpPassword(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@class='signup-input'][2]"));

        return element;
    }

    public static WebElement SignUpShowPassword(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@class='password']"));

        return element;
    }

    public static WebElement EmailError(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@class='email-error']"));

        return element;
    }

    public static WebElement PasswordError(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@class='password-error']"));

        return element;
    }

}
