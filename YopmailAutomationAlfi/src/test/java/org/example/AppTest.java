package org.example;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.Driver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

class AppTest {

    @Test
    public void TestCase1(){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://yopmail.com/en/");
        WebElement inputBar = driver.findElement(By.className("ycptinput"));
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(d -> inputBar.isDisplayed());
        inputBar.sendKeys("testing");

        driver.quit();

//        WebElement titleEmail = driver.findElement(By.className("bname"));
//        titleEmail.getText();


//        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
//        driver.getTitle();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
//
//        WebElement textBox = driver.findElement(By.name("my-text"));
//        WebElement submitButton = driver.findElement(By.cssSelector("button"));
//
//        textBox.sendKeys("Selenium");
//        submitButton.click();
//
//        WebElement message = driver.findElement(By.id("message"));
//        message.getText();
//
//        driver.quit();
    }

}