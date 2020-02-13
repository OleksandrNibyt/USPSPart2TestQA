package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class UspsHome extends Page {
    public UspsHome(){
        url = "https://www.usps.com/";
    }

    //@FindBy(xpath = "//a[@data-gtm-section='quicktools'][text()='Stamps & Supplies']")
    @FindBy(xpath = "//h3[@class='d-none d-lg-block d-xl-block']")
    private WebElement stamps;

    @FindBy(xpath = "//div[contains(@class,'premium')]//a[@data-gtm-label='order-now']")
    private WebElement boxes;

    @FindBy(name = "navpostalstore")
    private WebElement postalstore;

    @FindBy(id="mail-ship-width")
    private WebElement mailandship;

    @FindBy(xpath = "//li[@class='tool-cns']//a[contains(text(),'Click-N-Ship')]")
    private WebElement clicknship;

    @FindBy(id="btn-submit")
    private WebElement signinbutton;

    @FindBy(id = "error-username")
    private WebElement emailrequired;

    @FindBy(id= "error-password")
    private WebElement passwordrequired;

    @FindBy(id="sign-up-button")
    private WebElement signupnowbutton;

    @FindBy(xpath = "//strong[contains(text(),'Enter Your Username and Password')]")
    private WebElement message;

    public void clickStamps(){

        stamps.click();
    }

    public void clickBoxes() {
        boxes.click();
    }

    public void clickPostalStore(){
        postalstore.click();
    }

    public void menuitems(){
        new Actions(getDriver()).moveToElement(mailandship).moveToElement(clicknship).click().perform();

    }

    public void signIn()  {
        signinbutton.click();

    }

    public void verifySignIn(){
        assertThat(message.isDisplayed());
        assertThat(emailrequired.isDisplayed());
        assertThat(passwordrequired.isDisplayed());

    }

    public void signUpNow(){
        assertThat(signupnowbutton.isDisplayed());
    }






}
