package bibit.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import bibit.pageobjects.Helper;
import bibit.pageobjects.SubmitFormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.cdimascio.dotenv.Dotenv;


public class SubmitFormSteps extends Helper {
    public static final Dotenv dotenv = Dotenv.load();

    public static WebDriver webDriver;
    @Before
    public void setupWebDriver() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }
    @Given("user is on home page")
    public void homePage() {
        webDriver.get(dotenv.get("BASE_URL"));
        webDriver.findElement(By.xpath(SubmitFormPage.logo_landing_page)).isDisplayed();
    }

    @When("user fill login form with valid data")
    public void loginForm() {
        webDriver.findElement(By.xpath(SubmitFormPage.username_field)).sendKeys(dotenv.get("USERNAME"));
        webDriver.findElement(By.xpath(SubmitFormPage.password_field)).sendKeys(dotenv.get("PASSWORD"));
        webDriver.findElement(By.xpath(SubmitFormPage.login_button)).click();
    }

    @When("user click Mulai Berinvestasi button")
    public void submitForm() {
        webDriver.findElement(By.xpath(SubmitFormPage.mulai_investasi_button)).click();
        webDriver.findElement(By.xpath(SubmitFormPage.register_by_email_button)).isDisplayed();
    }

//    @Then("the form has successfully submitted")
//    public void validateSuccessfullySubmit() {
//        webDriver.findElement(By.xpath(SubmitFormPage.success_message)).isDisplayed();
//    }
//
//    @Then("the error message will has displayed")
//    public void validateErrorMessage() {
//        webDriver.findElement(By.xpath(SubmitFormPage.error_message)).isDisplayed();
//    }

    @After
    public void shutDown() {
        webDriver.close();
    }
}
