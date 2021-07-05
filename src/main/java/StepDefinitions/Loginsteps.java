package StepDefinitions;

import io.cucumber.core.cli.Main;
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


public class Loginsteps {
    WebDriver driver;
    WebDriverWait wait;

    public Loginsteps()
    {
       // System.setProperty("webdriver.chrome.driver", "chromedriver2.exe");
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,20);
        wait.ignoring(WebDriverException.class);
        wait.ignoring(StaleElementReferenceException.class);
    }

    By inputEmail = By.id("email_create");
    By btnCreateAccount = By.xpath("//*[@id=\"SubmitCreate\"]");
    By textLogin = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span");
    By rbtGander = By.cssSelector(".account_creation .radio-inline:nth-child(3) [type]");
    By firstName = By.id("customer_firstname");
    By lastName = By.id("customer_lastname");


//    TC-RegisterWrongEmailFormat
    @Given("I go to Url1")
    public void I_go_to_Url1() throws InterruptedException {
        driver.manage().window().maximize();
       driver.get("http://103.226.139.66:8080/en/");
    }
    @When ("I input Email1")
    public void I_input_Email1() throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span")));
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("email_create")));
        driver.findElement(By.id("email_create")).sendKeys("as@c");
    }
    @And ("I click button submit3")
    public void I_click_button_submit3() throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SubmitCreate\"]")));
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
    }
    @Then  ("contain Home")
    public void contain_Home() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("create_account_error")));
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"create_account_error\"]/ol/li"), Pattern.compile("Invalid email address.")));
        System.out.println("TC-RegisterWrongEmailFormat Done");
    }


//    TC-RegisterEmptyEmail
    @Given ("I clock text login")
    public void I_clock_text_login() throws InterruptedException{
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span")));
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span")).click();
    }
    @When ("I click button submit2")
    public void I_click_button_submit2()throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SubmitCreate\"]")));
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
    }
    @Then  ("create account error1")
    public void create_account_error1()throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(By.id("create_account_error")));
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"create_account_error\"]/ol/li"), Pattern.compile("Invalid email address.")));
        System.out.println("TC-RegisterEmptyEmail Done");
    }

//    TC-RegisterRightEmailandDidn’t FillFullContentRequirements
    @Given  ("I input Email2")
    public void I_input_Email2()throws InterruptedException{
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span")));
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("email_create")));
        driver.findElement(By.id("email_create")).sendKeys("B@ik.com");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SubmitCreate\"]")));
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
        driver.findElement(By.id("id_gender1")).click();
        //driver.findElement(rbtGander).click();


        wait.until(ExpectedConditions.elementToBeClickable(By.id("customer_firstname")));
        driver.findElement(By.id("customer_firstname")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Will");


        wait.until(ExpectedConditions.elementToBeClickable(By.id("customer_lastname")));
        driver.findElement(By.id("customer_lastname")).click();
        driver.findElement(By.id("customer_lastname")).sendKeys("iam");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"days\"]/option[2]")));
        driver.findElement(By.xpath("//*[@id=\"days\"]/option[2]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"days\"]/option[6]")));
        driver.findElement(By.xpath("//*[@id=\"months\"]/option[6]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"days\"]/option[19]")));
        driver.findElement(By.xpath("//*[@id=\"years\"]/option[19]")).click();

       // wait.until(ExpectedConditions.elementToBeClickable(By.id("newsletter")));
        driver.findElement(By.id("newsletter")).click();

       // wait.until(ExpectedConditions.elementToBeClickable(By.id("optin")));
        driver.findElement(By.id("optin")).click();

//        wait.until(ExpectedConditions.elementToBeClickable(By.id("submitAccount")));
//        driver.findElement(By.id("submitAccount")).click();
    }

