package com.nopcommerce.demo.pages;
/* 6.RegisterPage - Register Text, male female radio, Firstname, lastname, Date of Birth drop-downs, email,
Password, Confirm Password, Register Button, "First name is required.","Last name is required.",
"Email is required.","Password is required.", "Password is required." error message,
"Your registration completed" message, "CONTINUE" button
Locators and it's actions
 */

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By RegisterLink = By.className("ico-register");
    By RegisterButton = By.id("register-button");
    By ErrorFirstname = By.id("FirstName-error");
    By ErrorLastname = By.id("LastName-error");
    By ErrorEmail = By.id("Email-error");
    By ErrorPassword = By.id("Password-error");
    By ErrorConfirmPassword = By.id("ConfirmPassword-error");
    By Genderfemale = By.xpath("//input[@id='gender-female']");
    By FirstnameField = By.id("FirstName");
    By LastnameField = By.id("LastName");
    By Day = By.name("DateOfBirthDay");
    By MonthD = By.name("DateOfBirthMonth");
    By Year = By.name("DateOfBirthYear");
    By Email = By.id("Email");
    By Password = By.id("Password");
    By ConfirmPassword = By.id("ConfirmPassword");
    By Registermsg = By.xpath("//div[(text()='Your registration completed')]");


    public void VerifyRegisterLink() {
        clickOnElement(RegisterLink);
    }

    public void ClickonRegisterButton() {
        this.clickOnElement(this.RegisterButton);
    }

    public String VerifyFirstnameError() {
        return getTextFromElement(ErrorFirstname);
    }

    public String VerifyLastnameError() {
        return getTextFromElement(ErrorLastname);
    }

    public String VerifyEmailError() {
        return getTextFromElement(ErrorEmail);
    }

    public String VerifyPasswordError() {
        return getTextFromElement(ErrorPassword);
    }

    public String VerifyConfirmPasswordError() {
        return getTextFromElement(ErrorConfirmPassword);
    }

    public void Clickonfemale() {
        this.clickOnElement(this.Genderfemale);
    }

    public void EnterFirstname(String Firstn) {

        sendTextToElement(FirstnameField, Firstn);
    }

    public void EnterLastname(String Lastn) {

        sendTextToElement(LastnameField, Lastn);
    }

    public void SelectDay(String day) {
        selectByValueFromDropDown(Day, day);
    }

    public void SelectMonth(String month) {
        selectByValueFromDropDown(MonthD, month);
    }

    public void SelectYear(String year) {
        selectByValueFromDropDown(Year, year);
    }

    public void EnterEmail(String email) {

        sendTextToElement(Email, email);
    }

    public void EnterPassword(String pass) {

        sendTextToElement(Password, pass);
    }

    public void EnterConfirmPassword(String confirmp) {

        sendTextToElement(ConfirmPassword, confirmp);
    }

    public String VerifyRegisterSuccessfullMsg() {
        return getTextFromElement(Registermsg);
    }
}