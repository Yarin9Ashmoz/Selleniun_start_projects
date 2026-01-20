package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.Select;

public class SelleninumTesting_2 {

    static WebDriver browser;

    @Before
    public void setup() {

        System.setProperty("webdriver.gecko.driver", "/opt/homebrew/bin/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("/Applications/Firefox.app/Contents/MacOS/firefox");
        browser = new FirefoxDriver(options);
        browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        browser.get("https://testpages.eviltester.com/apps/7-char-val/");

    }

//    @Test
//    public void Tests1() {
//
//
//        WebElement textBox = browser.findElement(By.id("firstname"));
//        textBox.sendKeys("chaya");
//        textBox = browser.findElement(By.id("surname"));
//        textBox.sendKeys("Zilberstein");
//        textBox = browser.findElement(By.id("age"));
//        textBox.sendKeys("21");
//        Select drpCountry = new Select(browser.findElement(By.name("country")));
//        drpCountry.selectByVisibleText("Israel");
//        String currentPage = browser.getCurrentUrl();
//        browser.findElement(By.cssSelector("input[type='submit']")).click();
//        String newPage = browser.getCurrentUrl();
//        assertNotEquals(currentPage, newPage);
//    }

    @Test
    public void testShortPassword(){
        WebElement textBox = browser.findElement(By.name("characters"));
        textBox.sendKeys("abcde");
        browser.findElement(By.name("validate")).click();
        String result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
        System.out.println(result);
        String Expected = "Invalid Value";
        assertEquals(Expected, result);
    }

    @Test
    public void testValidLength(){
        WebElement textBox = browser.findElement(By.name("characters"));
        textBox.sendKeys("Abc123*");
        browser.findElement(By.name("validate")).click();
        String result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
        System.out.println(result);
        String Expected = "Valid Value";
        assertEquals(Expected, result);
    }

    @Test
    public void testLongPassword(){
        WebElement textBox = browser.findElement(By.name("characters"));
        textBox.sendKeys("Abc12345"); // 5 long string
        browser.findElement(By.name("validate")).click();
        String result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
        System.out.println(result);
        String Expected = "Invalid Value";
        assertEquals(Expected, result);
    }

    @Test
    public void testValidCharacters(){
        WebElement textBox = browser.findElement(By.name("characters"));
        textBox.sendKeys("Abc12*Z"); // 5 long string
        browser.findElement(By.name("validate")).click();
        String result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
        System.out.println(result);
        String Expected = "Valid Value";
        assertEquals(Expected, result);
    }

    @Test
    public void testInvalidCharacters(){
        WebElement textBox = browser.findElement(By.name("characters"));
        textBox.sendKeys("Abc12$Z"); // 5 long string
        browser.findElement(By.name("validate")).click();
        String result = browser.findElement(By.name("validation_message")).getAttribute("value").toString();
        System.out.println(result);
        String Expected = "Invalid Value";
        assertEquals(Expected, result);
    }

}// end of class