//    @When ("I click button submit1")
//    public void I_click_button_submit1()throws InterruptedException{
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SubmitCreate\"]")));
//        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
//    }
//    @And ("I click gander1")
//    public void I_click_gander1()throws InterruptedException{
//        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".account_creation .radio-inline:nth-child(3) [type]")));
//        driver.findElement(By.cssSelector(".account_creation .radio-inline:nth-child(3) [type]")).click();
//        driver.findElement(rbtGander).click();
//    }
//    @And ("I input fist name1")
//    public void I_input_fist_name1()throws InterruptedException{
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("customer_firstname")));
//        driver.findElement(By.id("customer_firstname")).click();
//        driver.findElement(By.id("customer_firstname")).sendKeys("Will");
//    }
//    @And ("I input last name2")
//    public void I_input_last_name2()throws InterruptedException{
//        wait.until(ExpectedConditions.elementToBeClickable(By.id("customer_lastname")));
//        driver.findElement(By.id("customer_lastname")).click();
//        driver.findElement(By.id("customer_lastname")).sendKeys("iam");
//
//    @And ("I click date1")
//    public void I_click_date1() throws InterruptedException{
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"days\"]/option[2]")));
//            driver.findElement(By.xpath("//*[@id=\"days\"]/option[2]")).click();
//    }
//    @And("I click month1")
//    public void I_click_month1()throws InterruptedException{
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"days\"]/option[6]")));
//            driver.findElement(By.xpath("//*[@id=\"days\"]/option[6]")).click();
//
//    }
//    @And ("I click year1")
//    public void I_click_year1()throws Throwable {
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"days\"]/option[19]")));
//            driver.findElement(By.xpath("//*[@id=\"days\"]/option[19]")).click();
//
//    }
//    @And ("I click News1")
//    public void I_click_News1()throws InterruptedException{
//            wait.until(ExpectedConditions.elementToBeClickable(By.id("newsletter")));
//            driver.findElement(By.id("newsletter")).click();
//
//    }
//    @And ("I click offers1")
//    public void I_click_offers1()throws InterruptedException{
//            wait.until(ExpectedConditions.elementToBeClickable(By.id("optin")));
//            driver.findElement(By.id("optin")).click();
//    }
    @When  ("I click button Register1")
    public void I_click_button_Register1()throws InterruptedException{
            wait.until(ExpectedConditions.elementToBeClickable(By.id("submitAccount")));
            driver.findElement(By.id("submitAccount")).click();

    }
    @Then  ("create account error5")
    public void create_account_error5() throws InterruptedException {
           // wait.until(ExpectedConditions.elementToBeClickable(By.id("alert alert-danger")));
           // wait.until(ExpectedConditions.textMatches(By.id("alert alert-danger"), Pattern.compile("There is 1 error")));
            wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"center_column\"]/div/ol/li"), Pattern.compile("passwd is required.")));
            System.out.println("TC-RegisterRightEmailandDidn’t FillFullContentRequirements Done");
        driver.close();
    }




//        TC-RegisterRightEmailandDidFillFullContentRequirements
    @Given  ("I input Email3")
    public void I_input_Email3()throws InterruptedException{
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span")));
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("email_create")));
        driver.findElement(By.id("email_create")).sendKeys("B@ik.com");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SubmitCreate\"]")));
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
        driver.findElement(By.id("id_gender1")).click();
        //driver.findElement(rbtGander).click();


        wait.until(ExpectedConditions.elementToBeClickable(By.id("customer_firstname")));
        driver.findElement(By.id("customer_firstname")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Will");


        wait.until(ExpectedConditions.elementToBeClickable(By.id("customer_lastname")));
        driver.findElement(By.id("customer_lastname")).click();
        driver.findElement(By.id("customer_lastname")).sendKeys("iam");


        wait.until(ExpectedConditions.elementToBeClickable(By.id("passwd")));
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("123123");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"days\"]/option[2]")));
        driver.findElement(By.xpath("//*[@id=\"days\"]/option[2]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"days\"]/option[6]")));
        driver.findElement(By.xpath("//*[@id=\"months\"]/option[6]")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"days\"]/option[19]")));
        driver.findElement(By.xpath("//*[@id=\"years\"]/option[19]")).click();

        // wait.until(ExpectedConditions.elementToBeClickable(By.id("newsletter")));
        driver.findElement(By.id("newsletter")).click();

        // wait.until(ExpectedConditions.elementToBeClickable(By.id("optin")));
        driver.findElement(By.id("optin")).click();
    }
