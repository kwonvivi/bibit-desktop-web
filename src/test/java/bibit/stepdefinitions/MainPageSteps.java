package bibit.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.github.bonigarcia.wdm.WebDriverManager;
import bibit.pageobjects.Helper;
import bibit.pageobjects.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.cdimascio.dotenv.Dotenv;


public class MainPageSteps extends Helper {
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
        webDriver.findElement(By.xpath(MainPage.logo_landing_page)).isDisplayed();
    }

    @And("user click Log In menu")
    public void loginMenu() {
        webDriver.findElement(By.xpath(MainPage.login_menu)).click();
    }

    @When("user fill login form with valid data")
    public void loginForm() {
        webDriver.findElement(By.xpath(MainPage.username_field)).sendKeys(dotenv.get("USERNAME"));
        webDriver.findElement(By.xpath(MainPage.password_field)).sendKeys(dotenv.get("PASSWORD"));
        webDriver.findElement(By.xpath(MainPage.login_button)).click();
    }

    @When("user click Mulai Berinvestasi button")
    public void investasiButton() {
        webDriver.findElement(By.xpath(MainPage.mulai_investasi_button)).click();
    }

    @Then("the Register page will have displayed")
    public void validateRegisterPage() {
        webDriver.findElement(By.xpath(MainPage.register_by_email_button)).isDisplayed();
    }

    @Then("the user will redirect to user landing page")
    public void validateLandingPage() {
        webDriver.findElement(By.xpath(MainPage.user_landing_page)).isDisplayed();
    }

    @After
    public void shutDown() {

        webDriver.close();
    }
}
