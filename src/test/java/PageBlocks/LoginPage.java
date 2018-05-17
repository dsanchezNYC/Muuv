package PageBlocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private static WebElement element = null;

    public static WebElement DemoLogin(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@class='demo-button']"));

        return element;
    }

    public static WebElement LoginUsername(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@class='login-input'][1]"));

        return element;
    }

    public static WebElement LoginPassword(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@class='login-input'][2]"));

        return element;
    }

    public static WebElement MuuvLogoHeader(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@class='header-link']"));

        return element;
    }

    public static WebElement LoginButton(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@class='login-submit-button']"));

        return element;
    }

    public static WebElement ErrorMessage(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@class='login-error']"));

        return element;
    }

    public static WebElement SplashHook(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@class='splash-hook']"));

        return element;
    }

    public static WebElement SplashTitle(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@class='splash-title']"));

        return element;
    }




}
