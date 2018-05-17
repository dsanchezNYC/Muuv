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
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBe;

import PageBlocks.LandingPage;
import PageBlocks.LoginPage;


public class stepDefinition {

    public static WebDriver driver;

    @Given("^I open Muuv$")
    public void i_open_Muuv() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "/Users/DSanchez/Documents/workspace/selenium/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://muuv.herokuapp.com/#/");

        WebDriverWait waitLogin= new WebDriverWait(driver, 10);
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
        LandingPage.SignUp(driver).click();

    }

    @When("^I click Log In$")
    public void i_click_Log_In() throws Throwable {
        WebDriverWait waitLogin= new WebDriverWait(driver, 10);
        waitLogin.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='login-root splash-login']")));
        //driver.findElement(By.xpath("//*[@class='login-root splash-login']")).click();
        LandingPage.LogIn(driver).click();
    }

    @Then("^I can view sign up modal")
    public void iCanViewSignUpModal() throws Throwable {
        WebDriverWait waitLogin= new WebDriverWait(driver, 10);
        waitLogin.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='signup-submit-button']")));
        if(driver.findElement(By.className("signup-submit-button")).isDisplayed() == false){
            System.out.print("Submit Modal not available.");
            Assert.fail();
        }
        driver.close();
        driver.quit();
    }

    @Then("^I can view log in page$")
    public void iCanViewLogInPage() throws Throwable {
        WebDriverWait waitLogin= new WebDriverWait(driver, 10);
        waitLogin.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='login-submit-button']")));
        if(driver.findElement(By.className("login-submit-button")).isDisplayed() == false){
            System.out.print("Submit Modal not available.");
            Assert.fail();
        }
        driver.close();
        driver.quit();
    }

    @When("^I use demo credentials$")
    public void i_use_demo_credentials() throws Throwable {
        WebDriverWait waitLogin= new WebDriverWait(driver, 10);
        waitLogin.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='demo-button']")));
        //driver.findElement(By.xpath("//button[@class='demo-button']")).click();
        LoginPage.DemoLogin(driver).click();
    }

    @Then("^I should be logged in successfully$")
    public void i_should_be_logged_in_successfully() throws Throwable {
        WebDriverWait waitLogin= new WebDriverWait(driver, 10);
        waitLogin.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='prof-pic']")));
        if(driver.findElement(By.className("logged-in-navbar")).isDisplayed() == false){
            Assert.fail();
        }
        driver.close();
        driver.quit();
    }

    @When("^I entered valid credentials$")
    public void i_entered_valid_credentials() throws Throwable {
        LoginPage.LoginUsername(driver).sendKeys("test@test.com");
        LoginPage.LoginPassword(driver).sendKeys("12345");
        LoginPage.LoginButton(driver).click();
    }

    @When("^I entered invalid credentials$")
    public void i_entered_invalid_credentials() throws Throwable {
        LoginPage.LoginUsername(driver).sendKeys("test@test.com");
        LoginPage.LoginPassword(driver).sendKeys("11111");
        LoginPage.LoginButton(driver).click();
    }

    @Then("^I should be not be logged in$")
    public void i_should_be_not_be_logged_in() throws Throwable {
        WebDriverWait waitLogin= new WebDriverWait(driver, 10);
        //waitLogin.until(textToBe(LoginPage.ErrorMessage(driver).,"The email or password did not match. Please try again");
        waitLogin.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='login-submit-button']")));
        String error;
        //error = driver.findElement(By.className("login-error")).getText();
        error = LoginPage.ErrorMessage(driver).getText();
        if(error != "The email or password did not match. Please try again"){
            Assert.fail();
        }
        driver.close();
        driver.quit();
    }



}