//    @When ("I click button submit4")
//    public void I_click_button_submit4()throws Throwable {
//        driver.findElement(btnCreateAccount).click();
//    }
//    @And ("I click gander")
//    public void I_click_gander()throws InterruptedException{
//        driver.findElement(rbtGander).click();
//    }
//    @And ("I input fist name")
//    public void I_input_fist_name()throws InterruptedException{
//        driver.findElement(firstName ).sendKeys("Will");
//    }
//    @And ("I input last name")
//    public void I_input_last_name()throws InterruptedException{
//        driver.findElement(lastName ).sendKeys("iam");
//    }
//    @And ("I input password1")
//    public void I_input_password1()throws InterruptedException{
//    driver.findElement(By.id("passwd")).sendKeys("123654");
//    }
//    @And ("I click date")
//    public void I_click_date()throws InterruptedException{
//        driver.findElement(By.xpath("//*[@id=\"days\"]/option[2]")).click();
//    }
//    @And("I click month")
//    public void I_click_month()throws InterruptedException{
//        driver.findElement(By.xpath("//*[@id=\"months\"]/option[6]")).click();
//    }
//    @And ("I click year")
//    public void I_click_year()throws InterruptedException{
//        driver.findElement(By.xpath("//*[@id=\"years\"]/option[19]")).click();
//    }
//    @And ("I click News")
//    public void I_click_News(){
//        driver.findElement(By.id("newsletter")).click();
//    }
//    @And ("I click offers")
//    public void I_click_offers()throws InterruptedException{
//        driver.findElement(By.id("optin")).click();
//    }
    @When  ("I click button Register")
    public void I_click_button_Register()throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submitAccount")));
        driver.findElement(By.id("submitAccount")).click();
    }
    @Then  ("create account done")
    public void create_account_done() throws InterruptedException {
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"center_column\"]/p[2]"), Pattern.compile("Welcome to your account. Here you can manage all of your personal information and orders.")));
        System.out.println("TC-RegisterRightEmailandDidFillFullContentRequirements Done");
        driver.close();
    }

 //   TC-LoginWrongFormatEmail-Message_invalid_email_address
    @Given ("I go to Url2")
    public void I_go_to_Url2() throws InterruptedException {
        Thread.sleep(5000);
        driver.get("http://103.226.139.66:8080/en/login");
    }
    @When ("I input Email5")
    public void I_input_Email5()throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("as@e");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("passwd")));
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("12354");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitLogin")));
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then  ("Login account error4")
    public void create_account_error4() throws InterruptedException {
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("create_account_error")));
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"), Pattern.compile("Invalid email address.")));
//        Thread.sleep(2000);
//        boolean status5 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]")).isDisplayed();
//        System.out.println(status5);
    }


    //   TC-LoginWrongEmail-Message_authentication_failed
    @Given ("I go to Url3")
    public void I_go_to_Url3() throws InterruptedException {
        Thread.sleep(5000);
        driver.get("http://103.226.139.66:8080/en/login");
    }
    @When ("I input Email8")
    public void I_input_Email8()throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("as@e.com");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("passwd")));
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("12354");


            wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitLogin")));
            driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then  ("create account error8")
    public void create_account_error8() throws InterruptedException {
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"), Pattern.compile("Authentication failed.")));
    }

//    Scenario: C-LoginWrongPassword
   @Given ("I input Email7")
   public void I_input_Email7()throws InterruptedException{
       Thread.sleep(5000);
       driver.get("http://103.226.139.66:8080/en/login");
    }
    @When ("I input password7")
    public void I_input_password7()throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("as@z.com");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("passwd")));
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("12354");


        wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitLogin")));
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then  ("create account error7")
    public void create_account_error7() throws InterruptedException {
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li"), Pattern.compile("Authentication failed.")));
    }

//    TC-LoginRight
    @Given ("I input Email")
    public void I_input_Email()throws InterruptedException{
        Thread.sleep(5000);
        driver.get("http://103.226.139.66:8080/en/login");
    }
    @When ("I input password")
    public void I_input_password()throws InterruptedException{
        wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("as@e.com");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("passwd")));
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("123654");


        wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitLogin")));
        driver.findElement(By.id("SubmitLogin")).click();
    }

    @Then  ("login done")
    public void login_done()throws InterruptedException{
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"user_info_acc\"]/span[1]"), Pattern.compile("Will")));
    }
//    TC-Logout
    @Given ("I click user")
    public void I_click_user()throws InterruptedException{
        Thread.sleep(5000);
        driver.get("http://103.226.139.66:8080/en/login");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("email")));
        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("as@e.com");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("passwd")));
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("123654");


        wait.until(ExpectedConditions.elementToBeClickable(By.id("SubmitLogin")));
        driver.findElement(By.id("SubmitLogin")).click();

        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"user_info_acc\"]/span[1]"), Pattern.compile("Will")));

        wait.until(ExpectedConditions.elementToBeClickable(By.id("user_info_acc")));
        driver.findElement(By.id("user_info_acc")).click();

       }
    @Then  ("I click log out")
    public void I_click_log_out() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/ul/li[3]/a")));
          }
}
