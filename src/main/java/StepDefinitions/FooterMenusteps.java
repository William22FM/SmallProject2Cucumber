package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import io.cucumber.java.en.Given;
//import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class FooterMenusteps {

    WebDriver driver;
    WebDriverWait wait;

    public FooterMenusteps()
    {
        // System.setProperty("webdriver.chrome.driver", "chromedriver2.exe");
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,20);
        wait.ignoring(WebDriverException.class);
        wait.ignoring(StaleElementReferenceException.class);
    }

    //TC-Policies
    @Given("I click Policies")
    public void i_click_policies() {
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[title='Policies']")));
        driver.findElement(By.cssSelector("a[title='Policies']")).click();
    }

    @Then("contain Home1")
    public void contain_home1() {
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"center_column\"]/div/h2"), Pattern.compile("Policies")));
    }


//    TC-LegalNotice
    @Given("I click LegalNotice")
    public void i_click_legal_notice() {
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"footer\"]/div/div[4]/div/section/div[2]/ul/li[2]/a")));
        driver.findElement(By.xpath("//*[@id=\"footer\"]/div/div[4]/div/section/div[2]/ul/li[2]/a")).click();
    }

    @Then("contain Legal")
    public void contain_legal() {
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"center_column\"]/div/h2"), Pattern.compile("Legal")));
    }


//    TC-TermsandConditionsofUse
    @Given("I click TermsandConditionsofUse")
    public void i_click_termsand_conditionsof_use() {
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"footer\"]/div/div[4]/div/section/div[2]/ul/li[3]/a")));
        driver.findElement(By.xpath("//*[@id=\"footer\"]/div/div[4]/div/section/div[2]/ul/li[3]/a")).click();
    }

    @Then("contain Terms and conditions of use")
    public void contain_terms_and_conditions_of_use() {
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"center_column\"]/div/h1"), Pattern.compile("TERMS AND CONDITIONS OF USE")));
    }


//    TC-AboutUs
    @Given("I click AboutUs")
    public void i_click_about_us() {
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"footer\"]/div/div[4]/div/section/div[2]/ul/li[4]/a")));
        driver.findElement(By.xpath("//*[@id=\"footer\"]/div/div[4]/div/section/div[2]/ul/li[4]/a")).click();
    }

    @Then("contain About us")
    public void contain_about_us() {
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"center_column\"]/div/div/div[1]/div/h3"), Pattern.compile("OUR COMPANY")));
    }

//    TC-Payment
    @Given("I click Payment")
    public void i_click_payment() {
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"footer\"]/div/div[4]/div/section/div[2]/ul/li[5]/a")));
        driver.findElement(By.xpath("//*[@id=\"footer\"]/div/div[4]/div/section/div[2]/ul/li[5]/a")).click();
    }

    @Then("contain Secure payment")
    public void contain_secure_payment() {
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"center_column\"]/div/h2"), Pattern.compile("Secure payment")));
    }


//    TC-Language
    @Given("I click Language")
    public void i_click_language() {
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"languages-block-top\"]/div")));
        driver.findElement(By.xpath("//*[@id=\"languages-block-top\"]/div")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"first-languages\"]/li[2]/a")));
        driver.findElement(By.xpath("//*[@id=\"first-languages\"]/li[2]/a")).click();
    }

    @Then("contain Indonesia")
    public void contain_indonesia() {
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"languages-block-top\"]/div/span"), Pattern.compile("Indonesia")));
    }

}
