package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

@Component("org.example.app.pages.HeaderPage")
public class HeaderPage extends GeneralPage {

    @FindBy(xpath = "//div[contains(@class,'dropdown-profile')]//a[@class='dropdown-link']")
    private WebElementFacade userIcon;

    @FindBy(xpath = "//div[contains(@class,'dropdown-menu')]//div[@class='media-body']//p[1]")
    private WebElementFacade nameAttribute;

    @FindBy(xpath = "//header//a//p[contains(@class,'tx-medium')]")
    private WebElementFacade webNameAttribute;

    public void clickUserIcon() {
        userIcon.click();
    }

    public String getNameAttribute(){
        return nameAttribute.getText();
    }

    public String getWebNameAttribute(){
        return webNameAttribute.getText();
    }
}