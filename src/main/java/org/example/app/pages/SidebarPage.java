package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.SidebarPage")
public class SidebarPage extends GeneralPage {

    @FindBy(xpath = "//ul[@class='sidebar-nav']//li")
    private List<WebElementFacade> navigationPage;

    @FindBy(xpath = "(//a[@href='https://dev-humancapital.its.ac.id/portofolio'])[2]")
    private WebElementFacade menuPortofolio;

    @FindBy(xpath = "(//a[@href='https://dev-humancapital.its.ac.id/profil'])[2]")
    private WebElementFacade menuProfil;

    public void navigateToPage(String pageName) {
        for (WebElementFacade webElementFacade : navigationPage) {
            if (webElementFacade.getText().contains(pageName)) {
                withAction().moveToElement(webElementFacade).click().build().perform();
                if (!pageName.equals("Beranda")) {
                    waitABit(2000);
                }
                break;
            }
        }
    }

    public void navigateToPortofolio() {
        menuPortofolio.waitUntilVisible().click();
        waitABit(2000);
    }

    public void navigateToProfil() {
        menuProfil.waitUntilVisible().click();
        waitABit(2000);
    }
}
