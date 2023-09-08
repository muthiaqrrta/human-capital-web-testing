package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.PortofolioPage")
public class PortofolioPage extends GeneralPage {

    @FindBy(xpath = "(//div[@class='media-body']//p[contains(@class,'tx-medium')])")
    private List<WebElementFacade> listFeatureTitleAttribute;

    public List<String> getFeatureTitleAttribute() {
        scrollToElement(listFeatureTitleAttribute.get(0));
        return getTextListWebElement(listFeatureTitleAttribute);
    }

    public void clickFeatureButton(String featureName) {
        for (WebElementFacade webElementFacade : listFeatureTitleAttribute) {
            if (webElementFacade.getText().contains(featureName)) {
                if (featureName.equals("Pengabdian Masyarakat") || featureName.equals("Pengelola Jurnal") ||
                        featureName.equals("Pengembangan Diri") || featureName.equals("Penghargaan") ||
                        featureName.equals("Riwayat Pekerjaan") || featureName.equals("Sertifikasi") ||
                        featureName.equals("Tes") || featureName.equals("Visiting Scientist")) {
                    scrollToBottomPage();
                }
                withAction().moveToElement(webElementFacade).click().build().perform();
                break;
            }
        }
    }
}