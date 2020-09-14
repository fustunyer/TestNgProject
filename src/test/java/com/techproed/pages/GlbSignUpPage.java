package com.techproed.pages;

import com.techproed.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GlbSignUpPage {
    public GlbSignUpPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (id = "email")
    public WebElement emailKutusu;
    @FindBy(id = "name")
    public WebElement name;

    @FindBy(id = "mobile")
    public WebElement mobile;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "re_password")
    public WebElement re_password;

    @FindBy(name = "submit")
    public WebElement signUpButonu;

    @FindBy(xpath = "//div[@class='alert alert-success!']")
    public  WebElement successYazisi;

}
