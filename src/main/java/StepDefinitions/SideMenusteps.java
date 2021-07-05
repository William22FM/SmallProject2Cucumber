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

public class SideMenusteps {

    WebDriver driver;
    WebDriverWait wait;

    public SideMenusteps()
    {
        // System.setProperty("webdriver.chrome.driver", "chromedriver2.exe");
        driver = Hooks.driver;
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,20);
        wait.ignoring(WebDriverException.class);
        wait.ignoring(StaleElementReferenceException.class);
    }

//    TC-ClickMenu
    @Given("I click Menu")
    public void i_click_menu() {
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")));
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();
        
    }

    @Then("contain Home2")
    public void contain_Home2() {
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[1]/a"), Pattern.compile("Home")));
        
    }


//    TC-ClickInterior
    @Given("I click text Interior")
    public void i_click_text_interior() {
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")));
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[2]/a")));
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[2]/a")).click();
    }

    @Then("contain Interior")
    public void contain_interior() {
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"hotelInteriorBlock\"]/div/div[1]/div/p[1]"), Pattern.compile("Interior")));
    }


//    TC-ClickAmenties
    @Given("I click text Amenties")
    public void i_click_text_amenties() {
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")));
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[3]/a")));
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[3]/a")).click();
    }

    @Then("contain Amenties")
    public void contain_amenties() {
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"hotelAmenitiesBlock\"]/div/div[1]/div/p[2]"), Pattern.compile("Families travelling with kids will find Amboseli national park a safari destination matched to no other, with less tourist traffic, breathtaking open space.")));
    }


//    TC-ClickRooms
    @Given("I click text Rooms")
    public void i_click_text_rooms() {
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")));
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[4]/a")));
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[4]/a")).click();
    }

    @Then("contain Our Rooms")
    public void contain_our_rooms() {
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"hotelRoomsBlock\"]/div/div[1]/div/p[1]"), Pattern.compile("Our Rooms")));
    }


//    TC-ClickTestimonial
    @Given("I click text Testimonial")
    public void i_click_text_testimonial() {
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")));
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[5]/a")));
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[5]/a")).click();
    }

    @Then("contain What Our Guest Say")
    public void contain_what_our_guest_say() {
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"hotelTestimonialBlock\"]/div/div[1]/div/p[2]"), Pattern.compile("Fap put a bird on it next level, sustainable disrupt polaroid flannel Helvetica Kickstarter quinoa bicycle rights narwhal wolf Fap put a bird on it next level.")));
    }


//    TC-ClickLegalNotice
    @Given("I click text LegalNotice1")
    public void i_click_text_LegalNnotice1() {
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")));
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[6]/a")));
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[6]/a")).click();
    }
    @Then("contain Legal1")
    public void contain_Legal1() {
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"center_column\"]/div/h2"), Pattern.compile("Legal")));
    }


//    TC-ClickAbout
    @Given("I click text About1")
    public void i_click_text_about1() {
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")));
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[7]/a")));
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[7]/a")).click();
    }
    @Then("contain About us1")
    public void contain_About_us1() {
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"center_column\"]/div/div/div[1]/div/h3"), Pattern.compile("OUR COMPANY")));
    }


//    TC-ClickContact
    @Given("I click text Contact")
    public void i_click_text_contact() {
        driver.manage().window().maximize();
        driver.get("http://103.226.139.66:8080/en/");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")));
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[2]/button")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[8]/a")));
        driver.findElement(By.xpath("//*[@id=\"menu_cont\"]/div/div/div[2]/ul[1]/li[8]/a")).click();
    }

    @Then("contain Contact Us")
    public void contain_contact_us() {
        wait.until(ExpectedConditions.textMatches(By.xpath("//*[@id=\"center_column\"]/div/div[1]/p[1]"), Pattern.compile("Contact Us")));
    }

}
