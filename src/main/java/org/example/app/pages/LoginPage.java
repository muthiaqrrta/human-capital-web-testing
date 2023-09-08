package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

@Component("org.example.app.pages.LoginPage")
public class LoginPage extends GeneralPage {

    @FindBy(xpath = "//input[@id='username']")
    private WebElementFacade myITSIDForm;

    @FindBy(xpath = "//input[@id='password']")
    private WebElementFacade kataSandiForm;

    @FindBy(xpath = "//button[@id='continue']")
    private WebElementFacade nextButton;

    @FindBy(xpath = "//button[@id='login']")
    private WebElementFacade loginButton;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElementFacade alertMessageAttribute;

    public void fillMyitsId(String id) {
        myITSIDForm.type(id);
        nextButton.click();
    }

    public void fillKataSandi(String kataSandi) {
        kataSandiForm.type(kataSandi);
    }

    public void submit() {
        loginButton.click();
        waitABit(5000);
    }

    public boolean isAlertMessageVisible() {
        return alertMessageAttribute.isVisible();
    }
}
