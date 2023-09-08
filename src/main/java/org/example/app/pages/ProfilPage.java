package org.example.app.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("org.example.app.pages.ProfilPage")
public class ProfilPage extends GeneralPage {

    @FindBy(xpath = "(//div[contains(@class,'card')])[1]//h5")
    private WebElementFacade namaAttribute;

    @FindBy(xpath = "(//div[contains(@class,'card')])[1]//p")
    private WebElementFacade pekerjaanAttribute;

    @FindBy(xpath = "(//div[@class='card-body']//p[contains(@class,'tx-medium')])")
    private List<WebElementFacade> listFeatureTitleAttribute;

    @FindBy(xpath = "//div[@class='card-body']//a[contains(@class,'btn-white')]")
    private List<WebElementFacade> listFeatureDetailButton;

    public String getNamaAttribute(){
        return namaAttribute.getText();
    }

    public String getPekerjaanAttribute(){
        return pekerjaanAttribute.getText();
    }

    public void clickBiodataDetailButton() {
        scrollToElement(listFeatureDetailButton.get(0));
        listFeatureDetailButton.get(0).click();
    }

    public void clickFamilyMemberDetailButton() {
        scrollToElement(listFeatureDetailButton.get(1));
        listFeatureDetailButton.get(1).click();
    }

    public void clickEducationalBackgroundDetailButton() {
        scrollToElement(listFeatureDetailButton.get(2));
        listFeatureDetailButton.get(2).click();
    }

    public List<String> getFeatureTitleAttribute() {
        scrollToElement(listFeatureTitleAttribute.get(0));
        return getTextListWebElement(listFeatureTitleAttribute);
    }
}
