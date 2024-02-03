package org.example.tests;

import org.example.pages.EmailPage;
import org.example.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest{

    HomePage homePage;
    EmailPage emailPage;

    @BeforeMethod
    public void setUpPage(){
        homePage = new HomePage(driver);
        emailPage = new EmailPage(driver);
    }

    @AfterMethod
    public void backPage(){
        driver.get("https://yopmail.com/en/");
    }

    @Test
    public void searchEmailAddress(){
        homePage.inputOnSearchBar("Testing");
        String actual = emailPage.getEmailTitle();
        Assert.assertEquals(actual,"testing@yopmail.com");
    }

//    @Test
//    public void searchEmailAddress2(){
//        homePage.inputOnSearchBar("Testing2");
//        Assert.assertEquals(emailPage.getEmailTitle(),"testing2@yopmail.com");
//    }
}
