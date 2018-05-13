package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.Assert.assertEquals;
import static org.assertj.core.api.Assertions.*;


public class stepDefinition {

    public static WebDriver driver;

    @Given("^I open Muuv$")
    public void i_open_Muuv() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "/Users/DSanchez/Documents/workspace/selenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://muuv.herokuapp.com/#/");

        WebDriverWait waitLogin= new WebDriverWait(driver, 10);
        //waitLogin.until(ExpectedConditions.elementToBeClickable(By.linkText("Sign Up")));
        waitLogin.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='signup-root']")));
    }

    @Then("^I should see landing page$")
    public void i_should_see_landing_page() throws Throwable {
        driver.findElement(By.xpath("//*[@class='signup-root']"));
        driver.findElement(By.xpath("//*[@class='login-root splash-login']"));
        driver.close();
        driver.quit();
    }

    @When("^I click Sign Up$")
    public void i_click_Sign_Up() throws Throwable {
        WebDriverWait waitLogin= new WebDriverWait(driver, 10);
        waitLogin.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='signup-root']")));
        driver.findElement(By.xpath("//*[@class='signup-root']")).click();
    }

    @When("^I click Log In$")
    public void i_click_Log_In() throws Throwable {
        WebDriverWait waitLogin= new WebDriverWait(driver, 10);
        waitLogin.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='login-root splash-login']")));
        driver.findElement(By.xpath("//*[@class='login-root splash-login']")).click();
    }

    @Then("^I can view sign up modal")
    public void iCanViewSignUpModal() throws Throwable {
        WebDriverWait waitLogin= new WebDriverWait(driver, 10);
        waitLogin.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='signup-submit-button']")));
        driver.close();
        driver.quit();
    }

    @Then("^I can view log in page$")
    public void iCanViewLogInPage() throws Throwable {
        WebDriverWait waitLogin= new WebDriverWait(driver, 10);
        waitLogin.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='login-submit-button']")));
        driver.close();
        driver.quit();
    }
}
