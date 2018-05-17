package PageBlocks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

        private static WebElement element = null;

    public static WebElement SignUp(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@class='signup-root']"));

        return element;
    }

    public static WebElement LogIn(WebDriver driver){

        element = driver.findElement(By.xpath("//*[@class='login-root splash-login']"));

        return element;
    }


}
