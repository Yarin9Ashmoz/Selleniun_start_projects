package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.lang.System;

public class Selenium_calculator {

    static WebDriver browser;

    @Before
    public void setup() {

        System.setProperty("webdriver.gecko.driver", "/opt/homebrew/bin/geckodriver");
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("/Applications/Firefox.app/Contents/MacOS/firefox");

        browser = new FirefoxDriver(options);
        browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        String url = "https://testpages.eviltester.com/styled/apps/calculator.html";
        browser.get(url);

    }

    @Test
    public void TestsPlus1() {


        browser.findElement(By.id("button01")).click();
        browser.findElement(By.id("buttonplus")).click();
        browser.findElement(By.id("button02")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        browser.findElement(By.id("buttonequals")).click();
        System.out.println("Test plus button 1:");

        String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
        System.out.println(result);
        String Expected = "3";
        assertEquals(Expected, result);

    }

    @Test
    public void TestsPlus2() {


        browser.findElement(By.id("button05")).click();
        browser.findElement(By.id("buttonplus")).click();
        browser.findElement(By.id("button07")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        browser.findElement(By.id("buttonequals")).click();
        System.out.println("Test plus button 2: ");

        String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
        System.out.println(result);
        String Expected = "12";
        assertEquals(Expected, result);

    }

    @Test
    public void TestsMinus1() {

        browser.findElement(By.id("button09")).click();
        browser.findElement(By.id("buttonminus")).click();
        browser.findElement(By.id("button03")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        browser.findElement(By.id("buttonequals")).click();
        System.out.println("Test minus button 1: ");

        String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
        System.out.println(result);
        String Expected = "6";
        assertEquals(Expected, result);

    }

    @Test
    public void TestMinus2(){
        browser.findElement(By.id("button08")).click();
        browser.findElement(By.id("buttonminus")).click();
        browser.findElement(By.id("button07")).click();
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        browser.findElement(By.id("buttonequals")).click();
        System.out.println("Test minus button 2: ");

        String result = browser.findElement(By.id("calculated-display")).getAttribute(("value").toString());
        System.out.println(result);
        String Expected = "1";
        assertEquals(Expected, result);
    }

    @Test
    public void TestsMultiply1(){
        browser.findElement(By.id("button05")).click();
        browser.findElement(By.id("buttonmultiply")).click();
        browser.findElement(By.id("button04")).click();
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        browser.findElement(By.id("buttonequals")).click();
        System.out.println("Test multiply 1: ");
        String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
        System.out.println(result);
        String Expected = "20";
        assertEquals(Expected, result);
    }

    @Test
    public void TestMultiply2(){
        browser.findElement(By.id("button03")).click();
        browser.findElement(By.id("buttonmultiply")).click();
        browser.findElement(By.id("button00")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        browser.findElement(By.id("buttonequals")).click();
        System.out.println("Test multiply 2: ");
        String result = browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
        System.out.println(result);
        String Expected = "0";
        assertEquals(Expected, result);
    }

}// end of class